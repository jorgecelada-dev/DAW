package Ejercicio4_POO;

public class main {
    public static void main(String[] args){
        Producto mochila = new Producto("Mochila", 25.5);
        Producto cuaderno = new Producto("Cuaderno");
        System.out.println("Producto 1: " + mochila.nProducto + " - " + mochila.precio + "$");  //java distingue los dos por que recibe distintas cantidades de parametros
        System.out.println("Producto 2: " + cuaderno.nProducto + " - " + cuaderno.precio + "$");


    }
}
