package Ejercicio2;

public class Ejercicio2Novela extends Ejercicio2Libro {
    private String tipo;

    public Ejercicio2Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de novela: " + tipo);
    }
}

