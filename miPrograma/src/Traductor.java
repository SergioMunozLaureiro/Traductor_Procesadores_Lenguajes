import java.util.*;

public class Traductor {

    private StringBuilder defines = new StringBuilder();
    private StringBuilder decFuns = new StringBuilder();
    private StringBuilder partes = new StringBuilder();
    private StringBuilder main = new StringBuilder();

    private Contexto ctx = new Contexto();

    public Contexto getContexto() {
        return ctx;
    }

    // -------------------------------
    // DEFINES
    // -------------------------------
    public void addDefine(String id, String valor) {
        defines.append("#define ").append(id).append(" ").append(valor).append("\n");
    }

    // -------------------------------
    // PROTOTIPOS
    // -------------------------------
    public void addDecFun(String nombre, String tipo, List<Parametro> params) {
        decFuns.append(tipo)
               .append(" ")
               .append(nombre)
               .append("(")
               .append(formatParams(params))
               .append(");\n");
    }

    // -------------------------------
    // FUNCIONES Y PROCEDIMIENTOS
    // -------------------------------
    public void addFuncion(String nombre, String tipo, List<Parametro> params,
                           List<VariableDecl> vars, String cuerpo) {

        partes.append(tipo)
              .append(" ")
              .append(nombre)
              .append("(")
              .append(formatParams(params))
              .append(") {\n");

        // variables locales
        for (VariableDecl v : vars) {
            partes.append(indent(v.toString())).append("\n");
        }

        // cuerpo
        partes.append(indent(cuerpo)).append("\n");

        partes.append("}\n\n");
    }

    public void addProcedimiento(String nombre, List<Parametro> params,
                                 List<VariableDecl> vars, String cuerpo) {

        addFuncion(nombre, "void", params, vars, cuerpo);
    }

    // -------------------------------
    // MAIN
    // -------------------------------
    public void generarMain(List<VariableDecl> vars, String cuerpo) {
        main.append("void main(void) {\n");

        for (VariableDecl v : vars) {
            main.append(indent(v.toString())).append("\n");
        }

        main.append(indent(cuerpo)).append("\n");
        main.append("}\n");
    }

    // -------------------------------
    // UTILIDADES
    // -------------------------------
    private String formatParams(List<Parametro> params) {
        if (params == null || params.isEmpty()) return "void";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < params.size(); i++) {
            sb.append(params.get(i).toString());
            if (i < params.size() - 1)
                sb.append(", ");
        }
        return sb.toString();
    }

    public String indent(String s) {
        return s.replaceAll("(?m)^", "    ");
    }

    // -------------------------------
    // PROGRAMA FINAL
    // -------------------------------
    public String generarPrograma() {
        return defines.toString() + "\n" +
               decFuns.toString() + "\n" +
               partes.toString() + "\n" +
               main.toString();
    }
}
