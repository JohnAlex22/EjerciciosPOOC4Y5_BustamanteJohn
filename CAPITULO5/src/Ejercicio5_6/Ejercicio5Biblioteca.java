package Ejercicio5_6;
import java.util.*;

public class Ejercicio5Biblioteca {
    String nombre;
    Vector<Ejercicio5Libro> coleccionLibros;
    Vector<Ejercicio6Revista> coleccionRevistas;

    public Ejercicio5Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new Vector<>();
        coleccionRevistas = new Vector<>();
    }

    void añadirLibro(Ejercicio5Libro libro) {
        coleccionLibros.add(libro);
    }

    void añadirRevista(Ejercicio6Revista revista) {
        coleccionRevistas.add(revista);
    }

    void listarLibros() {
        System.out.println("LIBROS");
        for (Ejercicio5Libro libro : coleccionLibros) {
            libro.imprimir();
        }
    }

    void listarRevistas() {
        System.out.println("REVISTAS");
        for (Ejercicio6Revista revista : coleccionRevistas) {
            revista.imprimir();
        }
    }

    void listarPublicaciones() {
        listarLibros();
        listarRevistas();
    }
}
