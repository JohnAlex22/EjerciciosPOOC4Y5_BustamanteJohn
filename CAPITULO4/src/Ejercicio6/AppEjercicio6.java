package Ejercicio6;

public class AppEjercicio6 {
    public static void main(String[] args) {
        // Crear un estudiante
       Ejercicio6Estudiante estudiante = new Ejercicio6Estudiante("Juan", "123 Calle Principal", "Ingeniería", 3);

        // Crear un profesor
        Ejercicio6Profesor profesor = new Ejercicio6Profesor("Dr. Smith", "456 Calle Secundaria", "Departamento de Ciencias", "Titular");

        // Imprimir información del estudiante
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());
        System.out.println();

        // Imprimir información del profesor
        System.out.println("Información del profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Dirección: " + profesor.getDireccion());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoria());
    }
}

