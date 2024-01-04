package Ejercicio14;

public class Ejercicio14Serie {
	
	    String titulo;
	    String genero;
	    String paisOrigen;
	    int añoRealizacion;

	    public Ejercicio14Serie(String titulo, String genero, String paisOrigen, int añoRealizacion) {
	        this.titulo = titulo;
	        this.genero = genero;
	        this.paisOrigen = paisOrigen;
	        this.añoRealizacion = añoRealizacion;
	    }

	    @Override
	    public String toString() {
	        return "Serie: " + titulo + ", Género: " + genero + ", País de Origen: " + paisOrigen + ", Año: " + añoRealizacion;
	    }
	
}
