/* Hágase una aplicación que permita comprobar si puedo comprarme una serie
de artículos. Para ello, el sistema pedirá por consola la cantidad de dinero
en euros que tengo, el IVA que se aplica en este momento y el precio de
dos articulos (sin IVA). El sistema indicará: */


import java.util.Scanner;

public class Tema2Ejercicio11b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double P_ARTICULO1 = 45.50;
        double P_ARTICULO2 = 99.99;


        System.out.println("¿Cuanto dinero tienes?");
        int dinero = teclado.nextInt();
        System.out.println("¿Que IVA te aplica?");
        int iva = teclado.nextInt()/100;

        boolean puedeComprarArticulo1 = dinero >= P_ARTICULO1 + P_ARTICULO1*iva;
        if(puedeComprarArticulo1) {
            System.out.println("Puedes comprar el articulo 1");
        }
        boolean puedeCoprarArticulo2 = dinero >= P_ARTICULO2 + P_ARTICULO2*iva;
        if(puedeCoprarArticulo2) {
            System.out.println("Puedes comprar el articulo 2");
        }
        boolean puedeComprarAmbos = dinero >= ((P_ARTICULO2 + P_ARTICULO2)+ (P_ARTICULO2 + P_ARTICULO2)*iva);
        if(puedeComprarAmbos) {
            System.out.println("Puedes comprar ambos articulos");
        }

        teclado.close();
    }
}
