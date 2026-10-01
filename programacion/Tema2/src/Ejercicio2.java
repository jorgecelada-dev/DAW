//2ºA ejercicio, modificar valor de variable 3 veces, = declarar, int para numeros enteros, las sumas de derecha a izquierda

public class Ejercicio2 {
    public static void main(String[] args) {
        int puntuacion = 0;
        System.out.println("Puntuación inicial: " + puntuacion);
        puntuacion = 5;
        System.out.println("Después de primera modificación: " + puntuacion);
        puntuacion = 10;
        System.out.println("Después de segunda modificación: " + puntuacion);
        puntuacion = 15;
        System.out.println("Puntuación final: " + puntuacion);
        System.out.println("-----Metodo B------");

//2ºB mismo ejercicio pero utilizando la suma (metodo correcto)
        int puntuacion2 = 3;
        System.out.println("Puntuación inicial: " + puntuacion2);
        puntuacion2 = puntuacion2 + 5;
        System.out.println("Después de primera modificación: " + puntuacion2);
        puntuacion2 = puntuacion2 + 5;
        System.out.println("Después de segunda modificación: " + puntuacion2);
        puntuacion2 = puntuacion2 + 5;
        System.out.println("Puntuación final: " + puntuacion2);
    }
}
