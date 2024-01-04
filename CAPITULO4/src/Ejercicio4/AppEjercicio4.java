package Ejercicio4;

public class AppEjercicio4 {

	    public static void main(String[] args) {
	        // Crear un perro pequeño
	        Ejercicio4PerrosPequeños perroPequeno = new Ejercicio4PerrosPequeños("Buddy", 3, "Marrón", 5.5, false, "Caniche");

	        // Crear un gato de pelo largo
	        Ejercicio4GatosPelosLargos gatoPeloLargo = new Ejercicio4GatosPelosLargos("Whiskers", 2, "Blanco", 1.2, 1.5, "Angora");

	        // Imprimir información de las mascotas
	        System.out.println("Información del perro pequeño:");
	        System.out.println(perroPequeno);
	        

	        System.out.println("Información del gato de pelo largo:");
	        System.out.println(gatoPeloLargo);
	        
	    }


}
