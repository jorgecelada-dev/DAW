package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio4_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("indica tu importe de compra");
        double precioInicial = teclado.nextDouble();
        double descuento = precioInicial / 10;
        System.out.println("importe original de compra: " + precioInicial);
        if (precioInicial >= 100) {

            System.out.println("descuento aplicado: " + descuento);
            System.out.println("Precio final con descuento aplicado: " + (precioInicial - descuento));
        } else if (precioInicial < 100){
            System.out.println("Descuento aplicado: 0$");
            System.out.println("Precio final: " + precioInicial);
        }
        }
}
