package Ejercicio3;

public class AppEjercicio3 {
	
	/**
	* Método main que crea dos inmuebles, calcula su precio de  
	* acuerdo al área y se muestran sus datos en pantalla
	*/
	public static void main(String args[]) {
	Ejercicio3ApartamentoFamiliar apto1 = new 
	Ejercicio3ApartamentoFamiliar(103067,120,
	"Avenida Santander 45-45",3,2,200000);
	System.out.println("Datos apartamento");
	apto1.calcularPrecioVenta(apto1.valorArea);
	apto1.imprimir();
	System.out.println("Datos apartamento");
	Ejercicio3Apartaestudio aptestudio1 = new 
	Ejercicio3Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1); 
	aptestudio1.calcularPrecioVenta(aptestudio1.valorArea); 
	aptestudio1.imprimir();
	}

}
