package Ejercicio9_10;

public class AppEjercicio9_10 {
    public static void main(String[] args) {
        Ejercicio10Cliente clienteParticular = new Ejercicio10Cliente("Juan Pérez", "123456789", "Calle 123");
        Ejercicio10Empresa empresa = new Ejercicio10Empresa("Mi Empresa S.A.", "NIT123", "Empresa XYZ", "987654321",
                "Avenida Principal");

        Ejercicio9Producto producto1 = new Ejercicio9Producto(1, "Carpeta", "Carpeta anillada metálica", 1000);
        Ejercicio9Producto producto2 = new Ejercicio9Producto(2, "Tinta", "Tinta china de color negro.", 3000);
        Ejercicio9Producto producto3 = new Ejercicio9Producto(3, "Cinta pegante",
                "Cinta adhesiva de color transparente.", 800);
        Ejercicio9Producto producto4 = new Ejercicio9Producto(4, "Cartulina", "Pliego de cartulina 60x40 cms.", 600);

        Ejercicio9Orden ordenParticular = new Ejercicio9Orden(1, clienteParticular);
        ordenParticular.añadirItem(1, 5, producto1);
        ordenParticular.añadirItem(2, 3, producto2);
        ordenParticular.calcularTotalOrden();

        Ejercicio9Orden ordenEmpresa = new Ejercicio9Orden(2, empresa);
        ordenEmpresa.añadirItem(1, 2, producto3);
        ordenEmpresa.añadirItem(2, 4, producto4);
        ordenEmpresa.calcularTotalOrden();

        System.out.println(ordenParticular);
        System.out.println();
        System.out.println(ordenEmpresa);
    }
}
