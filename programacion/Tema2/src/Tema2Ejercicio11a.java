import java.util.Scanner;

public class Tema2Ejercicio11a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero de 0 al 100:");
        int numero = teclado.nextInt();
        int restonumero = numero%2;                  //si es divisible entre 2 y resto 0 = True

        boolean par = restonumero == 0;
        System.out.println("Par: " + par);

        boolean mayor = numero >50;
        System.out.println("Mayor que 50: " + mayor);

        teclado.close();
    }
}
