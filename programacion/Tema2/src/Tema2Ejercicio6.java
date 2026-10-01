import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.println("¿Cuanto costó la compra?");
        double compraConIVA = teclado.nextDouble();
        /*boolean compraNoAutorizada = compraConIVA >= 500;
        if compraNoAutorizada {
        System.out.println("El precio excede el máximo");
        }*/

        System.out.println("¿Cuanto fue el IVA?");
        int IVA = teclado.nextInt();
        /*boolean IVANoAutorizada = IVA >= 25;
        if compraNoAutorizada {
        System.out.println("El precio excede el máximo");
        }*/
        double costeIVA = IVA*compraConIVA/100;
        double compraSinIVA = compraConIVA - costeIVA ;


        System.out.printf("Valor de la compra(Con IVA): %.2f $\n", compraConIVA);
        System.out.printf("IVA:  %.2f $ \n", costeIVA);
        System.out.printf("Valor de la compra (Sin IVA): %.2f $\n ", compraSinIVA);
        System.out.println("-----------------");
        System.out.println(compraConIVA + "$");

        teclado.close();



    }
}
