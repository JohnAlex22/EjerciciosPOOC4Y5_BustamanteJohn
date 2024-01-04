package Ejercicio13;

public class Ejercicio13Rectangulo extends Ejercicio13FiguraGeometrica {
    private double base;
    private double altura;

    public Ejercicio13Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

