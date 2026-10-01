import java.util.Scanner;

public class Primerospasos1 {
    public static void main(String[] args){
        System.out.println("Programa para explicar los operadores");
        Scanner lector = new Scanner(System.in);                          //variable scanner sirve para leer datos del terminal por teclado
        System.out.println("indicame tu nombre");     //depende del tipo de dato que uqieras leer, a variable dato tiene metodos para ello (next.line)
        double media = lector.nextDouble();
        String nombre = lector.nextLine();
        String ciclo = lector.nextLine();
        System.out.println("Nombre: "+nombre);
        System.out.println("Ciclo: "+ciclo);
        System.out.println("Media: "+media);

    }

}
