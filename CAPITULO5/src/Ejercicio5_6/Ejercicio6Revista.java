package Ejercicio5_6;

class Ejercicio6Revista extends Ejercicio6Publicacion {
    String periodicidad, pais;

    public Ejercicio6Revista(String nombre, String autor, int añoPublicacion, String editorial,
                             String periodicidad, String pais) {
        super(nombre, autor, editorial, añoPublicacion);
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("País: " + pais);
        System.out.println();
    }
}
