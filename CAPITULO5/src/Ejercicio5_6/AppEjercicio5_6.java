package Ejercicio5_6;

public class AppEjercicio5_6 {
    public static void main(String args[]) {
        Ejercicio5Biblioteca biblioteca1 = new Ejercicio5Biblioteca("Biblioteca Nacional");

        // Agregar libros
        Ejercicio5Libro libro1 = new Ejercicio5Libro("Cien años de soledad", "Gabriel García Márquez", 1967,
                "Sudamericana", "858.67/M566");
        biblioteca1.añadirLibro(libro1);

        Ejercicio5Libro libro2 = new Ejercicio5Libro("Rayuela", "Julio Cortázar", 1963, "Sudamericana", "863.55/J667");
        biblioteca1.añadirLibro(libro2);

        Ejercicio5Libro libro3 = new Ejercicio5Libro("La tía julia y el escribidor",
                "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");
        biblioteca1.añadirLibro(libro3);

        // Agregar revistas
        Ejercicio6Revista revista1 = new Ejercicio6Revista("National Geographic", "Gardiner Green Hubbard", 2022, "National Geographic Society", "Mensual", "Estados Unidos");
        biblioteca1.añadirRevista(revista1);

        Ejercicio6Revista revista2 = new Ejercicio6Revista("Scientific American","Gerard Piel", 2022, "Springer Nature",
                "Mensual", "Estados Unidos");
        biblioteca1.añadirRevista(revista2);

        // Listar todas las publicaciones
        biblioteca1.listarPublicaciones();
    }
}