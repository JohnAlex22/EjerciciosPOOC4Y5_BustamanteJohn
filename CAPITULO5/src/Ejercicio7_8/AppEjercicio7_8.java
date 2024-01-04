package Ejercicio7_8;

public class AppEjercicio7_8 {

    public static void main(String args[]) {
        // Crear una instancia de la versión extendida del carro
        Ejercicio8CarroExtendido carroExtendido = new Ejercicio8CarroExtendido(2, Ejercicio7tipoChasis.MONOCASCO, "Rojo",
                Ejercicio7tipoCarrocería.TUBULAR, "Goodyear", 25, 20, 15,
                "Cuero", true,
                "Tela", false,
                "Tela", true,
                true, true, true, true, false);

        // Imprimir los detalles del carro extendido
        carroExtendido.imprimir();
    }
}
