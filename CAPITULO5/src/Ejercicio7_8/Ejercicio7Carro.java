package Ejercicio7_8;

public class Ejercicio7Carro {
	
	Ejercicio7Motor motor; // Atributo que identifica el motor de un automóvil 
	Ejercicio7Chasis chasis; // Atributo que identifica el chasis de un automóvil
	Ejercicio7Llanta[] llantas; // Atributo que identifica las llantas de un automóvil como un array 
	Ejercicio7Carrocería carrocería; // Atributo que identifica la carrocería de un automóvil
	
	/**
	* Constructor de la clase Carro
	* @param volumen Parámetro que define el volumen del motor de  
	* un automóvil
	* @param claseChasis Parámetro que define el tipo de chasis de un  
	* automóvil
	* @param color Parámetro que define el color de un automóvil
	* @param claseCarrocería Parámetro que define el tipo de carrocería  
	* de un automóvil
	* @param marca Parámetro que define la marca de las llantas de un  
	* automóvil
	* @param diametro Parámetro que define el diámetro de las llantas  
	* de un automóvil
	* @param altura Parámetro que define la altura de las llantas de un  
	* automóvil
	* @param anchura Parámetro que define la anchura de las llantas de  
	* un automóvil
	*/
    public Ejercicio7Carro(int volumen, Ejercicio7tipoChasis claseChasis, String color, 
	Ejercicio7tipoCarrocería claseCarrocería,
	String marca, int diametro, int altura, int anchura) {
    	motor = new Ejercicio7Motor(volumen); // Crea el motor de un automóvil 
    	chasis = new Ejercicio7Chasis(claseChasis); // Crea el chasis de un automóvil 
    	llantas = new Ejercicio7Llanta[4]; // Crea un array de 4 llantas
    	for (int i = 0; i < llantas.length; i++) {
	// Crea cada una de las cuatro llantas de un automóvil
    		llantas[i] = new Ejercicio7Llanta(marca,diametro,altura,anchura);
    		}
    	carrocería = new Ejercicio7Carrocería(color,claseCarrocería); // Crea la carrocería de un automóvil
    	}
	
    /**
	* Método que muestra en pantalla los datos de un automóvil y sus  
	* diferentes componentes
	*/
	void imprimir() {
		System.out.println("Datos del Carro");
		System.out.println("Motor - Cilindros = " + motor.volumen); 
		System.out.println("Chasis - Tipo = " + chasis.tipo);
		System.out.println("Carrocería - Tipo = " + carrocería.tipo + " Color = " + carrocería.color);
		System.out.println("Llantas - Cantidad = " + llantas.length);
		for (int i = 0; i < llantas.length; i++)
			llantas[i].imprimir(); // Imprime los datos de cada llanta
		} 
}
