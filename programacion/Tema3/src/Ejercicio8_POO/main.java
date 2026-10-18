package Ejercicio8_POO;

public class main {
    public static void main(String[] args){
        EntradaCine entrada1 = new EntradaCine("Toy Story");
        EntradaCine entrada2 = new EntradaCine("Encanto", 3, 8.5);

        System.out.println("Entrada 1: " + entrada1.titulo + " - " + "Sala " + entrada1.sala + " - " + entrada1.precio +"$" );
        System.out.println("Entrada 2: " + entrada2.titulo + " - " + "Sala " + entrada2.sala + " - " + entrada2.precio +"$" );
        System.out.println("Total de las entradas: " + (entrada1.precio+entrada2.precio) + "$");

    }
}
