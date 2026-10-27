package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio7_IF {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe tu nota (1-10)");
        double nota = teclado.nextDouble();
        if ( nota<0 || nota >10) {
            System.out.println("nota no valida");
        }else if(0<=nota && nota<5){
            System.out.println("Tu calificacion es: Suspenso");
        }else if (5<=nota && nota<7){
            System.out.println("Tucalificación es: Aprobado");
        }else if (7<=nota && nota<9){
            System.out.println("Tu calificacion es: Notable");
        }else if (9<=nota || nota<=10){
            System.out.println("Tu calificacion es: Sobresaliente");
        }
        }
      }

