package Ejercicio4;

public class Ejercicio4Gato extends Ejercicio4Mascota {
    private double alturaSalto;
    private double longitudSalto;

    public Ejercicio4Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    // Getters y setters

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(double alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(double longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    // Método estático para todos los gatos
    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }

    @Override
    public String toString() {
        return "Gato: " +
                "Nombre = " + getNombre() +
                ", Edad = " + getEdad() +
                ", Color = " + getColor() +
                ", Altura de Salto = " + alturaSalto +
                ", Longitud de Salto = " + longitudSalto;
    }
}
