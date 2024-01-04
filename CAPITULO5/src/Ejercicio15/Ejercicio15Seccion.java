package Ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio15Seccion {
    String titulo;
    List<Ejercicio15Subseccion> subsecciones;
    String comentarios;

    public Ejercicio15Seccion(String titulo) {
        this.titulo = titulo;
        this.subsecciones = new ArrayList<>();
        this.comentarios = "";
    }

    public void agregarSubseccion(Ejercicio15Subseccion subseccion) {
        subsecciones.add(subseccion);
        System.out.println("Subsección agregada: " + subseccion.titulo);
    }

    public void agregarComentarios(String comentarios) {
        this.comentarios = comentarios;
        System.out.println("Comentarios agregados a la sección '" + titulo + "': " + comentarios);
    }
}
