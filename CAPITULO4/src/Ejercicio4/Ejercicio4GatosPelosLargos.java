package Ejercicio4;

public class Ejercicio4GatosPelosLargos extends Ejercicio4Gato {
    private String raza;

    public Ejercicio4GatosPelosLargos(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza = " + raza;
    }
}
