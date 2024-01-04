package Ejercicio11_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejercicio11EquipoFútbol {
    String nombre;
    String país;
    Ejercicio11Técnico técnico;
    Ejercicio11Portero portero;
    Ejercicio11Defensa[] defensas;
    Ejercicio11Mediocampo[] mediocampos;
    Ejercicio11Delantero[] delanteros;
    List<Ejercicio12Partido> partidos = new ArrayList<>();
    int puntos;
    int partidosGanados;
    int partidosEmpatados;
    int partidosPerdidos;
    int golesAFavor;
    int golesEnContra;

    public Ejercicio11EquipoFútbol(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
    }

    public Ejercicio11EquipoFútbol(String nombre, String ciudad, Ejercicio11Técnico técnico,
                                   Ejercicio11Portero portero, Ejercicio11Defensa[] defensas,
                                   Ejercicio11Mediocampo[] mediocampos, Ejercicio11Delantero[] delanteros) {
        this(nombre, ciudad);
        this.técnico = técnico;
        this.portero = portero;
        this.defensas = defensas;
        this.mediocampos = mediocampos;
        this.delanteros = delanteros;
    }

    public void jugarPartido(Ejercicio11EquipoFútbol equipoVisitante, int golesLocal, int golesVisitante) {
        Ejercicio12Partido partido = new Ejercicio12Partido(this, equipoVisitante, golesLocal, golesVisitante);
        partidos.add(partido);

        golesAFavor += golesLocal;
        golesEnContra += golesVisitante;

        if (golesLocal > golesVisitante) {
            puntos += 3;
            partidosGanados++;
        } else if (golesLocal == golesVisitante) {
            puntos += 1;
            partidosEmpatados++;
        } else {
            partidosPerdidos++;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public int getDiferenciaGoles() {
        return golesAFavor - golesEnContra;
    }

    public static void imprimirTabla(List<Ejercicio11EquipoFútbol> equipos) {
        Collections.sort(equipos, Comparator.comparingInt(Ejercicio11EquipoFútbol::getPuntos).reversed());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("TABLA DE POSICIONES");
        System.out.printf("%-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Equipo", "Puntos", "Ganados", "Empatados", "Perdidos", "G. Favor", "G. Contra", "Dif. Goles");

        for (Ejercicio11EquipoFútbol equipo : equipos) {
            System.out.printf("%-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d%n",
                    equipo.nombre, equipo.getPuntos(), equipo.getPartidosGanados(),
                    equipo.getPartidosEmpatados(), equipo.getPartidosPerdidos(),
                    equipo.getGolesAFavor(), equipo.getGolesEnContra(), equipo.getDiferenciaGoles());
        }
    }

    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + país);
        System.out.println("Portero [" + portero + "]");
        System.out.println("Defensas");
        for (int i = 0; i < defensas.length; i++) {
            System.out.println(defensas[i]);
        }
        System.out.println("Mediocampo");
        for (int j = 0; j < mediocampos.length; j++) {
            System.out.println(mediocampos[j]);
        }
        System.out.println("Delanteros");
        for (int k = 0; k < delanteros.length; k++) {
            System.out.println(delanteros[k]);
        }
    }
}
