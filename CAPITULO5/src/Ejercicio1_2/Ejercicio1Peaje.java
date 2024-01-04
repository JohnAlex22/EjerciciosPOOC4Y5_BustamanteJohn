package Ejercicio1_2;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1Peaje {
    // Atributo que identifica el nombre de una estación de peaje
    String nombre;
    // Atributo que identifica el nombre del departamento donde está ubicada la estación de peaje
    String departamento;
    // Mapa que asocia personas con los vehículos que tienen asignados
    Map<String, Ejercicio1Vehículo> asignaciones;
    // Atributo que identifica el total de dinero recolectado por la estación de peaje
    int totalPeaje = 0;
    // Atributo que identifica el total de camiones que llegó a la estación de peaje
    static int totalCamiones = 0;
    // Atributo que identifica el total de motos que llegó a la estación de peaje
    static int totalMotos = 0;
    // Atributo que identifica el total de carros que llegó a la estación de peaje
    static int totalCarros = 0;

    /**
     * Constructor de la clase Peaje
     * 
     * @param nombre       Parámetro que define el nombre de la estación de peaje
     * @param departamento Parámetro que define el departamento donde se encuentra
     *                     localizado el peaje
     */
    Ejercicio1Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        asignaciones = new HashMap<>(); // Crea el mapa de asignaciones de vehículos a personas
    }

    /**
     * Método que devuelve el nombre de la estación de peaje
     * 
     * @return El nombre de la estación de peaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que devuelve el departamento donde está localizada la estación de
     * peaje
     * 
     * @return El departamento donde está localizada la estación de peaje
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método que permite añadir un vehículo al mapa de asignaciones de vehículos de
     * una persona en la estación de peaje
     * 
     * @param persona   Parámetro que define la persona a la que se le asigna el
     *                  vehículo
     * @param vehículo  Parámetro que define el vehículo a agregar al mapa de
     *                  asignaciones
     */
    public void asignarVehículo(String persona, Ejercicio1Vehículo vehículo) {
        asignaciones.put(persona, vehículo);

        if (vehículo instanceof Ejercicio1Carro) {
            totalCarros++;
        } else if (vehículo instanceof Ejercicio1Moto) {
            totalMotos++;
        } else if (vehículo instanceof Ejercicio1Camión) {
            totalCamiones++;
        }
    }

    /**
     * Método que permite desasignar un vehículo del mapa de asignaciones de
     * vehículos de una persona en la estación de peaje
     * 
     * @param persona Parámetro que define la persona de la que se desasigna el
     *                vehículo
     */
    public void desasignarVehículo(String persona) {
        asignaciones.remove(persona);
    }

    /**
     * Método que permite calcular el peaje de un vehículo que llega a la estación
     * de peaje y está asignado a una persona
     * 
     * @param persona  Parámetro que define la persona que llega a la estación de
     *                 peaje con un vehículo asignado
     * @param vehículo Parámetro que define el vehículo que llega a la estación de
     *                 peaje
     */
    public int calcularPeaje(String persona, Ejercicio1Vehículo vehículo) {
        if (asignaciones.containsKey(persona) && asignaciones.get(persona) == vehículo) {
            int peaje = vehículo.getValorPeaje();
            totalPeaje += peaje;
            return peaje;
        } else {
            System.out.println("La persona no tiene asignado ese vehículo.");
            return 0;
        }
    }

    /**
     * Método que muestra en pantalla los datos del peaje, el total de vehículos que
     * llegó al peaje discriminado por tipo y el total de dinero recaudado por la
     * estación de peaje
     */
    public void imprimir() {
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicación = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehículos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehículos = " + totalVehículos);
        System.out.println("Dinero total = $" + totalPeaje);
        System.out.println();
    }
    
    /**
     * Método que muestra en pantalla el total de dinero pagado en peajes por cada
     * vehículo asignado a una persona
     * 
     * @param persona Parámetro que define el nombre de la persona
     */
    public void mostrarDineroPagado(String persona) {
        Ejercicio1Vehículo vehículo = asignaciones.get(persona);
        if (vehículo != null) {
            int peaje = calcularPeaje(persona, vehículo);
            System.out.println("Dinero pagado en peajes por " + persona + ":");
            System.out.println("- Vehículo: " + vehículo.getPlaca() +
                    ", Tipo: " + obtenerTipoVehiculo(vehículo) +
                    ", Dinero pagado: $" + peaje);
        } else {
            System.out.println(persona + " no tiene asignado ningún vehículo.");
        }
        System.out.println();
    }
    
	private String obtenerTipoVehiculo(Ejercicio1Vehículo vehículo) {
        if (vehículo instanceof Ejercicio1Carro) {
            return "Carro";
        } else if (vehículo instanceof Ejercicio1Moto) {
            return "Moto";
        } else if (vehículo instanceof Ejercicio1Camión) {
            return "Camión";
        } else {
            return "Desconocido";
        }
    }
}
