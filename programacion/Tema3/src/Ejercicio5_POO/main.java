package Ejercicio5_POO;

public class main {
    public static void main(String[] args){
        Coche coche1 = new Coche();
        Coche coche2 =new Coche("Toyota", "Corolla");
        Coche coche3 =new Coche("Seat", "Ibiza", 1998);

        System.out.println("Coche 1: " + coche1.marca + " - " + coche1.modelo + " - " +  coche1.anio);
        System.out.println("Coche 2: " + coche2.marca + " - " + coche2.modelo + " - " +  coche2.anio);
        System.out.println("Coche 3: " + coche3.marca + " - " + coche3.modelo + " - " +  coche3.anio);




    }
}
