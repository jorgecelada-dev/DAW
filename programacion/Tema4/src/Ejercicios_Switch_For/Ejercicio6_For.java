package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio6_For {
    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        Scanner teclado = new Scanner(System.in);
        int digito = teclado.nextInt();
        teclado.close();
        System.out.println("Tabla del " + digito + ": ");
        for (int i=1; i<=10; i++ ){
            int resultado = digito * i;

            System.out.println(digito + " x " + i + " = " + resultado);

        }



    }
}
