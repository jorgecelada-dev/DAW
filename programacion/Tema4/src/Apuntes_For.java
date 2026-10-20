//estructuras de repeticio, lo ejecutara el numero "n" veces que s eindique
//1º estructura de repeticion foreach (repite un conjunto de lineas (bloque), dependiendo de un rango de datos (0veces....nveces)
// problema principal-> que ocurra bucle infinito
//2º estructura while -> ejecuto un bloque dependiendo de ua condicion booleana (garantizo la ejecucion de 0 a n veces)
//2ºB estructura dowhile -> iejecuto un bloque 0gual que elk anterior pero aseguro que minimo lo ejecuto 1 vez
//SENTENCIAS DE REPETICION:

import java.util.Scanner;

public class Apuntes_For {
    public static void main(String[] args) {

        /*5 repeticiones )usare un for por que es iun numero concreto de veces

        for(inicio ; final; incremento){
        for (int i=0) ; i<5 ; i++)   -> se declara la variable dentro del for, no la quieres utilizar fuera, esta variable suele llamarse con un char simple
        }


        for (int i = 0; i<5; i++){
            //si quieres que sea decreciente: for(int i=10; i<=0; i--){}
            if(i%2 ==0) {       //condicion para que solo ejecute cuandoe s par
                System.out.println("inicio del for");
                System.out.printf("ejecucion %d bucle for\n", i);
                System.out.println("final del for");
            }
        }
*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("de que numero queres saber la table de multiplicar");
        int numero = teclado.nextInt(); //8
        for(int i= 0; i <=10; i++) {
            System.out.printf("la multiplicacion del %d * %d = %d\n", numero, i, numero * i);
            for(int j=0; j<=10; j++){
                System.out.printf("la multiplicacion del %d * %d = %d\n", i, j, j * i);

            }

        }
    }
}
