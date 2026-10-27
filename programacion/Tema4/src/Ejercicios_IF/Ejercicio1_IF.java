package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio1_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿que edad tienes?");
        int edad = teclado.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor de edad, puedes votar");
        }else{
            System.out.println("No eres mayor de edad");
        }

    }
}
