package Ejercicio2;

public class Ejercicio2LibrosDeTextoUNAL extends Ejercicio2LibrosDeTextos{
	private String facultad;

    public Ejercicio2LibrosDeTextoUNAL(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
    }

}
