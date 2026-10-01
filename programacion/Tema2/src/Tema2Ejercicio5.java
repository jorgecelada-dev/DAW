import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ponga numero de segundos");
        double segundos = teclado.nextDouble();
        double horas = (int) segundos/3600;
        double horasresto = segundos%3600;
        double minutos = (int)horasresto/60;
        double minutosresto = segundos%60;
        double segundosresto = minutosresto;
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosresto);
        teclado.close();
    }
}
