import java.util.*;

public class Traductor {

    private final List<Define> defines = new ArrayList<>();
    private final List<DecFun> decfuns = new ArrayList<>();
    private final List<Funcion> funciones = new ArrayList<>();
    private final List<Procedimiento> procedimientos = new ArrayList<>();

    private final Map<String, List<Parametro>> prototiposInterface = new HashMap<>();
    private final Set<String> subprogramasInexistentes = new HashSet<>();
    private final Set<String> variablesGlobales = new HashSet<>();

    private final Contexto contexto = new Contexto();
    private boolean hayErroresSemanticos = false;
    private List<VariableDecl> mainVars = new ArrayList<>();
    private String mainCodigo = "";

    // ★ NUEVO — Registro de subprogramas declarados
    private final Set<String> funcionesDeclaradas = new HashSet<>();
    private final Set<String> procedimientosDeclarados = new HashSet<>();

    // ★ NUEVO — Comprobaciones diferidas
    private final List<Runnable> comprobacionesPendientes = new ArrayList<>();

    public Traductor() {}

    public Contexto getContexto() {
        return contexto;
    }

    public boolean hayErrores() {
        return hayErroresSemanticos;
    }

    // ============================================================
    // DEFINES
    // ============================================================

    public void addDefine(String ident, String valor) {
        defines.add(new Define(ident, valor));
    }

    public void addDefines(List<String[]> pares) {
        for (String[] par : pares)
            defines.add(new Define(par[0], par[1]));
    }

    // ============================================================
    // PROTOTIPOS
    // ============================================================

    public void addDecFun(String tipo, String nombre, List<Parametro> params) {
        prototiposInterface.put(nombre, copiarLista(params));
        decfuns.add(new DecFun(tipo, nombre, params));
        funcionesDeclaradas.add(nombre);
    }

    // ============================================================
    // FUNCIONES Y PROCEDIMIENTOS
    // ============================================================

