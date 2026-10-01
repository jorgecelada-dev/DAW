//descomposicion de un numero

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 digitos");
        int numero = teclado.nextInt(); //54321

        int dDeMil = numero/10000;   //5,4321 -> 5
        int resto1 = numero%10000; //4321

        int uDeMil = resto1/1000;  //4.321 ->4
        int resto2 = resto1%1000; //321

        int centenas = resto2/100;  //3,21 -> 3
        int resto3 = resto2%100; //21

        int decenas = resto3/10;   //2,1 ->1
        int resto4= resto3%10;    //1

        System.out.println("Decenas de mil: "+ dDeMil);
        System.out.println("Unidades de mil: "+ uDeMil);
        System.out.println("Centenas: "+ centenas);
        System.out.println("Decenas: "+ decenas);
        System.out.println("Unidades: "+ resto4);

        teclado.close();

    }
}
