package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio1_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero = teclado.nextInt();
        int i = 1;
        while (i<=numero){
            System.out.println(i++);

        }
        System.out.println("Fin del conteo");







    }
}
