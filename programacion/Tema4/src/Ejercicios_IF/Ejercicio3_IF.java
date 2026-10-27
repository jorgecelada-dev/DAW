package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio3_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu nota");
        double nota = teclado.nextDouble();
        if (nota >= 5){
            System.out.println("examen aprobado");
        }else if (nota <= 5){
            System.out.println("examen suspendido");
        }


    }
}
