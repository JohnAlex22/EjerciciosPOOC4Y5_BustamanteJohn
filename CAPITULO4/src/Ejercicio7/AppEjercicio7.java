package Ejercicio7;

public class AppEjercicio7 {
	/**
	* Método main que crea un Profesor pero instanciando la clase  
	* ProfesorTitular. ¿Qué se imprimirá en pantalla?
	*/
	public static void main(String[] args)  { 
		Ejercicio7Profesor profesor1 = new Ejercicio7ProfesorTitular(); 
        Ejercicio7Profesor profesor2 = (Ejercicio7Profesor) profesor1; 
        profesor2.imprimir();
    } 
}
