package Ejercicio14;

public class AppEjercicio14 {
	
	    public static void main(String[] args) {
	        Ejercicio14CatalogoSeries catalogo = new Ejercicio14CatalogoSeries();

	        Ejercicio14Serie serie1 = new Ejercicio14Serie("Breaking Bad", "Drama", "Estados Unidos", 2008);
	        Ejercicio14Serie serie2 = new Ejercicio14Serie("Stranger Things", "Ciencia Ficción", "Estados Unidos", 2016);

	        catalogo.agregarSerie(serie1);
	        catalogo.agregarSerie(serie2);

	        catalogo.consultarPorTitulo("Breaking Bad");
	        catalogo.consultarPorGenero("Ciencia Ficción");
	        catalogo.consultarPorPais("Estados Unidos");

	        catalogo.eliminarSerie("Stranger Things");

	        catalogo.consultarPorTitulo("Stranger Things");
	    }

}
