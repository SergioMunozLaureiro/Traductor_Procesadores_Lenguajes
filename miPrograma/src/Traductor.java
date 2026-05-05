import java.util.*;

public class Traductor {

    private final List<Define> defines = new ArrayList<>();
    private final List<DecFun> decfuns = new ArrayList<>();
    private final List<Funcion> funciones = new ArrayList<>();
    private final List<Procedimiento> procedimientos = new ArrayList<>();

    private final Contexto contexto = new Contexto();

    private List<VariableDecl> mainVars = new ArrayList<>();
    private String mainCodigo = "";

    public Traductor() {}

    public Contexto getContexto() {
        return contexto;
    }

    // ============================================================
    // DEFINES
    // ============================================================

    public void addDefine(String ident, String valor) {
        defines.add(new Define(ident, valor));
    }

    // ============================================================
    // PROTOTIPOS (decfuns)
    // ============================================================

    public void addDecFun(String tipo, String nombre, List<Parametro> params) {
        decfuns.add(new DecFun(tipo, nombre, params));
    }

    // ============================================================
    // FUNCIONES Y PROCEDIMIENTOS
    // ============================================================

    public void addFuncion(String nombre, String tipo, List<Parametro> params,
                           List<VariableDecl> vars, String cuerpo) {
        funciones.add(new Funcion(nombre, tipo, params, vars, cuerpo));
    }

    public void addProcedimiento(String nombre, List<Parametro> params,
                                 List<VariableDecl> vars, String cuerpo) {
        procedimientos.add(new Procedimiento(nombre, params, vars, cuerpo));
    }

    // ============================================================
    // MAIN
    // ============================================================

    public void generarMain(List<VariableDecl> vars, String sentencias) {
        this.mainVars = vars;
        this.mainCodigo = sentencias;
    }

    // ============================================================
    // GENERACIÓN FINAL DEL PROGRAMA
    // ============================================================

    public String generarPrograma() {
        StringBuilder sb = new StringBuilder();

        // === defines ===
        for (Define d : defines) {
            sb.append("#define ").append(d.nombre).append(" ").append(d.valor).append("\n");
        }
        if (!defines.isEmpty()) sb.append("\n");

        // === prototipos ===
        for (DecFun df : decfuns) {
            sb.append(df.toPrototype()).append(";\n");
        }
        if (!decfuns.isEmpty()) sb.append("\n");

        // === funciones ===
        for (Funcion f : funciones) {
            sb.append(f.toDefinition(this)).append("\n");
        }

        // === procedimientos ===
        for (Procedimiento p : procedimientos) {
            sb.append(p.toDefinition(this)).append("\n");
        }

        // === main ===
        sb.append("void main(void) {\n");

        if (!mainVars.isEmpty()) {
            sb.append(indent(generarDeclaraciones(mainVars)));
        }

        sb.append(indent(mainCodigo));
        sb.append("}\n");

        return sb.toString();
    }

    // ============================================================
    // DECLARACIONES DE VARIABLES
    // ============================================================

    public String generarDeclaraciones(List<VariableDecl> vars) {

        // Agrupar por tipo y dimensión
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

                if (tipo.equals("char") && dim > 0) {
                    sb.append("[").append(dim).append("]");
                }

                if (v.init != null) {
                    sb.append(" = ").append(v.init);
                }

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
    // CLASES INTERNAS DEL TRADUCTOR
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
