package Ejercicio3_4;

public class Ejercicio4Recta {
    Ejercicio3Punto punto1;
    Ejercicio3Punto punto2;

    public Ejercicio4Recta(Ejercicio3Punto punto1, Ejercicio3Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public double calcularPendiente() {
        if (punto1.getX() == punto2.getX()) {
            // La pendiente es infinita (vertical)
            return Double.POSITIVE_INFINITY;
        } else {
            return (double) (punto2.getY() - punto1.getY()) / (punto2.getX() - punto1.getX());
        }
    }

    public double calcularLongitud() {
        return Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }
}
