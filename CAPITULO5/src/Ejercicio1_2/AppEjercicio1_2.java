package Ejercicio1_2;


public class AppEjercicio1_2 {
    /**
     * Método main que crea una estación de peaje, asigna vehículos a personas,
     * luego se van agregando diferentes tipos de vehículos al vector de vehículos de
     * la estación de peaje. Para finalizar, se calcula el total de dinero recaudado
     * por la estación de peaje y se muestra el dinero pagado en peajes por cada
     * vehículo asignado a una persona.
     */
	public static void main(String args[]) {
        Ejercicio1Peaje peaje = new Ejercicio1Peaje("La Lizama", "Santander");
        Ejercicio1Camión camión1 = new Ejercicio1Camión("PKI-889", 2);
        peaje.asignarVehículo("Juan", camión1);
        peaje.calcularPeaje("Juan", camión1);

        Ejercicio1Camión camión2 = new Ejercicio1Camión("KLM-123", 3);
        peaje.asignarVehículo("Ana", camión2);
        peaje.calcularPeaje("Ana", camión2);

        Ejercicio1Camión camión3 = new Ejercicio1Camión("PQI-234", 4);
        peaje.asignarVehículo("Juan", camión3);
        peaje.calcularPeaje("Juan", camión3);

        Ejercicio1Moto moto1 = new Ejercicio1Moto("ABC-123");
        peaje.asignarVehículo("Ana", moto1);
        peaje.calcularPeaje("Ana", moto1);

        Ejercicio1Moto moto2 = new Ejercicio1Moto("XYZ-000");
        peaje.asignarVehículo("Juan", moto2);
        peaje.calcularPeaje("Juan", moto2);

        Ejercicio1Carro carro1 = new Ejercicio1Carro("WVC-389");
        peaje.asignarVehículo("Ana", carro1);
        peaje.calcularPeaje("Ana", carro1);

        Ejercicio1Carro carro2 = new Ejercicio1Carro("QWE-543");
        peaje.asignarVehículo("Juan", carro2);
        peaje.calcularPeaje("Juan", carro2);

        peaje.imprimir();

        peaje.mostrarDineroPagado("Juan");
        peaje.mostrarDineroPagado("Ana");
    }
}
