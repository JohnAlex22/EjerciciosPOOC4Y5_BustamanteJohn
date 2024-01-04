package Ejercicio7_8;

public class Ejercicio8CarroExtendido extends Ejercicio7Carro {

    // Atributos adicionales para los asientos
    Ejercicio8Asiento asientoConductor;
    Ejercicio8Asiento asientoAcompanante;
    Ejercicio8Asiento asientoTrasero;

    // Atributos adicionales para otros elementos del carro
    boolean airbags;
    boolean frenosABS;
    boolean vidriosElectricos;
    boolean espejosElectricos;
    boolean sunroof;

    public Ejercicio8CarroExtendido(int volumen, Ejercicio7tipoChasis claseChasis, String color,
            Ejercicio7tipoCarrocería claseCarrocería, String marcaLlanta, int diametro, int altura, int anchura,
            String materialAsientoConductor, boolean fundaAsientoConductor,
            String materialAsientoAcompanante, boolean fundaAsientoAcompanante,
            String materialAsientoTrasero, boolean fundaAsientoTrasero,
            boolean airbags, boolean frenosABS, boolean vidriosElectricos,
            boolean espejosElectricos, boolean sunroof) {
        super(volumen, claseChasis, color, claseCarrocería, marcaLlanta, diametro, altura, anchura);

        // Inicializar asientos
        asientoConductor = new Ejercicio8Asiento(materialAsientoConductor, fundaAsientoConductor);
        asientoAcompanante = new Ejercicio8Asiento(materialAsientoAcompanante, fundaAsientoAcompanante);
        asientoTrasero = new Ejercicio8Asiento(materialAsientoTrasero, fundaAsientoTrasero);

        // Inicializar otros elementos del carro
        this.airbags = airbags;
        this.frenosABS = frenosABS;
        this.vidriosElectricos = vidriosElectricos;
        this.espejosElectricos = espejosElectricos;
        this.sunroof = sunroof;
    }

    @Override
    void imprimir() {
        super.imprimir();

        // Imprimir información adicional de los asientos
        System.out.println("Asiento del Conductor: Material = " + asientoConductor.material + ", Funda = " + asientoConductor.funda);
        System.out.println("Asiento del Acompañante: Material = " + asientoAcompanante.material + ", Funda = " + asientoAcompanante.funda);
        System.out.println("Asiento Trasero: Material = " + asientoTrasero.material + ", Funda = " + asientoTrasero.funda);

        // Imprimir información adicional de otros elementos del carro
        System.out.println("Airbags: " + airbags);
        System.out.println("Frenos ABS: " + frenosABS);
        System.out.println("Vidrios Eléctricos: " + vidriosElectricos);
        System.out.println("Espejos Eléctricos: " + espejosElectricos);
        System.out.println("Sunroof: " + sunroof);
    }
}
