package Ejercicio3_4;

public class Ejercicio4Poligono {
    String nombre;
    Ejercicio3Punto[] puntos;

    public Ejercicio4Poligono(String nombre, Ejercicio3Punto[] puntos) {
        if (puntos.length < 3) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 puntos.");
        }

        this.nombre = nombre;
        this.puntos = puntos;
    }
}
