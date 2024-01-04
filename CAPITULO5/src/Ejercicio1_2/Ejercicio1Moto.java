package Ejercicio1_2;

public class Ejercicio1Moto extends Ejercicio1Vehículo {
	
	// Atributo estático que identifica el valor de peaje a pagar por una moto
	static int valorPeaje = 5000;
	/**
	* Constructor de la clase Moto
	* @param placa Parámetro que define la placa de una moto
	*/
	Ejercicio1Moto(String placa) {
	super(placa); // Invoca al constructor de la clase padre
	}
	/**
	* Método que devuelve el valor del peaje para una moto
	* @return El valor del peaje para una moto
	*/
	public int getValorPeaje() {
	return valorPeaje;
	}
	/**
	* Método que establece el valor del peaje para una moto
	* @param Parámetro que define el valor del peaje para una moto 
	*/
	

	//MODIFICAR PARA EL EJERCICIO2
	static void setValorPeaje(int valorPeaje) {
        Ejercicio1Moto.valorPeaje = valorPeaje;
    } 
	
	
	/**
	* Método que muestra en pantalla la placa y el valor del peaje de  
	* una moto
	*/
	void imprimit() {
	System.out.println("Placa = " + placa);
	System.out.println("Valor del peaje = " + valorPeaje);
	}

}
