package Ejercicio3_4;

public class AppEjercicio3_4 {
	/**
	* Método main que crea un círculo localizado en el punto (2,3) y  
	* con un radio de 5. Luego, imprime los datos del círculo en  
	* pantalla.
	*/
	    public static void main(String args[]) {
	        // Crear un círculo
	    	System.out.println("EJERCICIO 3: ");
	        Ejercicio3Círculo círculo1 = new Ejercicio3Círculo(2, 3, 5);
	        círculo1.imprimir();

	        
	        //EJERCICIO4
	        // Crear una recta
	        System.out.println("---------------------------------------");
	        System.out.println("EJERCICIO 4: ");
	        Ejercicio3Punto puntoA = new Ejercicio3Punto(1, 2);
	        Ejercicio3Punto puntoB = new Ejercicio3Punto(4, 6);
	        Ejercicio4Recta rectaAB = new Ejercicio4Recta(puntoA, puntoB);

	        // Imprimir información de la recta
	        System.out.println("Recta AB - Pendiente: " + rectaAB.calcularPendiente() +
	                ", Longitud: " + rectaAB.calcularLongitud());

	        // Crear un polígono
	        System.out.println("---------------------------------------");
	        Ejercicio3Punto puntoC = new Ejercicio3Punto(8, 3);
	        Ejercicio3Punto puntoD = new Ejercicio3Punto(6, 1);
	        Ejercicio3Punto puntoE = new Ejercicio3Punto(2, 5);
	        Ejercicio4Poligono poligono = new Ejercicio4Poligono("Polígono ABCDE", new Ejercicio3Punto[]{puntoA, puntoB, puntoC, puntoD, puntoE});

	        // Imprimir información del polígono
	        System.out.println("Polígono: " + poligono.nombre);
	        for (int i = 0; i < poligono.puntos.length; i++) {
	            System.out.println("Punto " + (i + 1) + ": (" + poligono.puntos[i].getX() + ", " + poligono.puntos[i].getY() + ")");
	        }
	    }
	}
