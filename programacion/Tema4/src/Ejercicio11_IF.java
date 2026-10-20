import java.util.Scanner;

public class Ejercicio11_IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indica el importe de tu compra");
        double importe = teclado.nextDouble();

        System.out.println("¿Eres socio? Escribe true o false");
        boolean socio = teclado.nextBoolean();

        System.out.println("Importe original: " + importe + "$");

        if (socio == true && importe>=200){
            double descuentoSocio1 = importe*0.2;
            System.out.println("Eres socio y tu compra supera 200$");
            System.out.println("Tu descuento aplicado es del 20%: "+ descuentoSocio1 + "$");
            importe = importe - descuentoSocio1;
            System.out.println("Importe final: " +  importe + "$");

        }else if (socio == true && importe<200){  // tambien podria quitar el socio == true y dejarlo solo como socio && importe..., pero asi me aclaro
            double descuentoSocio2 = importe*0.1;
            System.out.println("Eres socio y tu compra no supera 200$");
            System.out.println("Tu descuento aplicado es del 10%: "+ descuentoSocio2 + "$");
            importe = importe - descuentoSocio2;
            System.out.println("Importe final: " +  importe);

        }else if (socio == false && importe>=300) {
            double descuentoNoSocio = importe * 0.05;
            System.out.println("No eres socio y tu compra supera 300$");
            System.out.println("Tu descuento aplicado es del 5%: " + descuentoNoSocio + "$");
            importe = importe - descuentoNoSocio;
            System.out.println("Importe final: " + importe + "$");
        }else {
            System.out.println("Tu descuento aplicado es del 0%: 0");
            System.out.println("Importe final: " + importe + "$");

        }






    }
}
