package Ejercicio11;

public class AppEjercicio11 {
	
	    public static void main(String[] args) {
	    	Ejercicio11Fracción fracción1 = new Ejercicio11Fracción(1, 2);
	    	Ejercicio11Fracción fracción2 = new Ejercicio11Fracción(3, 4);

	        System.out.println("Fracción 1: " + fracción1);
	        System.out.println("Fracción 2: " + fracción2);

	        // Pruebas de operaciones
	        Ejercicio11Numérica suma = fracción1.sumar(fracción2);
	        System.out.println("Suma: " + suma);

	        Ejercicio11Numérica resta = fracción1.restar(fracción2);
	        System.out.println("Resta: " + resta);

	        Ejercicio11Numérica multiplicación = fracción1.multiplicar(fracción2);
	        System.out.println("Multiplicación: " + multiplicación);

	        Ejercicio11Numérica división = fracción1.dividir(fracción2);
	        System.out.println("División: " + división);
	    }

}
