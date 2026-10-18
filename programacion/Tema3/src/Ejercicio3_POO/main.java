package Ejercicio3_POO;

public class main {
    public static void main(String[] args){
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Narnia","JK Rowlin",567);
        System.out.println("Libro 1:" + libro1.nTitulo+ " - " + libro1.nAutor +  " - " +libro1.nPagina + " paginas");
        System.out.println("Libro2: " + libro2.nTitulo + " - " + libro2.nAutor +  " - " +libro2.nPagina + " paginas");







    }
}
