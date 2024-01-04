package Ejercicio12;

public class AppEjercicio12 {
	/**
	* Método main que crea un equipo. Luego, crea un escalador, un  
	* velocista y un contrarrelojista. Estos tipos de ciclistas son añadidos  
	* al equipo. Se asignan tiempos a cada ciclista para al final obtener el  
	* tiempo total del equipo
	*/
	public static void main(String args[]) {
	Ejercicio12Equipo equipo1 = new Ejercicio12Equipo("Sky","Estados Unidos");
	Ejercicio12Velocista velocista1 = new Ejercicio12Velocista(123979, "Geraint Thomas", 
	320, 25);
	Ejercicio12Escalador escalador1 = new Ejercicio12Escalador(123980, "Egan Bernal", 
	25, 10);
	Ejercicio12Contrarrelojista contrarrelojista1 = new Ejercicio12Contrarrelojista(123981, 
	"Jonathan Castroviejo", 120);
	equipo1.añadirCiclista(velocista1);
	equipo1.añadirCiclista(escalador1);
	equipo1.añadirCiclista(contrarrelojista1);
	velocista1.setTiempoAcumulado(365);
	escalador1.setTiempoAcumulado(385);
	contrarrelojista1.setTiempoAcumulado(370);
	equipo1.calcularTotalTiempo();
	equipo1.imprimir();
	equipo1.listarEquipo();
	}

}
