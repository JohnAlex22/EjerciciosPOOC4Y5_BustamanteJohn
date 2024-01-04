package Ejercicio2;

import java.util.Scanner;

public class AppEjercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crear un libro
        System.out.print("Ingrese el título del libro: ");
        String titulo = input.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = input.nextLine();
        System.out.print("Ingrese el precio del libro: $");
        double precio = input.nextDouble();

        Ejercicio2Libro libro = new Ejercicio2Libro(titulo, autor, precio);

        // Imprimir información del libro
        System.out.println("\nInformación del Libro:");
        libro.imprimirInformacion();

        // Crear un libro de texto
        input.nextLine(); // Limpiar el buffer
        System.out.print("\nIngrese el título del libro de texto: ");
        titulo = input.nextLine();
        System.out.print("Ingrese el autor del libro de texto: ");
        autor = input.nextLine();
        System.out.print("Ingrese el precio del libro de texto: $");
        precio = input.nextDouble();
        input.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el curso asociado al libro de texto: ");
        String curso = input.nextLine();

        Ejercicio2LibrosDeTextos libroTexto = new Ejercicio2LibrosDeTextos(titulo, autor, precio, curso);

        // Imprimir información del libro de texto
        System.out.println("\nInformación del Libro de Texto:");
        libroTexto.imprimirInformacion();

        // Crear un libro de texto de la UNAL
        input.nextLine(); // Limpiar el buffer
        System.out.print("\nIngrese el título del libro de texto de la UNAL: ");
        titulo = input.nextLine();
        System.out.print("Ingrese el autor del libro de texto de la UNAL: ");
        autor = input.nextLine();
        System.out.print("Ingrese el precio del libro de texto de la UNAL: $");
        precio = input.nextDouble();
        input.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el curso asociado al libro de texto de la UNAL: ");
        curso = input.nextLine();
        System.out.print("Ingrese la facultad que lo publicó: ");
        String facultad = input.nextLine();

        Ejercicio2LibrosDeTextoUNAL libroTextoUNAL = new Ejercicio2LibrosDeTextoUNAL(titulo, autor, precio, curso, facultad);

        // Imprimir información del libro de texto de la UNAL
        System.out.println("\nInformación del Libro de Texto de la UNAL:");
        libroTextoUNAL.imprimirInformacion();

        // Crear una novela
        input.nextLine(); // Limpiar el buffer
        System.out.print("\nIngrese el título de la novela: ");
        titulo = input.nextLine();
        System.out.print("Ingrese el autor de la novela: ");
        autor = input.nextLine();
        System.out.print("Ingrese el precio de la novela: $");
        precio = input.nextDouble();
        input.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el tipo de novela (histórica, romántica, policiaca, realista, ciencia ficción o aventuras): ");
        String tipoNovela = input.nextLine();

        Ejercicio2Novela novela = new Ejercicio2Novela(titulo, autor, precio, tipoNovela);

        // Imprimir información de la novela
        System.out.println("\nInformación de la Novela:");
        novela.imprimirInformacion();
    }
}
