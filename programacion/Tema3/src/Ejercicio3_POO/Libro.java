package Ejercicio3_POO;

public class Libro {
    String nTitulo;
    String nAutor;
    int nPagina;
    public Libro(){
        this.nTitulo = "Sin título";
        this.nAutor = "Autor desconocido";
        this.nPagina = 0;
    }
    public Libro (String nTitulo, String nAutor, int nPagina){
        this.nTitulo = nTitulo;
        this.nAutor = nAutor;
        this.nPagina = nPagina;

    }
}
