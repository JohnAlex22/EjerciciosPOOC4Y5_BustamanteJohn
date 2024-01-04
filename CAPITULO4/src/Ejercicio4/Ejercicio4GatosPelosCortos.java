package Ejercicio4;

public class Ejercicio4GatosPelosCortos extends Ejercicio4Gato {
    private String raza;

    public Ejercicio4GatosPelosCortos(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Raza = " + raza;
    }
}
