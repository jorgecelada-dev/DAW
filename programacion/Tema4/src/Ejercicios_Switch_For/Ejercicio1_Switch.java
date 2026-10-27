package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio1_Switch {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero del 1 al 7");


        String nombreDia;
        int dia = teclado.nextInt();
        switch (dia){
            case 1:
                nombreDia =  "Lunes";
                System.out.println("el dia 1 es : " + nombreDia);
                break;
            case 2:
                nombreDia =  "Martes";
                System.out.println("el dia 2 es : " + nombreDia);
                break;
            case 3:
                nombreDia =  "Miercoles";
                System.out.println("el dia 3 es : " + nombreDia);
                break;
            case 4:
                nombreDia =  "Jueves";
                System.out.println("el dia 4 es : " + nombreDia);
                break;
            case 5:
                nombreDia =  "Viernes";
                System.out.println("el dia 5 es : " + nombreDia);
                break;
            case 6:
                nombreDia =  "Sabado";
                System.out.println("el dia 6 es : " + nombreDia);
                break;
            case 7:
                nombreDia =  "Domingo";
                System.out.println("el dia 7 es : " + nombreDia);
                break;
            default:
                nombreDia = "Numero incorrecto";
                System.out.println(nombreDia);




        }








    }








}
