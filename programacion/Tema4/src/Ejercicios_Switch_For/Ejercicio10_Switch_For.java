package Ejercicios_Switch_For;

import java.util.Scanner;

public class Ejercicio10_Switch_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("--EJERCICIOS--\n 1.Flexiones\n 2.Abdominales\n 3.Sentadillas\n");
        System.out.println("Elije un ejercicio (1-3):");
        int ejercicio = teclado.nextInt();
        System.out.println("Cuantas repeticiones?:");
        int repeticiones = teclado.nextInt();
        String nombreEjercicio = "";   // sigo sin estar seguro de si este metodo es correcto declarando la variable vacia o ay mejores

        switch (ejercicio){
            case 1:
                nombreEjercicio = "Flexiones";
                break;
            case 2:
                nombreEjercicio = "Abdominales";
                break;
            case 3:
                nombreEjercicio = "Sentadillas";
                break;

            default:
                nombreEjercicio = "incorrecto";
        }System.out.println("Has elegido: " + nombreEjercicio);
        System.out.println("Numero de repeticiones: " + repeticiones);

        for (int i=1; i<=repeticiones; i++){
            System.out.println("Repeticion " + i + " -> Completada");


        } System.out.println("Enhorabuena! has realizado " + repeticiones + " " + nombreEjercicio);




    }
}