    public void addFuncion(String nombre, String tipo, List<Parametro> params,
                           List<VariableDecl> vars, String cuerpo,
                           String nombreRetorno) {

        funcionesDeclaradas.add(nombre);

        if (prototiposInterface.containsKey(nombre)) {
            if (!compararParametros(prototiposInterface.get(nombre), params)) {
                error("Parámetros no coinciden entre INTERFACE e implementación en FUNCTION " + nombre);
                return;
            }
        }

        boolean encontrado = false;
        for (VariableDecl v : vars) {
            if (v.nombre.equals(nombreRetorno)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            VariableDecl ret = new VariableDecl(tipo, nombreRetorno);
            vars.add(0, ret);
        }

        String cuerpoSeguro = cuerpo != null ? cuerpo : "";
        funciones.add(new Funcion(nombre, tipo, params, vars, cuerpoSeguro));

        // Comprobación diferida
        comprobacionesPendientes.add(() -> detectarVariablesNoDeclaradas(vars, params, cuerpoSeguro));
    }

    public void addProcedimiento(String nombre, List<Parametro> params,
                                 List<VariableDecl> vars, String cuerpo) {

        procedimientosDeclarados.add(nombre);

        if (prototiposInterface.containsKey(nombre)) {
            if (!compararParametros(prototiposInterface.get(nombre), params)) {
                error("Parámetros no coinciden entre INTERFACE e implementación en SUBROUTINE " + nombre);
                return;
            }
        }

        String cuerpoSeguro = cuerpo != null ? cuerpo : "";
        procedimientos.add(new Procedimiento(nombre, params, vars, cuerpoSeguro));

        // Comprobación diferida
        comprobacionesPendientes.add(() -> detectarVariablesNoDeclaradas(vars, params, cuerpoSeguro));
    }

    // ============================================================
    // MAIN
    // ============================================================

    public void generarMain(List<VariableDecl> vars, String sentencias) {
        this.mainVars = vars != null ? vars : new ArrayList<>();
        this.mainCodigo = sentencias != null ? sentencias : "";

        for (VariableDecl v : this.mainVars)
            variablesGlobales.add(v.nombre);

        detectarVariablesNoDeclaradas(this.mainVars, null, this.mainCodigo);
    }

    // ============================================================
    // GENERACIÓN FINAL
    // ============================================================

    public String generarPrograma() {

        // ★ NUEVO — Ejecutar comprobaciones diferidas (después del MAIN)
        for (Runnable r : comprobacionesPendientes)
            r.run();

        StringBuilder sb = new StringBuilder();

        for (Define d : defines)
            sb.append("#define ").append(d.nombre).append(" ").append(d.valor).append("\n");

        if (!defines.isEmpty()) sb.append("\n");

        for (DecFun df : decfuns)
            sb.append(df.toPrototype()).append(";\n");

        if (!decfuns.isEmpty()) sb.append("\n");

        for (Funcion f : funciones)
            sb.append(f.toDefinition(this)).append("\n");

        for (Procedimiento p : procedimientos)
            sb.append(p.toDefinition(this)).append("\n");

        sb.append("void main(void) {\n");

        if (!mainVars.isEmpty())
            sb.append(indent(generarDeclaraciones(mainVars)));

        sb.append(indent(mainCodigo));
        sb.append("}\n");

        return sb.toString();
    }

    // ============================================================
    // DECLARACIONES
    // ============================================================

    public String generarDeclaraciones(List<VariableDecl> vars) {

        Map<String, List<VariableDecl>> mapa = new LinkedHashMap<>();

        for (VariableDecl v : vars) {
            String clave = v.tipo + "|" + v.dimension;
            mapa.computeIfAbsent(clave, k -> new ArrayList<>()).add(v);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, List<VariableDecl>> e : mapa.entrySet()) {
            String[] partes = e.getKey().split("\\|");
            String tipo = partes[0];
            int dim = Integer.parseInt(partes[1]);

            sb.append(tipo).append(" ");

            List<VariableDecl> lista = e.getValue();
            for (int i = 0; i < lista.size(); i++) {
                VariableDecl v = lista.get(i);

                sb.append(v.nombre);

                if (tipo.equals("char") && dim > 0)
                    sb.append("[").append(dim).append("]");

                if (v.init != null)
                    sb.append(" = ").append(v.init);

                if (i < lista.size() - 1) sb.append(", ");
            }

            sb.append(";\n");
        }

        return sb.toString();
    }

    // ============================================================
    // INDENTACIÓN
    // ============================================================

    public String indent(String codigo) {
        if (codigo == null || codigo.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        String[] lineas = codigo.split("\n");
        for (String l : lineas) {
            if (l.trim().isEmpty()) continue;
            sb.append("    ").append(l).append("\n");
        }
        return sb.toString();
    }

    // ============================================================
    // REFERENCIAS Y LLAMADAS
    // ============================================================

    public boolean esParametroReferencia(String nombre) {
        if (contexto.parametrosActuales == null) return false;

        for (Parametro p : contexto.parametrosActuales) {
            if (p.nombre.equals(nombre))
                return p.esReferencia;
        }
        return false;
    }

    public String procesarLlamada(String nombre, String listaArgs) {

        if (!funcionesDeclaradas.contains(nombre) &&
                !procedimientosDeclarados.contains(nombre) &&
                !prototiposInterface.containsKey(nombre)) {

            error("Llamada a subprograma inexistente: " + nombre);
            subprogramasInexistentes.add(nombre);
            return listaArgs;
        }

        List<Parametro> params = prototiposInterface.get(nombre);

        if (params == null) return listaArgs;

        // Split respetando paréntesis anidados
        List<String> args = new ArrayList<>();
        if (!listaArgs.isEmpty()) {
            int depth = 0;
            StringBuilder cur = new StringBuilder();
            for (char c : listaArgs.toCharArray()) {
                if (c == '(') { depth++; cur.append(c); }
                else if (c == ')') { depth--; cur.append(c); }
                else if (c == ',' && depth == 0) {
                    args.add(cur.toString().trim());
                    cur.setLength(0);
                } else {
                    cur.append(c);
                }
            }
            if (cur.length() > 0) args.add(cur.toString().trim());
        }

        if (args.size() != params.size()) {
            error("Número incorrecto de argumentos en llamada a " + nombre +
                    ": se esperaban " + params.size() + ", se recibieron " + args.size());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.size() && i < params.size(); i++) {
            String arg = args.get(i);
            Parametro p = params.get(i);

            if (p.esReferencia && !arg.trim().matches("[A-Za-z_][A-Za-z0-9_]*")) {
                error("El parámetro '" + p.nombre + "' de '" + nombre +
                        "' es OUT/INOUT y debe recibir una variable simple, no una expresión: '" + arg.trim() + "'");
            }

            if (p.esReferencia)
                sb.append("&").append(arg.trim());
            else
                sb.append(arg.trim());

            if (i < args.size() - 1)
                sb.append(", ");
        }

        return sb.toString();
    }

    // ============================================================
    // DETECTOR DE VARIABLES NO DECLARADAS
    // ============================================================

    private void detectarVariablesNoDeclaradas(List<VariableDecl> declaradas, List<Parametro> params, String cuerpo) {

        // Si el cuerpo es null (puede ocurrir cuando ANTLR recupera de un error
        // sintáctico y un atributo queda sin inicializar), no hay nada que analizar.
        if (cuerpo == null) return;

        Set<String> nombresValidos = new HashSet<>();

        for (VariableDecl v : declaradas)
            nombresValidos.add(v.nombre);

        if (params != null) {
            for (Parametro p : params)
                nombresValidos.add(p.nombre);
        }

        Set<String> reservadas = Set.of(
                "if","else","endif","do","enddo","select","case","default",
                "call","return","while","for","switch","break","continue",
                "true","false"
        );

        String[] tokens = cuerpo.split("[^A-Za-z0-9_]+");

        for (String tok : tokens) {
            if (tok.isEmpty()) continue;
            if (tok.equals("null")) continue;  // artefacto de concatenación Java null+"" tras error sintáctico

            if (tok.matches("[0-9]+")) continue;
            if (tok.equalsIgnoreCase("TRUE") || tok.equalsIgnoreCase("FALSE")) continue;
            if (tok.matches("0x[0-9A-Fa-f]+")) continue;
            if (tok.matches("0b[01]+")) continue;
            if (tok.matches("0o[0-7]+")) continue;
            if (reservadas.contains(tok.toLowerCase())) continue;
            if (funcionesDeclaradas.contains(tok)) continue;
            if (procedimientosDeclarados.contains(tok)) continue;
            if (prototiposInterface.containsKey(tok)) continue;
            if (subprogramasInexistentes.contains(tok)) continue;
            if (variablesGlobales.contains(tok)) continue;
            if (cuerpo.contains("\"" + tok + "\"")) continue;

            if (!nombresValidos.contains(tok)) {
                error("Variable no declarada: " + tok);
            }
        }
    }

    // ============================================================
    // ERRORES
    // ============================================================

    public void error(String msg) {
        System.err.println("ERROR SEMÁNTICO: " + msg);
        hayErroresSemanticos = true;
    }

    // ============================================================
    // COMPARACIÓN
    // ============================================================

    private boolean compararParametros(List<Parametro> a, List<Parametro> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            Parametro p = a.get(i);
            Parametro q = b.get(i);

            if (!p.nombre.equals(q.nombre)) return false;
            if (!p.tipo.equals(q.tipo)) return false;
            if (p.esCadena != q.esCadena) return false;
            if (p.esReferencia != q.esReferencia) return false;
        }

        return true;
    }

    private List<Parametro> copiarLista(List<Parametro> lista) {
        List<Parametro> nueva = new ArrayList<>();
        for (Parametro p : lista) nueva.add(p.copia());
        return nueva;
    }

    // ============================================================
    // CLASES INTERNAS
    // ============================================================

    private static class Define {
        String nombre, valor;
        Define(String n, String v) { nombre = n; valor = v; }
    }

    private static class DecFun {
        String tipo, nombre;
        List<Parametro> params;

        DecFun(String t, String n, List<Parametro> p) {
            tipo = t;
            nombre = n;
            params = new ArrayList<>(p);
        }

        String toPrototype() {
            StringBuilder sb = new StringBuilder();
            sb.append(tipo).append(" ").append(nombre).append("(");

            if (params.isEmpty()) {
                sb.append("void");
            } else {
                for (int i = 0; i < params.size(); i++) {
                    sb.append(params.get(i).toCParam());
                    if (i < params.size() - 1) sb.append(", ");
                }
            }

            sb.append(")");
            return sb.toString();
        }
    }

    private static class Funcion {
        String nombre, tipo;
        List<Parametro> params;
        List<VariableDecl> vars;
        String cuerpo;

        Funcion(String n, String t, List<Parametro> p, List<VariableDecl> v, String c) {
            nombre = n;
            tipo = t;
            params = new ArrayList<>(p);
            vars = new ArrayList<>(v);
            cuerpo = c;
        }

        String toDefinition(Traductor trad) {
            StringBuilder sb = new StringBuilder();

            sb.append(tipo).append(" ").append(nombre).append("(");

            if (params.isEmpty()) {
                sb.append("void");
            } else {
                for (int i = 0; i < params.size(); i++) {
                    sb.append(params.get(i).toCParam());
                    if (i < params.size() - 1) sb.append(", ");
                }
            }

            sb.append(") {\n");

            if (!vars.isEmpty()) {
                sb.append(trad.indent(trad.generarDeclaraciones(vars)));
            }

            sb.append(trad.indent(cuerpo));
            sb.append("}\n");

            return sb.toString();
        }
    }

    private static class Procedimiento {
        String nombre;
        List<Parametro> params;
        List<VariableDecl> vars;
        String cuerpo;

        Procedimiento(String n, List<Parametro> p, List<VariableDecl> v, String c) {
            nombre = n;
            params = new ArrayList<>(p);
            vars = new ArrayList<>(v);
            cuerpo = c;
        }

        String toDefinition(Traductor trad) {
            StringBuilder sb = new StringBuilder();

            sb.append("void ").append(nombre).append("(");

            if (params.isEmpty()) {
                sb.append("void");
            } else {
                for (int i = 0; i < params.size(); i++) {
                    sb.append(params.get(i).toCParam());
                    if (i < params.size() - 1) sb.append(", ");
                }
            }

            sb.append(") {\n");

            if (!vars.isEmpty()) {
                sb.append(trad.indent(trad.generarDeclaraciones(vars)));
            }

            sb.append(trad.indent(cuerpo));
            sb.append("}\n");

            return sb.toString();
        }
    }
}
