package Ejercicio20_21;

public class AppEjercicio20 {
	/**
	* Método main que crea un partido de fútbol de la liga española y  
	* establece un marcador para dicho partido, mostrándolo luego en  
	* pantalla
	*/
	public static void main(String args[]) {
	Ejercicio20PartidoFútbolLigaEspañola partido = new 
	Ejercicio20PartidoFútbolLigaEspañola();
	System.out.println("PARTIDO DE FUTBOL DE LA LIGA ESPAÑOLA");
	System.out.println("Duración del partido =" +
	Ejercicio20PartidoFútbolLigaEspañola.duraciónPartidoFútbol);
	partido.setEquipoLocal("Real Madrid");
	partido.setEquipoVisitante("Barcelona");
	partido.setGolesEquipoLocal(3);
	partido.setGolesEquipoVisitante(3);
	partido.imprimirMarcador();
	
	System.out.println("------------------------------------------------");
	// Crear partido de baloncesto
    Ejercicio21PartidoBaloncestoLigaColombiana partidoBaloncesto = new Ejercicio21PartidoBaloncestoLigaColombiana();
    System.out.println("PARTIDO DE BALONCESTO DE LA LIGA COLOMBIANA");
    System.out.println("Duración del partido = " + Ejercicio21PartidoBaloncestoLigaColombiana.duraciónPartidoBaloncesto);
    partidoBaloncesto.setEquipoLocal("EquipoA");
    partidoBaloncesto.setEquipoVisitante("EquipoB");
    partidoBaloncesto.setCestasEquipoLocal(80);
    partidoBaloncesto.setCestasEquipoVisitante(75);
    partidoBaloncesto.imprimirMarcador();
	}

}
