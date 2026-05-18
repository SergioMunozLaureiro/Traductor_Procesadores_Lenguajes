import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
//& "C:\Program Files\Java\jdk-21.0.10\bin\java.exe" -jar lib/antlr-4.13.2-complete.jar -o gen src/gramatica.g4
//& "C:\Program Files\Java\jdk-21.0.10\bin\javac.exe" -cp ".;lib/antlr-4.13.2-complete.jar" src/*.java gen/*.java
//& "C:\Program Files\Java\jdk-21.0.10\bin\java.exe" -cp ".;lib/antlr-4.13.2-complete.jar;src;gen" miPrograma ejemplo.for
public class Contexto {

    private enum TipoContexto { MAIN, FUNCION, PROC }

    private static class Entrada {
        TipoContexto tipo;
        String nombreFuncion;
        String tipoRetorno;
        List<Parametro> parametros;   // NUEVO: parámetros del subprograma

        Entrada(TipoContexto t, String n, String r, List<Parametro> params) {
            tipo = t;
            nombreFuncion = n;
            tipoRetorno = r;
            parametros = params;
        }
    }

    private final Deque<Entrada> pila = new ArrayDeque<>();

    // === NUEVO: referencia rápida a los parámetros actuales ===
    public List<Parametro> parametrosActuales = null;

    // ============================
    // ENTRADA Y SALIDA DE CONTEXTOS
    // ============================

    public void entrarMain() {
        pila.push(new Entrada(TipoContexto.MAIN, null, null, null));
        parametrosActuales = null;
    }

    public void entrarFuncion(String nombre, String tipoRetorno, List<Parametro> params) {
        pila.push(new Entrada(TipoContexto.FUNCION, nombre, tipoRetorno, params));
        parametrosActuales = params;   // guardar parámetros actuales
    }

    public void entrarProcedimiento(String nombre, List<Parametro> params) {
        pila.push(new Entrada(TipoContexto.PROC, nombre, null, params));
        parametrosActuales = params;   // guardar parámetros actuales
    }

    public void salir() {
        if (!pila.isEmpty()) pila.pop();

        // Actualizar parámetros actuales según el nuevo tope de la pila
        if (pila.isEmpty()) {
            parametrosActuales = null;
        } else {
            parametrosActuales = pila.peek().parametros;
        }
    }

    // ============================
    // DETECCIÓN DE RETURN
    // ============================

    public boolean esAsignacionDeRetorno(String ident) {
        if (pila.isEmpty()) return false;

        Entrada e = pila.peek();

        // Solo en funciones: fun = expr → return expr;
        return e.tipo == TipoContexto.FUNCION && e.nombreFuncion != null && e.nombreFuncion.equals(ident);
    }
}
