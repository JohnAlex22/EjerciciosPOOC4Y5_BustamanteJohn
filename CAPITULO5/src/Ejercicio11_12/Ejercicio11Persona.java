package Ejercicio11_12;

public abstract class Ejercicio11Persona {
	String nombre; // Atributo que define el nombre de una persona 
	String apellidos; // Atributo que define los apellidos de una persona 
	int edad; // Atributo que define la edad de una persona
	/**
	* Constructor de la clase Persona
	* @param nombre Parámetro que define el nombre de una persona 
	* @param apellidos Parámetro que define los apellidos de una persona 
	* @param edad Parámetro que define la edad de una persona
	*/
	public Ejercicio11Persona(String nombre, String apellidos, int edad) { 
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		}

}
