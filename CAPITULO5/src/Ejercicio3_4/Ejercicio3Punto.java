package Ejercicio3_4;

public class Ejercicio3Punto {
	int x, y; // Atributos que identifican el valor de las coordenadas (x,y) del círculo 
	
	/**
	* Constructor de la clase Punto
	* @param x Parámetro que define la coordenada x de un punto
	* @param y Parámetro que define la coordenada y de un punto
	*/
	Ejercicio3Punto(int x, int y) {
		this.x = x;
		this.y = y;
		}
	
	/**
	* Método que devuelve el valor de la coordenada x de un punto 
	* @return El valor de la coordenada x de un punto
	*/
	int getX() {
		return x;
		}
	
	/**
	* Método que establece el valor de la coordenada x de un punto
	* @param Parámetro que define el valor de la coordenada x de un punto
	*/
	void setX(int x) {
		this.x = x;
		}
		
	/**
		* Método que devuelve el valor de la coordenada y de un punto 
		* @return El valor de la coordenada y de un punto
		*/
		int getY() {
			return y;
			}
		
		/**
		* Método que establece el valor de la coordenada y de un punto 
		* @param Parámetro que define el valor de la coordenada y de un  
		* punto
		*/
		void setY(int y) {
			this.y = y;
			}

}
