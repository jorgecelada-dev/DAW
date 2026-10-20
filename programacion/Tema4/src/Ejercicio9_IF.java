//calculadora de IMC
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica tu peso");
        double peso = teclado.nextDouble();

        System.out.println("Indica tu altura");
        double altura = teclado.nextDouble();

        double imc = peso /(altura*altura);

        System.out.println("Tu IMC es: " + imc);

        if (imc<= 18.5){
            System.out.println("Estas por debajo del peso normal, ni a peso mosca llegas");
        }else if (imc>= 18.5 && imc<= 24.9){
            System.out.println("Estas en peso normal, pero sigues siedo feo macho");
        }else if (imc>24.9){
            System.out.println("estas como un camion, ve al gym");
        }




    }
}
