package Ejercicio1_2;

abstract public class Ejercicio1Vehículo {
	String placa; // Atributo que define la placa de un vehículo
    /**
      * Constructor de la clase Vehículo
      * @param placa Parámetro que define la placa de un vehículo
      */
	Ejercicio1Vehículo(String placa) { 
		this.placa = placa; 
		}
	//AGREGAR DEL EJERCICIO 2
	 abstract public int getValorPeaje();
	
	 public String getPlaca() {
		return placa;
	}
}
