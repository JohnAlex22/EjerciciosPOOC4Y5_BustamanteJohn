package Ejercicio16_17;

//Nueva subclase Murciélago de Mamífero que implementa Volador
public class Ejercicio17Murcielago extends Ejercicio16Mamífero implements Ejercicio17Volador {
	/*
	 * Método que implementa el método abstracto amamantarCrías heredado de la clase Mamífero
     * que define un texto específico sobre el murciélago que amamanta crías.
     */
	void amamantarCrías() {
		System.out.println("El murciélago amamanta a sus crías.");
		}
	/*
     * Método que implementa el método volar de la interfaz Volador que muestra en pantalla
     * que el murciélago vuela.
     */
	public void volar() {
		System.out.println("El murciélago vuela.");
		}
}