//Aplicación para camabio de temperaturas
//reasignacion de variables



import java.util.Scanner;

public class Tema2Ejercicio8 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca grados centigrados");
        double gradosCentigrados = teclado.nextDouble();
        double constanteKelvin = 273.15;
        double gradosKelvin = gradosCentigrados + constanteKelvin;
        double gradosFarenheit = (9 * gradosCentigrados)/5.0 + 32;

        System.out.printf("Grados  Farenheit:  %.2f\nGrados Kelvin:  %.2f\n", gradosFarenheit, gradosKelvin);

        System.out.println("Introduzca grados farenheit");
        gradosFarenheit = teclado.nextDouble();
        gradosCentigrados = (5*(gradosFarenheit-32)/9.0);
        gradosKelvin = 5*(gradosFarenheit - 32)/9 + constanteKelvin;

        System.out.printf("Grados Kelvin:  %.2f\nGrados Centigrados:  %.2f", gradosCentigrados, gradosKelvin);

        teclado.close();

    }
}
