package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio6_IF {
    public static void main(String[] args) {
        System.out.println("introduce tu edad");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if (edad > 16){
            System.out.println("Acceso permimtido, cumples con el requisito de edad");

        }else if (edad < 16){
            System.out.println("Acceso denegado, debes tener al menos 16 años");

        }

    }
}
