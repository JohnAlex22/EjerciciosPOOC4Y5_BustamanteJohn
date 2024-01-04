package Ejercicio7_8;

public class Ejercicio7Carrocería {
	Ejercicio7tipoCarrocería tipo; // Atributo que identifica el tipo de carrocería de un automóvil 
	String color; // Atributo que identifica el color de la carrocería de un automóvil 
	
	/**
	* Constructor de la clase Carrocería
	* @param color Parámetro que define el color de la carrocería de un  
	* automóvil
	* @param tipo Parámetro que define el tipo de la carrocería de un  
	* automóvil
	*/
	Ejercicio7Carrocería(String color, Ejercicio7tipoCarrocería tipo) { 
		this.color = color;
		this.tipo = tipo;
		}

}
