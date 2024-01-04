package Ejercicio18_19;

public abstract class Ejercicio18Vehículo {
	
	int velocidadActual; // que identifica la velocidad actual de un vehículo 
	int velocidadMáxima; // Atributo que identifica la velocidad máxima permitida a un vehículo 
	
	/**
	* Constructor de la clase Vehículo
	* @param velocidadActual Parámetro que define la velocidad actual  
	* de un vehículo
	* @param velocidadMáxima Parámetro que define la velocidad  
	* máxima permitida a un vehículo
	*/
	Ejercicio18Vehículo(int velocidadActual, int velocidadMáxima) {
		this.velocidadActual = velocidadActual;
		this.velocidadMáxima = velocidadMáxima;
		}
	
	/**
	* Método que muestra en pantalla los datos de un vehículo
	*/
	void imprimir() {
		System.out.println("Velocidad actual = " + velocidadActual); 
		System.out.println("Velocidad máxima = " + velocidadMáxima); 
		}
	
	/**
	* Método abstracto que permite incrementar la velocidad de un  
	* vehículo
	* @param velocidad Parámetro que define el incremento de la  
	* velocidad de un vehículo
	*/
	abstract void acelerar(int velocidad);
	
	/**
	* Método abstracto que permite decrementar la velocidad de un  vehículo
	* @param velocidad Parámetro que define el decremento de la  
	* velocidad de un vehículo
	*/
	abstract void frenar(int velocidad);

}
