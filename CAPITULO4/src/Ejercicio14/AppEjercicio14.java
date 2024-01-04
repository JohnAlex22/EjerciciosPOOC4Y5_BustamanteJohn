package Ejercicio14;

import java.util.ArrayList;

public class AppEjercicio14 {
    public static void main(String[] args) {
        ArrayList<Ejercicio14Médico> listaMédicos = new ArrayList<>();

        Ejercicio14Médico médico1 = new Ejercicio14Médico();
        listaMédicos.add(médico1);

        Ejercicio14Ortopedista ortopedista1 = new Ejercicio14Ortopedista();
        listaMédicos.add(ortopedista1);

        Ejercicio14Pediatra pediatra1 = new Ejercicio14Pediatra();
        listaMédicos.add(pediatra1);

        for (int i = 0; i < listaMédicos.size(); i++) {
            Ejercicio14Médico medico = listaMédicos.get(i);
            if (medico instanceof Ejercicio14Ortopedista) {
                System.out.println("El objeto en el índice " + i + " es de la clase Ortopedista");
            } else if (medico instanceof Ejercicio14Pediatra) {
                System.out.println("El objeto en el índice " + i + " es de la clase Pediatra");
            } else if (medico instanceof Ejercicio14Médico) {
                System.out.println("El objeto en el índice " + i + " es de la clase Médico");
            }
        }
    }
}
