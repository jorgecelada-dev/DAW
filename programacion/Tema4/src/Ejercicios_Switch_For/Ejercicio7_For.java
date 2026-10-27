package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio7_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un digito: ");
        int digitoN = teclado.nextInt();
        teclado.close();


        int sumatorio =0;
        String expresion ="";
        for (int i=1; i<= digitoN; i++){ // digito = 5 = 1+2+3+4+5
            sumatorio = sumatorio + i;
            if(i!=1 ){                       // no se si este es el metodo correcto
                expresion = expresion + "+" + i ;
                break;


            }else{
                expresion = expresion + i;
                break;

            }


        }System.out.println("Sumando: " + expresion) ; // para imprimir los valores en una misma linea hay que guardar los valores en un tipo string
        System.out.println("La suma total del 1 al "  + digitoN + " es: " + sumatorio);






    }
}
