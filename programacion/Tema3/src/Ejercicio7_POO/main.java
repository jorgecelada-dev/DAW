package Ejercicio7_POO;

public class main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo (5.0, 3.0);
        Rectangulo rectangulo2 = new Rectangulo (4.0);

        System.out.println("Rectangulo: base " + rectangulo1.base + " - " +  "altura " + rectangulo1.altura);
        System.out.println("Area del rectangulo: " +  rectangulo1.base * rectangulo1.altura);

        System.out.println("Cuadrado: base " + rectangulo2.base + " - " +  "altura " + rectangulo2.altura);
        System.out.println("Area del cuadrado: " +  rectangulo2.base * rectangulo2.base );


    }
}
