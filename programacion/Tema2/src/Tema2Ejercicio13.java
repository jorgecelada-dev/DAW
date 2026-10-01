/*Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso)
 las siguientes condiciones e indíquese cómo se evalúan:
a) El primero es par y el segundo impar

b) El primero es superior al doble del segundo e inferior a 8

c) Son iguales o la diferencia entre el primero y el segundo es menor que 2*/

import java.util.Scanner;

public class Tema2Ejercicio13 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        double primerNumero = teclado.nextDouble();
        System.out.println("Escribe el segundo numero");
        double segundoNumero = teclado.nextDouble();
        double restoPrimerNumero = primerNumero % 2;
        double restoSegundoNumero = segundoNumero % 2;

        boolean condicion1 = restoPrimerNumero == 0 && restoSegundoNumero != 0;
            System.out.println("El primero es par y el segundo impar: " + condicion1);
        boolean condicion2 = primerNumero > (2*segundoNumero) && primerNumero < 8;
            System.out.println("El primero es superior al doble del segundo e inferior a 8: " + condicion2);
        boolean condicion3 = primerNumero == segundoNumero || (primerNumero-segundoNumero) < 2;
            System.out.println("Son iguales o la diferencia entre el primero y el segundo es menor que 2: " + condicion3);
        teclado.close();

    }
}


