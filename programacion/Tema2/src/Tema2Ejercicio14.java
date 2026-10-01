/*Hágase una aplicación que permita introducir la edad de una persona
(valores enteros entre 0 y 100), su nivel de estudios (valores entre 0 y 10)
y sus ingresos (valores enteros entre 0 y 25000).
Compruébese (mostrándose verdadero o falso) si dicha persona tiene más de 40 años,
 un nivel de estudios entre 5 y 8, ambos incluisives, y gana menos de 15000 €.
 (CondicionLogica)
 */


import java.util.Scanner;

public class Tema2Ejercicio14 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es tu edad?");
        int edad = teclado.nextInt();

        System.out.println("¿Y tu nimel de estudios?");
        int estudios = teclado.nextInt();

        System.out.println("Y por ultimo, ¿Ingresos mensuales?");
        int ingresos = teclado.nextInt();

        boolean condicionEdad = edad > 40;
        boolean condicionEstudios = estudios > 40;
        boolean condicionIngresos = ingresos > 40;
        boolean condicionCompleta = edad > 40 && 5 > estudios && estudios < 8 && ingresos < 15000;

        System.out.println("Edad: " + edad);
        System.out.println("Nivel de estudios: " + estudios);
        System.out.println("Ingresos: " + ingresos);
        System.out.println("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: " + condicionCompleta);

        teclado.close();

    }
}