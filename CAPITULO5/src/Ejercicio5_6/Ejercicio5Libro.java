package Ejercicio5_6;

public class Ejercicio5Libro extends Ejercicio6Publicacion {
    String referenciaBibliografica;

    public Ejercicio5Libro(String titulo, String autor, int añoPublicacion, String editorial, String referenciaBibliografica) {
        super(titulo, autor, editorial, añoPublicacion);
        this.referenciaBibliografica = referenciaBibliografica;
    }

    void imprimir() {
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia bibliográfica: " + referenciaBibliografica);
        System.out.println();
    }
}