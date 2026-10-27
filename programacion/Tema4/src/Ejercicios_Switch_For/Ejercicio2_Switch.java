package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio2_Switch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu calificación");
        String calificacion = teclado.nextLine();
        calificacion = calificacion.toUpperCase();

        if (calificacion.length() ==1) {
            String nombreCalificacion;
            char calificacionChar = calificacion.charAt(0); //podria haber hecho que fuera solo String pero por probar y hacerlo mas completo
            switch (calificacionChar) {

                case 'A':
                    nombreCalificacion = "Excelente";
                    break;

                case 'B':
                    nombreCalificacion = "Muy bien";
                    break;

                case 'C':
                    nombreCalificacion = "Bien";
                    break;

                case 'D':
                    nombreCalificacion = "Suficiente";
                    break;

                case 'F':
                    nombreCalificacion = "Insuficiente";
                    break;


                default:
                    nombreCalificacion = "Caracter incorrecto";
                    System.out.println(nombreCalificacion);
                    break;
            }System.out.println("calificación " + calificacionChar + ": " + nombreCalificacion);
        } else {
                System.out.println("Caracter incorrecto");

        }




        }
        }




