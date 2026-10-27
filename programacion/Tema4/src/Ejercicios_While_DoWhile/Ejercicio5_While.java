//programa menu
package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio5_While {
    public static void main(String[] args) {

        int opcion;
        do{
            System.out.println("--- MENU---\n 1.Saludar\n 2.Despedirse\n 3.Ver hora\n 4.Salir\n");
            System.out.println("Elige una opcion");
            Scanner teclado= new Scanner(System.in);
            opcion = teclado.nextInt();



             switch(opcion){
                 case 1:
                     System.out.println("Hola buenos dias!!");
                     break;
                 case 2:
                     System.out.println("Adios, hasta luego!");
                     break;
                 case 3:
                     System.out.println("Hora actual: 12:30");
                     break;


             }


        }while(opcion != 4);
            System.out.println("Programa cerrado");


        }


    }

