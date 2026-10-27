package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio5_Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero del mes (1-12)");
        int mes = teclado.nextInt();

        String estacion;
        switch (mes){

            case 1, 2, 12:
                estacion = "Invierno";
            break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10, 11:
                estacion = "Otoño";
                break;

            default:
                estacion = "Cifra incorrecta";

        } System.out.println("El mes corresponde a: " + estacion);



    }
}
