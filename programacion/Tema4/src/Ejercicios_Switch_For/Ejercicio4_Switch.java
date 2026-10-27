package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio4_Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--- MENU ---\n 1.Ver perfil\n 2.Configuracion\n 3.Ayuda\n 4.Salir\n");
        System.out.println("Elige una opcion");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Has elegido: Ver perfil");
                break;
            case 2:
                System.out.println("Has elegido: Configuracion");
                break;
            case 3:
                System.out.println("Has elegido: Ayuda");
                break;
            case 4:
                System.out.println("Has elegido: Salir" );
                break;
        }








    }
}
