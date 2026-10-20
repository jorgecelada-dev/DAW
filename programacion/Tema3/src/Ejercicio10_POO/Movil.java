package Ejercicio10_POO;

public class Movil {
    String marca;
    String modelo;
    int alamcenamiento;
    boolean encendido;

    public Movil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.alamcenamiento = 64;
        this.encendido = false;
    }

    public Movil(String marca, String modelo, int almacenamiento){
        this.marca = marca;
        this.modelo = modelo;
        this.alamcenamiento = almacenamiento;
        this.encendido = false;
    }

    public Movil(String marca, String modelo, int almacenamiento, boolean encendido){
        this.marca = marca;
        this.modelo = modelo;
        this.alamcenamiento = almacenamiento;
        this.encendido = encendido;
    }

}
