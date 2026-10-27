package Ejercicios_IF;

import java.util.Scanner;

public class Ejercicio13_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce tu edad:");
        int edad = teclado.nextInt();

        System.out.println("Introduce el dia de la semana (1-7)");
        int diaSemana = teclado.nextInt();

        boolean esMenor = edad <= 13;
        boolean esJoven = edad > 13 && edad <= 18 ;
        boolean esAdulto = edad >18 && edad <= 65;
        boolean esMayor = edad < 65;




        System.out.println("Edad: " + edad);
        String dia = "fecha no correcta";
        if (diaSemana == 1){
            dia = "Lunes";
        }else if (diaSemana == 2){
            dia = "Martes";
        }
        else if (diaSemana == 3){
            dia = "Miercoles";
        }else if (diaSemana == 4){
            dia = "Jueves";
        }
        else if (diaSemana == 5){
            dia = "Viernes";
        }
        else if (diaSemana == 6){
            dia = "Sabado";
        }
        else if (diaSemana == 7){
            dia = "Domingo";
        }





        int precioEntrada = 0;


        if (edad <= 12) {
            precioEntrada = 0;
            System.out.println("Entrada gratuita para menores de 13 años");

        } else if (edad > 12 && edad < 18 && diaSemana == 2) {
            precioEntrada = 0;
            System.out.println("Entrada gratuita para jovenes de 13 a 17 los martes: " + precioEntrada + "$");
        } else if (edad >= 12 && edad < 18 && diaSemana != 2) {
            precioEntrada = 5;
            System.out.println("Entrada para jovenes de entre 13 - 17 (excepto martes): " + precioEntrada + "$");
        } else if (edad > 18 && edad < 65 && diaSemana ==4) {
            precioEntrada = 7;
            System.out.println("Entrada reducida para personas de entre 18 - 65 los jueves: " + precioEntrada + "$");
        } else if (edad > 18 && edad < 65 && diaSemana !=4) {
            precioEntrada = 10;
            System.out.println("Entrada para personas de entre 18 - 65 (excepto jueves): " + precioEntrada + "$");
        } else if (edad >= 65){
            precioEntrada = 6;
            System.out.println("Entrada reducida para mayores de 65: " + precioEntrada + "$");
        }


        System.out.println("Dia de la semana: " + dia);
        System.out.println("Precio de la entrada: " + precioEntrada + "$");
        System.out.println("¿Es menor?  " + esMenor);
        System.out.println("¿Es joven?  " + esJoven);
        System.out.println("¿Es mayor?  " + esMayor);
        System.out.println("¿Es adulto??  " + esAdulto);




    }
}
