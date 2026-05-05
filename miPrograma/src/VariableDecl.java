public class VariableDecl {
    public String tipo;       // int, float, char, char[n]
    public String nombre;
    public String init;       // inicialización opcional
    public int dimension;     // para CHARACTER(n)

    public VariableDecl(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.init = null;
        this.dimension = -1;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public void setDimension(int dim) {
        this.dimension = dim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(tipo);

        if (dimension > 0)
            sb.append("[").append(dimension).append("]");

        sb.append(" ").append(nombre);

        if (init != null)
            sb.append(" = ").append(init);

        sb.append(";");

        return sb.toString();
    }
}
