package Ejercicio16_17;

public class AppEjercicio16 {
	
	/**
	* Método main que crea una ballena y un ornitorrinco e invoca los  
	* métodos heredados e implementados
	*/
	public static void main(String args[]) {
	Ejercicio16Ballena mobyDick = new Ejercicio16Ballena(); // Crea una ballena
	mobyDick.amamantarCrías(); // Invoca el método heredado de la clase Mamífero 
	Ejercicio16Ornitorrinco ornitorrinco1 = new Ejercicio16Ornitorrinco(); // Crea un ornitorrinco 
	ornitorrinco1.amamantarCrías(); // Invoca el método heredado de la clase Mamífero 
	ornitorrinco1.ponerHuevos(); // Invoca el método implementado de la interfaz Ornitorrinco 
	
	
	// Crea un murciélago
    Ejercicio17Murcielago murcielago1 = new Ejercicio17Murcielago();
    murcielago1.amamantarCrías(); // Invoca el método heredado de la clase Mamífero
    murcielago1.volar(); // Invoca el método implementado de la interfaz Volador 
	} 

}
