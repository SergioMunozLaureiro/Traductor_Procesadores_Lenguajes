import java.util.ArrayDeque;
import java.util.Deque;

public class Contexto {

    private enum TipoContexto { MAIN, FUNCION, PROC }

    private static class Entrada {
        TipoContexto tipo;
        String nombreFuncion;
        String tipoRetorno;

        Entrada(TipoContexto t, String n, String r) {
            tipo = t;
            nombreFuncion = n;
            tipoRetorno = r;
        }
    }

    private final Deque<Entrada> pila = new ArrayDeque<>();

    // ============================
    // ENTRADA Y SALIDA DE CONTEXTOS
    // ============================

    public void entrarMain() {
        pila.push(new Entrada(TipoContexto.MAIN, null, null));
    }

    public void entrarFuncion(String nombre, String tipoRetorno) {

        pila.push(new Entrada(TipoContexto.FUNCION, nombre, tipoRetorno));
    }

    public void entrarProcedimiento(String nombre) {
        pila.push(new Entrada(TipoContexto.PROC, nombre, null));
    }

    public void salir() {
        if (!pila.isEmpty()) pila.pop();
    }

    // ============================
    // DETECCIÓN DE RETURN
    // ============================

    public boolean esAsignacionDeRetorno(String ident) {
        if (pila.isEmpty()) return false;

        Entrada e = pila.peek();

        // Solo en funciones: fun = expr → return expr;
        return e.tipo == TipoContexto.FUNCION && e.nombreFuncion.equals(ident);
    }

}
