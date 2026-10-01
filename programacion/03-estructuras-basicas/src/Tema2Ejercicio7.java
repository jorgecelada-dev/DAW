//Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100.
//Obténgase la longitud de la circunferencia (2πr) y el área del circulo (πr2) .


import java.util.Scanner;

public class Tema2Ejercicio7 {
     static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("radio de una circunferencia Entera: ");
        int radioCircunferencia = teclado.nextInt();
        double longitud = 2 *Math.PI*radioCircunferencia;
        double areaCirculo = Math.PI* Math.pow(radioCircunferencia, 2);          //potencia
        System.out.println("longitud de circunferencia: " + longitud);
        System.out.println("area de circunferencia: " + areaCirculo);

        teclado.close();
    }
}
