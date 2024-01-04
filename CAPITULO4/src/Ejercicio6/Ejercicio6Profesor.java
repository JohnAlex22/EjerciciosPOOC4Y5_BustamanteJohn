package Ejercicio6;

public class Ejercicio6Profesor extends Ejercicio6Persona {
    private String departamento;
    private String categoria;

    public Ejercicio6Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
