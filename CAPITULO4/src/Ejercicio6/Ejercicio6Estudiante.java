package Ejercicio6;

public class Ejercicio6Estudiante extends Ejercicio6Persona {
    private String carrera;
    private int semestre;

    public Ejercicio6Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
