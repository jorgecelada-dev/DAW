//uso de constantes para almacenar información (constantes vs variables)
//chuleta import java.util.Scanner;          // 1. Arriba del todu, antes de public class
//Scanner teclado = new Scanner(System.in);   // 2. Dentro del main, una sola vez
//String texto = teclado.nextLine();   // 3a. Leer un texto
//int numero = teclado.nextInt();      // 3b. Leer un número entero

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        final String NOMBRE_APLICACION = "ChronosWorlds";    //constante
        //nombreAplicacion = "Otro Nombre"; nunca dejaria  diria por el ->final: cannot assign a value to final variable nombreAplicacion
        System.out.println("Aplicación: " + NOMBRE_APLICACION);
        final String VERSION = "1.0.0";                            //constante
        System.out.println("Versión actual: " + VERSION);
        final double VALOR_DE_PI = 3.14159;                            //constante
        System.out.println("Valor de PI: " + VALOR_DE_PI);

        Scanner teclado = new Scanner(System.in);          //var compleja, siempre poner new     (variable)


        System.out.println("Escribe tu nombre");
        String usuario = teclado.next();                             //variable


        System.out.println("¿Que nivel eres?");
        int nivelDeUsuario = teclado.nextInt();                         //variable

        System.out.println("¿Cual es tu puntuación?");
        int puntuacionTotal = teclado.nextInt();                       //variable

        System.out.println("Aplicación: " + NOMBRE_APLICACION);
        System.out.println("Versión actual: " + VERSION);
        System.out.println("Valor de PI: " + VALOR_DE_PI);
        System.out.println("Usuario: " + usuario);
        System.out.println("Nivel: " + nivelDeUsuario);
        System.out.println("Puntuación: " + puntuacionTotal);


        System.out.println("Escribe tu nombre");
        usuario = teclado.next();                                   //variable

        System.out.println("¿Que nivel eres?");
        nivelDeUsuario = teclado.nextInt();               //variable

        System.out.println("¿Cual es tu puntuación?");
        puntuacionTotal = teclado.nextInt();                            //variable

        System.out.println("Aplicación: " + NOMBRE_APLICACION);
        System.out.println("Versión actual: " + VERSION);
        System.out.println("Valor de PI: " + VALOR_DE_PI);
        System.out.println("Nuevo usuario: " + usuario);
        System.out.println("Nivel de nuevo usuario: " + nivelDeUsuario);
        System.out.println("Puntuación de nuevo usuario: " + puntuacionTotal);



    }
}
