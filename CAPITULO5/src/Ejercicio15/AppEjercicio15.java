package Ejercicio15;

public class AppEjercicio15 {
    public static void main(String[] args) {
        Ejercicio15Articulo articulo = new Ejercicio15Articulo();

        Ejercicio15Seccion seccion1 = new Ejercicio15Seccion("Introducción");
        Ejercicio15Subseccion subseccion1 = new Ejercicio15Subseccion("Contexto Histórico");
        Ejercicio15Parrafo parrafo1 = new  Ejercicio15Parrafo("En el siglo XIX...");
        parrafo1.agregarComentarios("Interesante, pero falta referencia.");
        subseccion1.agregarParrafo(parrafo1);
        seccion1.agregarSubseccion(subseccion1);
        seccion1.agregarComentarios("La introducción es sólida, pero requiere más detalles.");

        Ejercicio15Seccion seccion2 = new Ejercicio15Seccion("Metodología");
        Ejercicio15Subseccion subseccion2 = new Ejercicio15Subseccion("Participantes");
        Ejercicio15Parrafo parrafo2 = new  Ejercicio15Parrafo("Se reclutaron 100 voluntarios...");
        subseccion2.agregarParrafo(parrafo2);
        seccion2.agregarSubseccion(subseccion2);

        articulo.agregarSeccion(seccion1);
        articulo.agregarSeccion(seccion2);

        articulo.evaluarArticulo("Aceptado con modificaciones");
    }
}
