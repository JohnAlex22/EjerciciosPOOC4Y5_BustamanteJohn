package Ejercicio1_2;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio2Persona {
    String nombre;
    String apellidos;
    String numeroDocumento;
    String fechaNacimiento;
    Map<String, Ejercicio1Vehículo> vehículosAsignados;

    public Ejercicio2Persona(String nombre, String apellidos, String numeroDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.vehículosAsignados = new HashMap<>();
    }

    public void asignarVehículo(Ejercicio1Vehículo vehículo) {
        vehículosAsignados.put(vehículo.getPlaca(), vehículo);
    }

    public void desasignarVehículo(String placa) {
        vehículosAsignados.remove(placa);
    }

    public int calcularTotalPeaje() {
        int totalPeaje = 0;
        for (Ejercicio1Vehículo vehículo : vehículosAsignados.values()) {
            totalPeaje += vehículo.getValorPeaje();
        }
        return totalPeaje;
    }
}
