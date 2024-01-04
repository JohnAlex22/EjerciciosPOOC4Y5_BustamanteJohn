package Ejercicio9_10;

public class Ejercicio9LíneaPedido {
    private int identificador; // Atributo que representa el identificador de una línea de pedido 
    
    // Atributo que define la cantidad de producto solicitado en una línea de pedido 
    private int cantidad;
    
    private Ejercicio9Producto producto; // Atributo que define el producto solicitado en una línea de pedido 
    
    /**
    * Constructor de la clase LíneaPedido
    * @param identificador Parámetro que define el identificador de la  
    * línea de pedido
    * @param cantidad Parámetro que define la cantidad de un  
    * producto solicitado en la línea de pedido
    * @param producto Parámetro que define el Producto solicitado en  
    * la línea de pedido
    */
    public Ejercicio9LíneaPedido(int identificador, int cantidad, Ejercicio9Producto producto) {
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    /**
    * Método que obtiene el identificador de un producto
    * @return El identificador de un producto
    */
    public int getIdentificador() {
        return identificador;
    }

    /**
    * Método que establece el identificador de un producto
    * @param identificador Parámetro que define el identificador de un  
    * producto
    */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
    * Método que obtiene la cantidad de un producto solicitado en una  
    * línea de pedido
    * @return La cantidad de producto solicitado en una línea de pedido
    */
    public int getCantidad() {
        return cantidad;
    }

    /**
    * Método que establece la cantidad de un producto solicitado en  
    * una línea de pedido
    * @param cantidad Parámetro que define la cantidad de un  
    * producto solicitado en una línea de pedido
    */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
    * Método que obtiene el producto solicitado en una línea de pedido 
    * @return El producto solicitado en una línea de pedido
    */
    public Ejercicio9Producto getProducto() {
        return producto;
    }

    /**
    * Método que establece el producto solicitado en una línea de pedido
    * @param producto Parámetro que define el producto solicitado en  
    * una línea de pedido
    */
    public void setProducto(Ejercicio9Producto producto) {
        this.producto = producto;
    }

    /**
    * Método que calcula el subtotal de la línea de pedido
    * @return El subtotal de la línea de pedido
    */
    public int calcularSubtotalLíneaPedido() {
        // El subtotal se calcula como el precio del producto multiplicado por su cantidad 
        return cantidad * producto.getPrecio();
    }

    /**
    * Método que convierte a String los datos de una línea de pedido 
    * @return Un String con los datos de una línea de pedido
    */
    public String toString() {
        return "Línea de Pedido [id = " + identificador + ", Cantidad = " + 
                cantidad + ", Producto = " + producto + "]\n";
    } 
}
