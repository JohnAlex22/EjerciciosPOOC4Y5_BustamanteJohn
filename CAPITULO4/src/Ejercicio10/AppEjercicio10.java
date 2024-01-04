package Ejercicio10;

public class AppEjercicio10 {
	/**
	* Método main que crea un array de varios animales y para cada uno  
	* muestra en pantalla su nombre científico, su sonido, alimentos y hábitat
	*/
	public static void main(String[] args) {
	Ejercicio10Animal[] animales = new Ejercicio10Animal[4]; // Define un array de cuatro elementos de tipo Animal 
	animales[0] = new Ejercicio10Gato();
	animales[1] = new Ejercicio10Perro();
	animales[2] = new Ejercicio10Lobo();
	animales[3] = new Ejercicio10León();
	for (int i = 0; i < animales.length; i++) { //Recorre el array de animales 
	
		System.out.println(animales[i].getNombreCientífico());
		System.out.println("Sonido: " + animales[i].getSonido());
		System.out.println("Alimentos: " + animales[i].getAlimentos());
		System.out.println("Hábitat: " + animales[i].getHábitat()); 
		System.out.println();
		}
	}

}
