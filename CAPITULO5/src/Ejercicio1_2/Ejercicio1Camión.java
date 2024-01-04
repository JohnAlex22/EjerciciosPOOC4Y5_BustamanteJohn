package Ejercicio1_2;

public class Ejercicio1Camión extends Ejercicio1Vehículo {
    static int valorPeajeEje = 5000;
    int númeroEjes;

    Ejercicio1Camión(String placa, int númeroEjes) {
        super(placa);
        this.númeroEjes = númeroEjes;
    }

    public int getValorPeaje() {
        return númeroEjes * valorPeajeEje;
    }

    static void setValorPeajeEje(int valorPeajeEje) {
        Ejercicio1Camión.valorPeajeEje = valorPeajeEje;
    }

    void imprimit() {
        System.out.println("Placa = " + placa);
        System.out.println("Número de ejes = " + númeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}