package Ejercicio7;

public class Ejercicio7ProfesorTitular extends Ejercicio7Profesor {
    /**
    * Método que sobreescribe el método imprimir heredado de la clase  
    * padre Ejercicio7Profesor
    */
    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }

}
