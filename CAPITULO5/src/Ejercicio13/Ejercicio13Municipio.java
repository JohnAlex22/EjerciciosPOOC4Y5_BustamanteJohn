package Ejercicio13;

public class Ejercicio13Municipio {
	// Atributo que define el nombre del municipio
	private String nombre;
	// Atributo que define la población del municipio
	private int población;
	// Atributo que define la temperatura media anual del municipio en grados centígrados 
	private double temperaturaMedia;
	// Atributo que define la altitud a la que se encuentra el municipio en metros 
	private double altitud;
	
	/**
	* Constructor de la clase Municipio
	* @param nombre Parámetro que define el nombre del municipio 
	* @param población Parámetro que define la cantidad de habitantes  
	* del municipio
	* @param temperaturaMedia Parámetro que define la temperatura  
	* media anual del municipio
	* @param altitud Parámetro que define la altitud sobrel el nivel del  
	* mar del municipio
	*/
	public Ejercicio13Municipio(String nombre, int población, double 
			temperaturaMedia, double altitud) {
			this.nombre = nombre;
			this.población = población;
			this.temperaturaMedia = temperaturaMedia;
			this.altitud = altitud;
			}
	
			/**
			* Método que devuelve el nombre del municipio
			* @return El nombre del municipio
			*/
			public String getNombre() {
			return nombre;
			}
			
			/**
			* Método que establece el nombre del municipio
			* @param nombre Parámetro que define el nombre del municipio 
			*/
			private void setNombre(String nombre) {
				this.nombre = nombre;
			}
			
			/**
			* Método que devuelve la población del municipio
			* @return La población del municipio
			*/
			public int getPoblación() {
				return población;
			}
			
			/**
			* Método que establece la población del municipio
			* @param población Parámetro que define la población del municipio 
			*/
			private void setPoblación(int población) {
				this.población = población;
			}
			
			/**
			* Método que devuelve la temperatura media del municipio
			* @return La temperatura media del municipio
             */
			public double getTemperaturaMedia() {
				return temperaturaMedia;
				}
			
			/**
              * Método que establece la temperatura media del municipio
              * @param temperaturaMedia Parámetro que define la temperatura  
              * media del municipio
              */
			private void setTemperaturaMedia(double temperaturaMedia) {
				this.temperaturaMedia = temperaturaMedia;
				}
			/**
              * Método que devuelve la altitud del municipio
              * @return La altitud del municipio
              */
			public double getAltitud() {
				return altitud;
				}
			/**
              * Método que establece la altitud del municipio
              * @param altitud Parámetro que define la altitud media del municipio 
              */
			private void setAltitud(double altitud) {
				this.altitud = altitud;
				}
			/*
			 * Método que muestra en pantalla los datos del municipio
             */
			public void imprimir() {
				System.out.println("Nombre = " + getNombre());
				System.out.println("Población = " + getPoblación());
				System.out.println("Temperatura promedio (C) = " + getTemperaturaMedia());
				System.out.println("Altitud (metros) = " + getAltitud());
				}
}
