package Ejercicio11_12;

import java.util.ArrayList;
import java.util.List;

public class AppEjercicio11_12 {
	/**
	* Método main que crea en primer lugar los integrantes específicos  
	* de un equipo de fútbol. Luego, compone el equipo con sus  
	* integrantes y muestra sus datos en pantalla
	*/
	public static void main(String[] args) {
	Ejercicio11Técnico técnico = new Ejercicio11Técnico("Carlos","Queiroz", 66, 30, false); 
	// Crea un técnico
	Ejercicio11Portero portero = new Ejercicio11Portero("David", "Ospina", 30, true, 10); 
	// Crea un portero
	Ejercicio11Defensa[] defensas = new Ejercicio11Defensa[4]; // Crea un array de 4 defensas 
	Ejercicio11Mediocampo[] mediocampos = new Ejercicio11Mediocampo[4]; // Crea un array de 4 mediocampos
	Ejercicio11Delantero[] delanteros = new Ejercicio11Delantero[2]; // Crea un array de 2 delanteros
	
	// Crea los jugadores específicos de acuerdo a su tipo
	defensas[0] = new Ejercicio11Defensa("Yerry", "Mina", 24, true);
	defensas[1] = new Ejercicio11Defensa("Davison", "Sánchez", 23, true);
	defensas[2] = new Ejercicio11Defensa("William", "Tesillo", 29, true);
	defensas[3] = new Ejercicio11Defensa("Stefan", "Medina", 29, true);
	mediocampos[0] = new Ejercicio11Mediocampo("Mateus", "Uribe", 28, true, 
	12);
	mediocampos[1] = new Ejercicio11Mediocampo("Wilmar", "Barrios", 25, 
	true, 12);
	mediocampos[2] = new Ejercicio11Mediocampo("Juan Guillermo", "Cuadrado", 31, true, 10);
	mediocampos[3] = new Ejercicio11Mediocampo("James", "Rodríguez", 28, 
	true, 32);
	delanteros[0] = new Ejercicio11Delantero("Radamel Falcao", "García", 33, 
	true, 15);
	delanteros[1] = new Ejercicio11Delantero("Duvan", "Zapata", 28, true, 12); 
	/* Crea el equipo pasando como parámetros cada jugador creado 
	anteriormente */
	Ejercicio11EquipoFútbol equipo10 = new Ejercicio11EquipoFútbol("Colombia", "Colombia", 
	técnico, portero, defensas, mediocampos, delanteros); 
	equipo10.imprimir(); // Muestra los datos del equipo de fútbol
	
	
	// Crear instancias de los equipos
	Ejercicio11EquipoFútbol equipo1 = new Ejercicio11EquipoFútbol("Ecuador", "Ecuador", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo2 = new Ejercicio11EquipoFútbol("Argentina", "Argentina", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo3 = new Ejercicio11EquipoFútbol("Brasil", "Brasil", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo4 = new Ejercicio11EquipoFútbol("Uruguay", "Uruguay", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo5 = new Ejercicio11EquipoFútbol("Paraguay", "Paraguay", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo6 = new Ejercicio11EquipoFútbol("Venezuela", "Venezuela", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo7 = new Ejercicio11EquipoFútbol("Bolivia", "Bolivia", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo8 = new Ejercicio11EquipoFútbol("Peru", "Peru", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    Ejercicio11EquipoFútbol equipo9 = new Ejercicio11EquipoFútbol("Chile", "Chile", técnico, portero,
            new Ejercicio11Defensa[4], new Ejercicio11Mediocampo[4], new Ejercicio11Delantero[2]);
    
    
 // Jugar partidos
    equipo10.jugarPartido(equipo1, 2, 1);
    equipo2.jugarPartido(equipo3, 5, 3);
    equipo4.jugarPartido(equipo5, 6, 5);
    equipo6.jugarPartido(equipo7, 3, 0);
    equipo8.jugarPartido(equipo9, 4, 2);
    
    equipo1.jugarPartido(equipo2, 5, 0);
    equipo3.jugarPartido(equipo4, 2, 2);
    equipo5.jugarPartido(equipo6, 3, 2);
    equipo7.jugarPartido(equipo8, 0, 0);
    equipo9.jugarPartido(equipo10, 4, 5);
    
    
 // Imprimir tabla de posiciones
    List<Ejercicio11EquipoFútbol> equipos = new ArrayList<>();
    equipos.add(equipo1);
    equipos.add(equipo2);
    equipos.add(equipo3);
    equipos.add(equipo4);
    equipos.add(equipo5);
    equipos.add(equipo6);
    equipos.add(equipo7);
    equipos.add(equipo8);
    equipos.add(equipo9);
    equipos.add(equipo10);
    
    Ejercicio11EquipoFútbol.imprimirTabla(equipos);
    
	}

}
