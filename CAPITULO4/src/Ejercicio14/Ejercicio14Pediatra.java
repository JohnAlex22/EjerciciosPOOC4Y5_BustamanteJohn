package Ejercicio14;

public class Ejercicio14Pediatra extends Ejercicio14Médico {
	// Valor enumerado de define tipologías de un pediatra
	enum tipología {NEUROLOGO, PSICOLOGO};
	tipología tipo; // Atributo que define el tipo de pediatra 
	
	/**
	* Método que devuelve el tipo de pediatra
	* @return El tipo de pediatra
	*/
	void setTipología(tipología tipo) {
	this.tipo = tipo;
	}
	
	/**
	* Método que establece el tipo de pediatra
	* @param nombre Parámetro que define el tipo de pediatra 
	*/
	tipología getTipología() {
	return tipo;
	}

}
