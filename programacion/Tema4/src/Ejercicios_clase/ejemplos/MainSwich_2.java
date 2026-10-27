package Ejercicios_clase.ejemplos;

public class MainSwich_2 {
    public static void main(String[] args) {

        String nombre = "Jorge";
        switch (nombre) {
            case "Borja" -> {     //en este caso no hay que poner el break, importante.
                System.out.println("El nombre es Borja");

            }
            case "Jorge" -> {
                System.out.println("El nombre es Jorge");
            }
            case "Laura" -> {
                System.out.println("El nombre es Laura");
            }
            case "default" -> {
                System.out.println("Nombre no contemplado");
            }


        }
    }
}
