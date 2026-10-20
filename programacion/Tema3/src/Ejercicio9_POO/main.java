package Ejercicio9_POO;

public class main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jorge");
        Jugador jugador2 = new Jugador("Alex", 3);
        Jugador jugador3 = new Jugador("Sierra", 5, 380);

        System.out.println("Jugador 1: " + jugador1.nombre + " - " + "Nivel: " + jugador1.nivel + " - " + "Puntuacion: " +  jugador1.puntuacion);
        System.out.println("Jugador 2: " + jugador2.nombre + " - " + "Nivel: " + jugador2.nivel + " - " + "Puntuacion: " + jugador2.puntuacion);
        System.out.println("Jugador 3: " + jugador3.nombre + " - " + "Nivel: " + jugador3.nivel + " - " + "Puntuacion: " + jugador3.puntuacion);

        jugador1.puntuacion= jugador1.puntuacion + 50;

        System.out.println();
        System.out.println("Puntuación despues del cambio: ");
        System.out.println(jugador1.nombre + ":" + jugador1.puntuacion);
        System.out.println(jugador2.nombre + ":" + jugador2.puntuacion);
        System.out.println(jugador3.nombre + ":" + jugador3.puntuacion);
    }

}
