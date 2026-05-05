public class Parametro {

    public String tipo;      // int, float, char
    public String nombre;    // nombre del parámetro
    public boolean esCadena; // true si es char[]

    public Parametro(String tipo, String nombre, boolean esCadena) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.esCadena = esCadena;
    }

    // Traducción a parámetro C
    public String toCParam() {
        if (tipo.startsWith("char[")) {
            return "char " + nombre + tipo.substring(4); // convierte char[10] → char nombre[10]
        }
        return tipo + " " + nombre;
    }
}
