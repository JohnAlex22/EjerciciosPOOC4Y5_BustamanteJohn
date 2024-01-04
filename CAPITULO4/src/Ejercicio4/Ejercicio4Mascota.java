package Ejercicio4;

public class Ejercicio4Mascota {
    private String nombre;
    private int edad;
    private String color;

    public Ejercicio4Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascota: " +
                "Nombre = " + nombre +
                ", Edad = " + edad +
                ", Color = " + color;
    }
}
