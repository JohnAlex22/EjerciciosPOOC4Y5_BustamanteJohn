package Ejercicio13;

public class AppEjercicio13 {
	    public static void main(String[] args) {
	        // Crear instancias de las figuras
	        Ejercicio13Circulo circulo = new Ejercicio13Circulo(5.0);
	        Ejercicio13Rectangulo rectangulo = new Ejercicio13Rectangulo(4.0, 6.0);
	        Ejercicio13Cuadrado cuadrado = new Ejercicio13Cuadrado(3.0);
	        Ejercicio13TriánguloRectángulo trianguloRectangulo = new Ejercicio13TriánguloRectángulo(3.0, 4.0);

	        // Calcular y mostrar las áreas y perímetros
	        System.out.println("Área del círculo: " + circulo.calcularArea());
	        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

	        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
	        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

	        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
	        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

	        System.out.println("Área del triángulo rectángulo: " + trianguloRectangulo.calcularArea());
	        // No se puede calcular el perímetro de un triángulo genérico
	    }

}
