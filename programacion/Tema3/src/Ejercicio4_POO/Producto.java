package Ejercicio4_POO;

public class Producto {
    String nProducto;
    double precio;
    public Producto(String nProducto, double precio){
        this.nProducto = nProducto;
        this.precio = precio;
    }
    public Producto(String nProducto){
        this.nProducto = nProducto;
        this.precio = 0.0;

    }
}
