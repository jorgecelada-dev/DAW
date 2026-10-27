package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio3_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.println("introduce un  numero");
            numero = teclado.nextInt();
            if (numero>0){

                suma = suma + numero;
                System.out.println("Suma actual:" + suma);


            }else{
                System.out.println("Programa terminado, suma total: " + suma);
            }


        }while(numero>0);


    }
}
