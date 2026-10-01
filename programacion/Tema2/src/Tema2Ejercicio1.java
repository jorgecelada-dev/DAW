import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Escribe tu direccion");
        String direccion = teclado.nextLine();       // importante recordar que nextLine sirve para leer la linea entera sino el numero se colocará en el siguioiente valor
        System.out.println("Escribe tu codigo postal");
        int codigoPostal = teclado.nextInt();
        teclado.nextLine();                          //importante lo del buffer, el enter cuenta como un caracter por lo que se salta la linea automaticamente
        System.out.println("Escribe tu ciudad");
        String ciudad = teclado.nextLine();
        System.out.println("Escribe tu pais de nacimeinto");
        String paisDeNacimiento = teclado.nextLine();
        System.out.printf("%s\n%s\n%s %d\n%s\n", nombre, direccion, ciudad, codigoPostal, paisDeNacimiento);

        teclado.close();


    }
}
