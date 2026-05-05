public class Parametro {
    public String tipo;     // int, float, char, char[]
    public String nombre;   // nombre del parámetro
    public boolean esArray; // si es CHARACTER(n)

    public Parametro(String tipo, String nombre, boolean esArray) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.esArray = esArray;
    }

    @Override
    public String toString() {
        if (esArray)
            return tipo + " " + nombre + "[]";
        return tipo + " " + nombre;
    }
}
