package Ejercicio4;

public class Ejercicio4PerrosPequeños extends Ejercicio4Perro {
    private String raza;

    public Ejercicio4PerrosPequeños(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza = " + raza;
    }
}
