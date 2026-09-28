public class ApuntesClaseOperadores {
    public static void main(String[] args){
        int operador1 = 5;
        operador1++;
        int operador2 = 2;
        int suma = operador1+operador2;
        int resta = operador1-operador2;
        int multiplicacion = operador1*operador2;
        double division = (double) operador1/operador2;
//% el resto de la division de dos numeros
        int resto = 5%2; //par //segundos entran en minutos
        String numero = "5";
        String numero2 = "7";
        System.out.println("Concatenar string: " + (operador1 + operador2));   // saldra 57
        // operador de toipo asignacion da un valor ++ (suma1)

        System.out.println("la suma es: "+ suma);
        System.out.println("la resta es: "+ resta);
        System.out.println("la multiplicacion es: "+ multiplicacion);
        System.out.println("la division es: "+ division);
        //relacionales -> comparación. comparan dos o mas variables
        operador1 =10;
        operador2 =11;
        boolean comparacion =operador1>operador2; //false
        System.out.println("la comparacion es: " + comparacion);
        comparacion=operador1>=operador2; //true
        String palabra1 = "programacion";
        String palabra2 ="Programacion";
        //boolean compararPalabras = palabra1 ==palabra2;  //nunca funcionaria esto es solo para numeros
        boolean compararPalabras = palabra1.equals(palabra2);
        boolean compararPalabrasSinUpperCase = palabra1.equalsIgnoreCase(palabra2);
        boolean compararPalabrasDiferentes = !palabra1.equalsIgnoreCase(palabra2);
        System.out.println("la comparacion de palabras es "+compararPalabras);
        System.out.println("la comparacion de palabras sin tener en cuenta mayusculas es "+compararPalabrasSinUpperCase);
        System.out.println("la comparacion de palabras sin tener en cuenta mayusculas es "+compararPalabrasSinUpperCase);

        //logicas -> secuencias && -> shift+6 || ->ALT+1
        //&& -> AND (++=+,--=-, +-=-)|| ->OR (con que una de los dos sea verdad sera verdad)
        operador1 =10;
        operador2=20;
        boolean comparacionAND = operador2 > 0 && operador1 >10 //false
        boolean comparacionOR = operador1 >10 || operador2<20 && operador1+2 >=operaodr2; //true





    }
}
