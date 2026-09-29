import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double PRECIOMAXIMOBEBIDA = 3;
        final double PRECIOMAXIMOBOCADILLO = 3;
        final int CANTIDADMAXIMABEBIDA = 20;
        final int CANTIDADMAXIMABOCADILLO = 20;

        System.out.println("Bienvenido al restourante EL PRECIO JUSTO");

        System.out.println("Camarero: Precio de la bebida?");
        double precioBebida = teclado.nextDouble();
        boolean precioBebidaNoValido = precioBebida >= PRECIOMAXIMOBEBIDA;
        if (precioBebidaNoValido) {
            System.out.println("El precio de bebida supera el maximo permitido");
        }

        System.out.println("Cliente: ¿Cuantas bebidas quiere?");
        int cantidadBebida = teclado.nextInt();
        boolean cantidadBebidaNoValido = precioBebida >= PRECIOMAXIMOBEBIDA;
        if (cantidadBebidaNoValido){
        System.out.println("La cantidad de bebidas supera el maximo permitido");
        }

        System.out.println("Camarero: Precio del bocadillo?");
        double precioBocadillo = teclado.nextDouble();
        boolean precioBocadilloNoValido = precioBocadillo >= PRECIOMAXIMOBOCADILLO;
        if (precioBocadilloNoValido){ System.out.println("El precio de bocadillo supera el maximo permitido");
        }

        System.out.println("Cliente: ¿Cuantos bocadillos quiere?");
        int cantidadBocadillo = teclado.nextInt();
        boolean cantidadBocadilloNoValido = precioBebida >= CANTIDADMAXIMABOCADILLO;
        if (cantidadBocadilloNoValido) {
        System.out.println("La cantidad de bocadillos supera el maximo permitido");
        }

        double precioTotalBebidas = precioBebida * cantidadBebida;
        double precioTotalBocadillos = precioBocadillo * cantidadBocadillo;
        double precioTotal = precioTotalBebidas + precioTotalBocadillos;


//&s string, %d int %f float (2decimales -> )

        System.out.println(" ARTICULO       CANTIDAD       PRECIO       COSTE");
        System.out.println("==========     ==========     ========     ========");
        System.out.printf("Bebida             %.2d            %.2f       %.2f\n", cantidadBebida, precioBebida, precioTotalBebidas);
        System.out.printf("Bocadillo          %.2d            %.2f       %.2f\n", cantidadBocadillo, precioBocadillo, precioTotalBocadillos);
        System.out.printf("TOTAL                                           %.2f\n", precioTotal);
        System.out.println("---------------------------------------------------------");
    }}





