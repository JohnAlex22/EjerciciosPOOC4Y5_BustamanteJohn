package Ejercicio9;

public class Ejercicio9ProfesorTitular extends Ejercicio9ProfesorBase {
    int años = 0;

    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }
}

