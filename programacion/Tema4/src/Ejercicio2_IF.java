import java.util.Scanner;

public class Ejercicio2_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe cualquier numero");
        int numero = teclado.nextInt();
        if (numero>0){
            System.out.println("numero positivo");

        }else if (numero<0){
            System.out.println("numero negativo");
        }else if (numero==0){
            System.out.println("numero igual a 0");
        }





    }
}
