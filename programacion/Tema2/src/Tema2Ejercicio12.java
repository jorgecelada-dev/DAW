
//Hágase una aplicación que lea dos cadenas y las compare del siguiente modo:

import java.util.Scanner;

public class Tema2Ejercicio12 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe la primera frase");
        String primeraFrase = teclado.nextLine();

        System.out.println("Escribe la segunda frase");
        String segundaFrase = teclado.nextLine();

        boolean sonIguales = primeraFrase.length() == segundaFrase.length();
        if (sonIguales) {
            System.out.println("Son igual de largas");
        }
        boolean sonDistintos = primeraFrase.length() != segundaFrase.length();
        if (sonDistintos) {
            System.out.println("son distintas de longitud");
        }
        boolean primeraFraseMayor = primeraFrase.length() > segundaFrase.length();
        if (primeraFraseMayor) {
            System.out.println("La primera frase es mas larga");
        }

    }
}
