package Ejercicio13;
import java.util.*;

public class AppEjercicio13 {
	/**
	* Metodo main que crea un departamento. Luego, crea varios  
	* municipios que se agregan al departamento y luego calcula el  
	* censo de población del departamento, muestra los municipios  
	* con una población mayor a un valor dado y busca un municipio  
	* determinado
	*/
	public static void main(String[] args) {
		Ejercicio13Municipio municipio1 = new Ejercicio13Municipio("Manizales", 400000, 17, 2200);
		Ejercicio13Municipio municipio2 = new Ejercicio13Municipio("La Dorada", 98000, 28, 1000);
		Ejercicio13Municipio municipio3 = new Ejercicio13Municipio("Neira", 30000, 20, 1969);
		Vector municipios = new Vector();
		municipios.add(municipio1);
		municipios.add(municipio2);
		municipios.add(municipio3);
		Ejercicio13Departamento departamento = new Ejercicio13Departamento("Caldas", municipios);
		System.out.println("El censo del Departamento de " + departamento.getNombre() + " es = " + departamento.
		calcularCensoPoblaciónDepartamento());
		System.out.println("Municipios con población mayor a 50.000"); 
		departamento.buscarMunicipioConPoblaciónMayor(50000); 
		System.out.println("Búsqueda del municipio de Manizales"); 
		departamento.buscarMunicipio("Manizales");
		}

}
