package Ejercicio18_19;

public class AppEjercicio18 {
	
	/**
	* Método main que crea un vehículo terrestre y un vehículo  
	* acuático. Además, prueba diferentes métodos de estas clases al  
	* acelerar el vehículo terrestre; al calcular las revoluciones de motor  
	* de un vehículo acuático; y al recomendar la velocidad de acuerdo  
	* a la velocidad del viento.
	*/
	public static void main(String args[]) {
	Ejercicio18Terrestre camioneta = new Ejercicio18Terrestre(100, 250);
	System.out.println("Camioneta");
	camioneta.imprimir();
	camioneta.acelerar(50);
	System.out.println("Nueva Velocidad actual= " + camioneta. 
	velocidadActual);
	Ejercicio18Acuático motoAcuática = new Ejercicio18Acuático(50, 110);
	System.out.println("--------------------------------");
	System.out.println("Moto acuática");
	motoAcuática.imprimir();
	System.out.println("Revoluciones del motor = " +
	motoAcuática.calcularRevolucionesMotor(1200, 2)); 
	motoAcuática.recomendarVelocidad(20);
	
	
	Ejercicio19VehiculoAereo avion = new Ejercicio19VehiculoAereo(200, 500);
	System.out.println("--------------------------------");
    System.out.println("Avión");
    avion.imprimir();
    avion.acelerar(50);
    System.out.println("Nueva Velocidad actual = " + avion.velocidadActual);
    System.out.println("Revoluciones del motor = " + avion.calcularRevolucionesMotor(1500, 3));
    avion.recomendarVelocidad(30);
    avion.encender();
    avion.soltar();
    avion.subirTrenDeAterrizaje();
    avion.despegar();
    avion.volar();
    avion.aterrizar();
	}

}
