package Ejercicio14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Ejercicio14CatalogoSeries {
	
	    List<Ejercicio14Serie> series;

	    public Ejercicio14CatalogoSeries() {
	        this.series = new ArrayList<>();
	    }

	    public void agregarSerie(Ejercicio14Serie serie) {
	        series.add(serie);
	        System.out.println("Serie agregada: " + serie.titulo);
	    }

	    public void eliminarSerie(String titulo) {
	        Iterator<Ejercicio14Serie> iter = series.iterator();
	        while (iter.hasNext()) {
	        	Ejercicio14Serie serie = iter.next();
	            if (serie.titulo.equals(titulo)) {
	                iter.remove();
	                System.out.println("Serie eliminada: " + serie.titulo);
	                return;
	            }
	        }
	        System.out.println("No se encontró la serie con título: " + titulo);
	    }

	    public void consultarPorTitulo(String titulo) {
	        for (Ejercicio14Serie serie : series) {
	            if (serie.titulo.equals(titulo)) {
	                System.out.println(serie);
	                return;
	            }
	        }
	        System.out.println("No se encontró la serie con título: " + titulo);
	    }

	    public void consultarPorGenero(String genero) {
	        for (Ejercicio14Serie serie : series) {
	            if (serie.genero.equals(genero)) {
	                System.out.println(serie);
	            }
	        }
	    }

	    public void consultarPorPais(String pais) {
	        for (Ejercicio14Serie serie : series) {
	            if (serie.paisOrigen.equals(pais)) {
	                System.out.println(serie);
	            }
	        }
	    }


}
