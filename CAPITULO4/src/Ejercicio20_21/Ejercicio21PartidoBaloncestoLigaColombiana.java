package Ejercicio20_21;

public class Ejercicio21PartidoBaloncestoLigaColombiana implements Ejercicio20PartidoBaloncesto {
    String equipoLocal;
    String equipoVisitante;
    int cestasEquipoLocal;
    int cestasEquipoVisitante;

    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal = nombreEquipo;
    }

    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante = nombreEquipo;
    }

    public void setGolesEquipoLocal(int marcador) {
        // Método de PartidoFútbol, no aplica para PartidoBaloncesto
    }

    public void setGolesEquipoVisitante(int marcador) {
        // Método de PartidoFútbol, no aplica para PartidoBaloncesto
    }

    public void setCestasEquipoLocal(int marcador) {
        this.cestasEquipoLocal = marcador;
    }

    public void setCestasEquipoVisitante(int marcador) {
        this.cestasEquipoVisitante = marcador;
    }

    void imprimirMarcador() {
        System.out.println("Equipo local: " + equipoLocal + ": " +
                cestasEquipoLocal + " - Equipo visitante: " + equipoVisitante +
                ": " + cestasEquipoVisitante);
    }
}
