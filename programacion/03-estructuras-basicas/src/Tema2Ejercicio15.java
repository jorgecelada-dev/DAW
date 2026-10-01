/*Se lee un entero que se modifica de la siguiente manera:

a) Incrementar en 5 unidades (+=5).
b) Decrementar en 3 unidades(-=3).
c) Multiplicar por 10 (*=10)
d) Dividir por 2 (/=2)
e) Mostrar dicho entero en cada uno de los apartados anteriores.

(AsignarEntero)
*/


import java.util.Scanner;

public class Tema2Ejercicio15 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero entero");
        int numero = teclado.nextInt();

        int numero1 = numero + 5;
        int numero2 = numero1 - 3;
        int numero3 = numero2 * 10;

        System.out.println("Entero: " + numero);
        System.out.println("Incrementar 5 unidades: " + numero1);
        System.out.println("Decrementar 3 unidades: " + numero2);
        System.out.println("Multiplicar por 10: " + numero3);

        System.out.println();
    }
}
