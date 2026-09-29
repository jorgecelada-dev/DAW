//ejercicio para: Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args){

        final double precioBebida = 1.25;
        final double precioBocadillo = 2.05;

        Scanner teclado = new Scanner(System.in);

        System.out.println("El precio de la bebida es de " + precioBebida + ".¿Cuantas quieren?");
        int numeroDeBebidas = teclado.nextInt();
        double costeTotalBebidas = numeroDeBebidas*precioBebida;

        System.out.println("El precio del bocadillo es de " + precioBocadillo + ". ¿Cuantos quieren?") ;
        int numeroDeBocadillos = teclado.nextInt();
        double costeTotalBocadillos = numeroDeBocadillos*precioBocadillo;
        double costeTotalPedido = costeTotalBocadillos + costeTotalBebidas;

        System.out.println("Numero de bebidas: " + numeroDeBebidas);
        System.out.println("Numero de bocadillos: " + numeroDeBocadillos);
        System.out.println("Coste de las bebidas: " + costeTotalBebidas);
        System.out.println("Coste de los bocadillos: " + costeTotalBocadillos);
        System.out.println("Coste total del pedido: " + costeTotalPedido);












    }
}
