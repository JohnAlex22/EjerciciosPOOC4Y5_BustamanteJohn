package Ejercicio18_19;

public class Ejercicio18Acuático extends Ejercicio18Vehículo implements Ejercicio18Motor, Ejercicio18Vela {
	/**
	  * Constructor de la clase Acuático
      * @param velocidadActual Parámetro que define la velocidad actual  
      * de un vehículo acuático
      * @param velocidadMáxima Parámetro que define la velocidad  
      * máxima permitida para un vehículo acuático
      */
	public Ejercicio18Acuático(int velocidadActual, int velocidadMáxima) {
		// Invoca al constructor de la clase padre
		super(velocidadActual, velocidadMáxima);
		}
	  /*
	   * Implementación del método abstracto acelerar heredado de  
	   * Vehículo que permite incrementar la velocidad de un vehículo  
	   * acuático
	   * @param velocidad Parámetro que define el incremento de  
	   * velocidad de un vehículo acuático
	   */
	void acelerar(int velocidad) {
		int vel = velocidadActual + velocidad;
		if (vel > velocidadMáxima) { // La velocidad actualizada no puede superar la velocidad máxima */
			System.out.println("Supera la velocidad máxima permitida"); 
			} else { // Si no supera la velocidad máxima, se actualiza la velocidad actual
				velocidadActual = vel;
				}
		}
	
	  /*
	   * Implementación del método abstracto frenar heredado de Vehículo  
	   * que permite decrementar la velocidad de un vehículo acuático
	   * @param velocidad Parámetro que define el decremento de  
	   * velocidad de un vehículo acuático
	   */
	void frenar(int velocidad) {
		int vel = velocidadActual - velocidad;
		if (vel < 0) { // La velocidad actualizada no puede ser negativa 
			System.out.println("La velocidad no puede ser negativa"); 
			} else { // Si la velocidad no se vuelve negativa, se actualiza la velocidad actual 
				velocidadActual = vel;
				}
		}
	/**
	* Implementación del método abstracto calcularRevolucionesMotor  
	* heredado de Vehículo que calcula las revoluciones de un motor  
	* como la multiplicación de su fuerza por su radio 
	* @param fuerza Parámetro que define la fuerza que tiene el motor  
	* de un vehículo acuático
	* @param radio Parámetro que define el radio de un motor de un  
	* vehículo acuático
	*/
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza*radio);
		}
		/**
		* Implementación de método abstracto recomendarVelocidad  
		* proveniente de la interfaz Vela que recomienda una determinada  
		* velocidad del vehículo de acuerdo a la velocidad del viento 
		* @param velocidadViento Parámetro que define la velocidad del  
		* viento que influenciará la velocidad actual del vehículo
		*/
		public void recomendarVelocidad(int velocidadViento) {
		if ( velocidadViento > 80 || velocidadViento < 10) {
		velocidadActual = 0;
		}
	}
}

