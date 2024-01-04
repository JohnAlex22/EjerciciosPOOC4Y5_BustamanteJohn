package Ejercicio2;

public class Ejercicio2LibrosDeTextos extends Ejercicio2Libro {
    private String curso;

    public Ejercicio2LibrosDeTextos(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
