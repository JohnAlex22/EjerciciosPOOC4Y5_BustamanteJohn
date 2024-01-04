package Ejercicio5_6;

public class Ejercicio6Publicacion {
    String titulo, autor, editorial;
    int añoPublicacion;

    public Ejercicio6Publicacion(String titulo, String autor, String editorial, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
    }
}