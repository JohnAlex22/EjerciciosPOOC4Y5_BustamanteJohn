package Ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio15Subseccion {
    String titulo;
    List<Ejercicio15Parrafo> parrafos;
    String comentarios;

    public Ejercicio15Subseccion(String titulo) {
        this.titulo = titulo;
        this.parrafos = new ArrayList<>();
        this.comentarios = "";
    }

    public void agregarParrafo(Ejercicio15Parrafo parrafo) {
        parrafos.add(parrafo);
        System.out.println("Párrafo agregado: " + parrafo.contenido);
    }

    public void agregarComentarios(String comentarios) {
        this.comentarios = comentarios;
        System.out.println("Comentarios agregados a la subsección '" + titulo + "': " + comentarios);
    }
}
