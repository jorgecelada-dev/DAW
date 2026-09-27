
public class Entrada {

    /*definición de un metodo,
    //metodo modificador de acceso, es un programa no una pagina web
    //modo acceso retorno nombre metodo(argumentos) */
    //tipos de variables: segun el tipo de dato que tengo guardado: pala


    public static void main(String[] args) {
        System.out.println("mi primer programa");               //impresion por consola, print ln (con salto de linea), print simple sin salto de linea -> solo para un dato
        System.out.println("otra linea de codigo");             //atajo de teclado sout - print
        System.out.print("impresión sin salto de linea");       //afectará a la siguiente linea
        System.out.println(400 + "mi primer programa");         // con numeros tambien, siempre sin comillas


        //diferentes tipos de banderas
        // %s -> palabra
        // %d -> numero sin decimales
        // %f _numero con decimales


        System.out.printf("me llamo %s con apellidos %s %s y tengo %d años\n", "Jorge", "Celada", "Génova", 26);       //formateos o -> printf es para cadenas de datos; si quieres que esté en otra linea añadir \n antes de la ultima comilla

        String nombre = "Jorge";            //creacion de variables, guardar uun dato y utilizarlo -> tipos nombre y valor, segun el tipo de dato que tengo guardado: palabras, /numeros/ boolean
        nombre = "Superman";                //ahora la variable nombre tiene valor Superman
        String apellido1 = "Celada";
        String apellido2 = "Genova";      //datos con funiconalidad asociada, por eso está en mayusculas String, el resto no tienen esas propiedades _>funcionalidad compleja
        String nombre2 = "JuanManuel";
        char letra ='A';              //variables primitivas -> todas las clases primitivas tiernensu clase compleja asociada
        int edad = 26;
        double altura = 1.75;                  //doble de precision
        float alturaFloat = 1.75f;
        boolean acierto = false;
        final String DNI = "ASD12536";             //Variable que es constante, no se puede cambiar el valor pero debe escribirse con mayusculas para identificarlo como una variable uso de FINAL
        System.out.printf("me llamo %s con apellidos %s %s y tengo %d años, mido %f\n", nombre2, apellido1, apellido2, edad, alturaFloat);
        System.out.println(DNI);
    }
}
