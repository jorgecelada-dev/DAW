import java.util.Scanner;

public class Tema2Ejercicio3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el operador 1, debe ser entero:");
        int operador1 = teclado.nextInt();
        System.out.println("Escribe el operador 2, debe ser entero:");
        int operador2 = teclado.nextInt();

        int suma = operador1 + operador2;
        int resta = operador1 - operador2;
        int multiplicacion = operador1 *operador2;
        int division = operador1/ operador2;
        double divisionReal = (double) operador1 / operador2;
        double restoReal = (double) operador1 % operador2;
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+ multiplicacion);
        System.out.println("Division: " +division);
        System.out.println("Resto Real: " +restoReal);
        System.out.println("Division Real: " +divisionReal);

        teclado.close();
    }
}
