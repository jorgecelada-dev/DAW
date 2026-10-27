package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercico8_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = teclado.nextInt();
        System.out.println("Recorriendo numeros del 1 al " + numero);
        int numerosPares = 0;
        int numerosImpares = 0;

        for (int i=1; i<=numero; i++){
            if( i%2 ==0){
                numerosPares = numerosPares + 1 ;
                break;

            }else {
                numerosImpares = numerosImpares + 1;
                break;

            }



        }
        System.out.println("Numeros pares encontrados: " + numerosPares);
        System.out.println("Numeros impares encontrados: " + numerosImpares);


    }
}
