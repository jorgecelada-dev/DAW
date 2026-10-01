import java.util.Scanner;

public class ApuntesOperadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //operadores aritméticos -> + - * / % (cuidado con la + de dos strings)

        /*double operador1 = 5;
        int operador2 = 2;
        double suma = operador1 + operador2;
        double resta = operador1-operador2;
        double multiplicacion = operador1*operador2;
        double division = operador1/operador2;  //la division de dos enteros da un entero
        double division2 = operador1/operador2;  //como los dos son enteros para operar lo facil seria convertir todos en double pero que pasa si no quiero que sean double*/
        int operador1 = 7;
        int operador2 = 2;
        int suma = operador1 + operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double) operador1/operador2;   //le añado el double antes de esribir el operador-> operador 1 ya no es un entero pero solo en esa linea (puede ser uno de los dos)
        int resto = operador1%operador2;           // % es le resto de la division
        String numero1 ="5";
        String numero2 = "7";

        System.out.println("la suma es: " +suma);
        System.out.println("la resta es: "+ resta);
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("la division es: " + division);
        System.out.println("el resto es: " + resto);   //saber si es par//saber si segundos entran en minutos ejemplo 8/5-> resultado =1, modulo(o resto)=3
        System.out.println("concatenación suma int: " + operador1+operador2);
        System.out.println("concatenación suma string: " + (numero1+numero2));
        System.out.println("suma int: " + (operador1+operador2));

//asignacion -> da un valor = += *= /= %=

        operador1 =10;
        operador2 =5;
        operador1++;  // 11
        operador2--;  // 4
        //sumar 14 al operador1
        operador1 = operador1+14; //forma larga  ->ahora operador1 vale 25
        operador1+=14; //forma corta  ->ahora operador1 vale 39
        operador1%=14;  //el resto da 11, restop de la división 39/14 =11, divisible 1 vez entre 2
        System.out.println("operador1 nuevo valor: " + operador1);
        System.out.println("operador2 nuevo valor: " + operador2);

//Relacionales -> comparacion, comparan dos o mas variables entre si < <= > >= == != -> siempre se obtiene un boolean

        operador1 =10;
        operador2 =58;
        boolean comparacion =operador1>operador2;   //false
        System.out.println("operador1 nuevo valor 2: " + operador1);
        System.out.println("operador2 nuevo valor 2: " + operador2);
        System.out.println("la comparacion de > es: " + comparacion);
        operador1=10;
        operador2=10;
        System.out.println("operador1 nuevo valor 3: " + operador1);
        System.out.println("operador2 nuevo valor 3: " + operador2);
        boolean comparacion2 = operador1>=operador2;   //true
        System.out.println("la comparacion de >= es: " + comparacion2);
        boolean comparacion3 = operador1==operador2;   //true
        System.out.println("la comparacion de == es: " + comparacion3);
        boolean comparacion4 = operador1!=operador2;   //true
        System.out.println("la comparacion de != es: " + comparacion4);
        //comparacion de strings

        String palabra1 = "programacion";
        String palabra2 ="Programacion";
        boolean compararPalabras = palabra1.equals(palabra2); //boolean compararPalabras = palabra1 ==palabra2;  //nunca funcionaria esto es solo para numeros
        boolean compararPalabrasSinUpperCase = palabra1.equalsIgnoreCase(palabra2);
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2);          //si es true->false y viceversa
        System.out.println("la comparacion de palabras iguales sin tener en cuenta mayusculas es "+compararPalabrasSinUpperCase);
        System.out.println("la comparacion de palabras iguales teniendo en cuenta mayusculas es "+compararPalabras);
        System.out.println("la comparacion de palabras iguales sin tener en cuenta mayusculas, usando un! es: "+compararPalabras);

//Puertas Lógicas -> sentencias -> && (AND-> ambos deben ser True para true) , || (OR ->uno de los dos debe ser true)
        operador1 =10;
        operador2 =20;
        boolean comparacionLogica = operador2 > 0 || operador1 < 10;    //(OR)
        System.out.println("comparacion de operador2>0 OR operador1<10: " + comparacionLogica);
        comparacionLogica = operador2 > 0 && operador1 < 10;    //(AND) y he reasignado el valor de compraracionLogica
        System.out.println("comparacion de operador2>0 AND operador1<10: " + comparacionLogica);
        boolean comparacionLogica2 =operador1 < 10 || operador2 <20 || operador1*2 >=operador2;
       //                           F                F                  T                    -> resultado True
        System.out.println("comparacion OR: " + comparacionLogica2);


    }
}