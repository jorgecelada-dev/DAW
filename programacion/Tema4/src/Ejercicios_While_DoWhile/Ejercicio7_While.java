package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio7_While {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿de cuantas calificaciones quieres hacer la media?");
        int cantidad = teclado.nextInt();
        double digito;
        int contador = 1;
        double suma = 0;

        while(contador<=cantidad){
            System.out.println("introduce el digito " + contador);
            digito = teclado.nextDouble();
            contador = contador + 1;


            suma = suma + digito;






        }double media = suma/(contador-1);


        System.out.println("Suma total= " + suma);
        System.out.println("Media de calificaciones: " + media);






    }
}
