import java.util.Scanner;

public class Ejercicio10_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("indica tu altura en centimetros");
        double altura = teclado.nextDouble();
        if (altura>=120 && altura<= 200){
            System.out.println("Puedes subir a la atraccion");
        }else if (altura<=120){
            System.out.println("Eres enano no puede subir");
        }else if (altura>=200){
            System.out.println("Eres demasiado alto, te vas a abrir la cabeza con una viga");
        }


    }
}
