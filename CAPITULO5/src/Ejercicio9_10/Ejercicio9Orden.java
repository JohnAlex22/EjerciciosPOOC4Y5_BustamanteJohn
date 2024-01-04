package Ejercicio9_10;

import java.util.*;

class Ejercicio9Orden {
    private int identificador;
    private Vector<Ejercicio9LíneaPedido> itemsPedido;
    private Ejercicio10Cliente cliente;

    public Ejercicio9Orden(int identificador, Ejercicio10Cliente cliente) {
        this.identificador = identificador;
        this.cliente = cliente;
        itemsPedido = new Vector<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Ejercicio10Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Ejercicio10Cliente cliente) {
        this.cliente = cliente;
    }

    public void añadirItem(int identificador, int cantidad, Ejercicio9Producto producto) {
        Ejercicio9LíneaPedido línea = new Ejercicio9LíneaPedido(identificador, cantidad, producto);
        itemsPedido.add(línea);
    }

    public int calcularTotalOrden() {
        int totalOrden = 0;
        for (int i = 0; i < itemsPedido.size(); i++) {
            Ejercicio9LíneaPedido línea = itemsPedido.elementAt(i);
            totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
        }
        return totalOrden;
    }

    @Override
    public String toString() {
        return "Orden [id = " + identificador + ", " + cliente + "]\n" + "Items del pedido\n" + itemsPedido
                + "\nTotal orden = $" + calcularTotalOrden();
    }
}
