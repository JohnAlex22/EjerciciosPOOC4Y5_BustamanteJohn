package Ejercicio13;

public class Ejercicio13Circulo extends Ejercicio13FiguraGeometrica {
    private double radio;

    public Ejercicio13Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

