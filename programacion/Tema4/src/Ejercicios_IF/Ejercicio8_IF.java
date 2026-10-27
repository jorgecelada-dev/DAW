package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio8_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("escribe el primer numero");
        double numero1 = teclado.nextDouble();

        System.out.println("Escribe le segundo numero");
        double numero2 = teclado.nextDouble();

        if (numero1 > numero2){
            System.out.printf("El numero %.1f es mayor que %.1f", numero1, numero2);
        }else if (numero1 < numero2){
            System.out.printf("El numero %.1f es menor que %.1f", numero1, numero2 );
        }else if (numero1 == numero2){
            System.out.println("Los numeros son iguales");   //como hago para que aunque le numero sea double, si no tiene decimales no me salga el .0?
        }




    }
}
