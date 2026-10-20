import java.util.Scanner;

public class Ejercicio5_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numero = teclado.nextInt();
        if ((numero%2) == 0){
            System.out.println("El numero es par");

        }else if ((numero%2) != 0 ){
            System.out.println("El numero es impar");
        }

    }
}
