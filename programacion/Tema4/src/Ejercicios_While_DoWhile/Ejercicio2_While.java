package Ejercicios_While_DoWhile;

import java.util.Scanner;

public class Ejercicio2_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasenaCorrecta = "1234";
        String contrasena;
        do {
            System.out.println("Escribe la contraseña:");
            contrasena = teclado.nextLine();

            if(!contrasena.equals(contrasenaCorrecta)){
                System.out.println("Contraseña incorrecta, intenta de nuevo");  //no estoy seguro de si habia que usar el if en esta situacion

            }else{
                System.out.println("Contraseña correcta!");
            }



        } while (!contrasena.equals(contrasenaCorrecta) );



        }











}

