package Ejercicio15;

public class Ejercicio15Parrafo {
    String contenido;
    String comentarios;

    public Ejercicio15Parrafo(String contenido) {
        this.contenido = contenido;
        this.comentarios = "";
    }

    public void agregarComentarios(String comentarios) {
        this.comentarios = comentarios;
        System.out.println("Comentarios agregados al párrafo: " + comentarios);
    }
}

