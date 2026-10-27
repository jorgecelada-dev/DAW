package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio3_Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu primer digito: ");
        double digito1 = teclado.nextDouble();
        System.out.println("Introduce tu segundo digito: ");
        double digito2 = teclado.nextDouble();
        System.out.println("Introduce el operador( +, - *, /): ");
        String operador = teclado.next();
        double operacion = 0.00 ;    // NO ESTOY SEGURO DE SI ES EL MEJOR METODO
                switch (operador) {

                    case "+":
                        operacion = digito1 + digito2;
                        break;

                    case "-":
                        operacion = digito1 - digito2;

                        break;
                    case "*":
                        operacion = digito1 * digito2;
                        break;

                    case "/":
                        operacion = digito1 / digito2;
                        break;

                    default:
                        System.out.println("Resultado: operador incorrecto");


                } System.out.println("Resultado:" + operacion);
    }
}
