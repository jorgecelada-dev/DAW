package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio6_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¡Di un numero para la cuenta atrás!");
        int n = teclado.nextInt();
        while (n >= 0 ){
            System.out.println("Cuenta atras");
            System.out.println(n--);
        }System.out.println("¡cuenta a tras finalizada!");

}}
