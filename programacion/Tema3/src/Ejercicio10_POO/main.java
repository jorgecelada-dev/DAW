package Ejercicio10_POO;

public class main {
    public static void main(String[] args) {

        Movil movil1 = new Movil("Samsung", "Galaxy A15");
        Movil movil2 = new Movil("Xiaomi", "Redmy note 13", 128);
        Movil movil3 = new Movil("Apple", "Iphone 16 Pro", 256, true);

        System.out.println("Movil 1: " + movil1.marca + " - " + movil1.modelo + " - " + movil1.alamcenamiento + " GB" + " - " + "Encendido: " + movil1.encendido);
        System.out.println("Movil 2: " + movil2.marca + " - " + movil2.modelo + " - " + movil2.alamcenamiento + " GB" + " - " + "Encendido: " + movil2.encendido);
        System.out.println("Movil 3: " + movil3.marca + " - " + movil3.modelo + " - " + movil3.alamcenamiento + " GB" + " - " + "Encendido: " + movil3.encendido);
    }
}
