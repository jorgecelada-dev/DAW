package Ejercicio2_POO;

public class main {          //punto de entrada desde el que se crean las mascotas
    static void main(String[] args) {
        Mascota mascota1 = new Mascota("Luna", "Gato", 3);
        Mascota mascota2 = new Mascota("Ava","Perro", 10);

        System.out.println("Mascota 1: " + mascota1.nombre + " - " + mascota1.raza + " - " + mascota1.edad);
        System.out.println("Mascota 2: " + mascota2.nombre + " - " + mascota2.raza + " - " + mascota2.edad);
        System.out.println(mascota1);


    }
}
