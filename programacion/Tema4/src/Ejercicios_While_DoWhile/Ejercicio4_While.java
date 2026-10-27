package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio4_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = 7;
        System.out.println("¡Adivina un numero del 1 al 10!");
        int numero;
        do{
            System.out.println("Introduce tu intento");
            numero= teclado.nextInt();


            if (numero<7){
                System.out.println("Pista: el numero es mayor");

            }else if (numero>7){
                System.out.println("Pista: el numero es menor");

            }



        }while(numero != numeroSecreto);
        System.out.println("¡Has acertado el numero!");



    }







}