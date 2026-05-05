#define max_val 100
#define pi 3.1415

void ImprimirMensaje(char texto[10]);
int Sumar(int a, int b);

int Sumar(int a, int b) {
    int suma;
    suma = a+b;
    return suma;
}

void ImprimirMensaje(char texto[10]) {
    MostrarEnPantalla(texto);
}

void main(void) {
    int contador = 0, acumulador;
    float promedio, total = 0.0;
    char mensaje1[10] = "Hola", mensaje2[10] = "Mundo";
    contador = contador+1;
    total = total+45.6;
    ImprimirMensaje("Bienvenido");
    promedio = total/2.0;
}
