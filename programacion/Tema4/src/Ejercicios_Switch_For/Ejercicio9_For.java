package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio9_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo");
        int numero = teclado.nextInt();
        System.out.println("Calculando " + numero + "!");

        int factorial = 1;
        String operacion = "";

        for (int i = 1; i<= numero; i++){  // para 5 -> 5x4x3x2x1
            factorial =  factorial * i;     // 1 x n

            if(i!=1){
            operacion = i + " X " + operacion;

            }else{
             operacion = i + operacion   ;

            }




        }


        System.out.println(operacion);
        System.out.println("El factorial de " + numero + " es: " + factorial);


    }

}
