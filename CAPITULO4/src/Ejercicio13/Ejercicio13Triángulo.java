package Ejercicio13;

public class Ejercicio13Triángulo extends Ejercicio13FiguraGeometrica {
    private double base;
    private double altura;

    public Ejercicio13Triángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // En este caso, el perímetro no se puede calcular sin más información
        throw new UnsupportedOperationException("No se puede calcular el perímetro de un triángulo genérico.");
    }
}

