public class Contexto {
    public boolean enFuncion = false;
    public boolean enProcedimiento = false;
    public boolean enMain = false;

    public String nombreFuncionActual = null;
    public String tipoFuncionActual = null;

    public void entrarFuncion(String nombre, String tipo) {
        enFuncion = true;
        enProcedimiento = false;
        enMain = false;
        nombreFuncionActual = nombre;
        tipoFuncionActual = tipo;
    }

    public void entrarProcedimiento(String nombre) {
        enFuncion = false;
        enProcedimiento = true;
        enMain = false;
        nombreFuncionActual = nombre;
        tipoFuncionActual = "void";
    }

    public void entrarMain() {
        enFuncion = false;
        enProcedimiento = false;
        enMain = true;
        nombreFuncionActual = "main";
        tipoFuncionActual = "void";
    }

    public void salir() {
        enFuncion = false;
        enProcedimiento = false;
        enMain = false;
        nombreFuncionActual = null;
        tipoFuncionActual = null;
    }

    public boolean esAsignacionDeRetorno(String id) {
        return enFuncion && nombreFuncionActual.equals(id);
    }
}
