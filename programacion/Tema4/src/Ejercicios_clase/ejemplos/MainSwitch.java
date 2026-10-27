package Ejercicios_clase.ejemplos;

public class MainSwitch {
    public static void main(String[] args) {
        int numero = 10;
        String mensaje= null;
        switch (numero) {
            /*nunca escribir nada dentro del switch*/
            case 1: /*dentro del case escribir lo que quieras*/
                System.out.println("La variable vale 1");
                mensaje ="variable 1";
                break;         /*indica que se rompa cuando si corresponde, sino se ejecutara todos los sout*/
            case 2:
                System.out.println("La variable vale 2");
                break;
            case 3:
                System.out.println("La variable vale 3");
                break;
            case 4:
                System.out.println("La variable vale 4");
                break;
            case 5:
                System.out.println("La variable vale 5");
                break;
            case 6,7,8:
                System.out.println("es un numero de nuestro conjunto (6,7,8)");
            default:
                System.out.println("El caso no esta contemplado");
                break;

        }

    }
    //al utiliza run swich se evalua un valor no un booleano
}
