package Ejercicio15;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio15Articulo {
	List<Ejercicio15Seccion> secciones;
    String conceptoFinal;

    public Ejercicio15Articulo() {
        this.secciones = new ArrayList<>();
        this.conceptoFinal = "Pendiente"; // Por defecto, el concepto es pendiente hasta que se evalúe.
    }

    public void agregarSeccion(Ejercicio15Seccion seccion) {
        secciones.add(seccion);
        System.out.println("Sección agregada: " + seccion.titulo);
    }

    public void evaluarArticulo(String conceptoFinal) {
        this.conceptoFinal = conceptoFinal;
        System.out.println("Concepto final del artículo: " + conceptoFinal);
    }

}
