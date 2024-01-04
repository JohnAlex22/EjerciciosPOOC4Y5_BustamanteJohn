package Ejercicio14;

public class Ejercicio14Ortopedista extends Ejercicio14Médico {
	// Valor enumerado para definir diferentes tipo de ortopedista
	enum tipología {MAXILOFACIAL, PEDIÁTRICA};
	tipología tipo; // Atributo que define el tipo de ortopedista
	
	/**
	* Método que estable el tipo de ortopedista
	* @param nombre Parámetro que define el tipo de ortopedista 
	*/
	void setTipología(tipología tipo) {
	this.tipo = tipo;
	}
	
	/**
	* Método que devuelve el tipo de ortopedista 
	* @return El tipo de ortopedista
	*/
	tipología getTipología() {
	return tipo;
	}

}
