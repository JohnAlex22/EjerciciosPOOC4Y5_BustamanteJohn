package Ejercicio9;

import java.util.Vector;

public class AppEjercicio9 {
    Vector<Ejercicio9ProfesorBase> profesores;

    public AppEjercicio9() {
        profesores = new Vector<>();
    }

    public static void main(String[] args) {
        AppEjercicio9 prueba = new AppEjercicio9();
        Ejercicio9ProfesorBase profesor1 = new Ejercicio9Profesor();
        Ejercicio9ProfesorBase profesor2 = new Ejercicio9ProfesorTitular();
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);

        for (int i = 0; i < prueba.profesores.size(); i++) {
            Ejercicio9ProfesorBase p = prueba.profesores.elementAt(i);
            p.imprimir();
            // Verificar si el profesor es de tipo Ejercicio9ProfesorTitular
            if (p instanceof Ejercicio9ProfesorTitular) {
                ((Ejercicio9ProfesorTitular) p).imprimirAños();
            }
        }
    }
}

