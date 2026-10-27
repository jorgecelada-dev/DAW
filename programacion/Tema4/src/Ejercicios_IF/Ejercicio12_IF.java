package Ejercicios_IF;// validador de contraseña


import java.util.Scanner;

public class Ejercicio12_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Establece tu contraseña: ");
        String contraseña = teclado.nextLine();
        System.out.println("Longitud de contraseña: " + contraseña.length());

        boolean longitudValida = contraseña.length() >=8;
        System.out.println("¿Tiene al menos 8 caracteres? " + longitudValida);

        boolean contieneNumero = contraseña.contains("1")
                || contraseña.contains("2")
                || contraseña.contains("3")
                || contraseña.contains("4")
                || contraseña.contains("5")
                || contraseña.contains("6")
                || contraseña.contains("7")
                || contraseña.contains("8")
                || contraseña.contains("9")
                || contraseña.contains("0");
        System.out.println("¿Contiene al menos un numero?. " + contieneNumero);


        boolean contraseñaProhibida = contraseña.equals("12345678") || contraseña.equals("password");
        System.out.println("¿Es una contraseña prohibida?: " + contraseñaProhibida);

        boolean contraseñaValida = longitudValida && contieneNumero && !contraseñaProhibida;


        if (longitudValida == false){
            System.out.println("Contraseña NO valida, no cumple con el numero de caracteres minimos");
        }
        if (contieneNumero == false){
            System.out.println("Contraseña NO valida, debe contener al menos un número");
        }
        if (contraseñaProhibida == true){
            System.out.println("Contraseña NO valida, es una palabra prohibida");
        }
        if (contraseñaValida==true){
            System.out.println("¿La contraseña cumple con todos los requisitos? " + contraseñaValida);
        }















    }
}
