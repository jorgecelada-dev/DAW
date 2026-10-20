package Ejercicio8_POO;

public class EntradaCine {
    String titulo;
    int sala;
    double precio;

    public EntradaCine(String titulo){
        this.titulo = titulo;
        this.sala = 1;
        this.precio = 7.5;
    }
    public EntradaCine(String titulo, int sala, double precio){
        this.titulo = titulo;
        this.sala = sala;
        this.precio = precio;
    }
}
