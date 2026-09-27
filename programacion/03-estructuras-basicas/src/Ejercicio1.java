//1º ejercicio estructuras básicas, definir y mostrar variables, nombre , edad, ciudad
// concatenar (+), literales como separadores, separadores \n, diferencias entre print, printf, print ln

public class Ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 26;
        String ciudad ="Madrid";
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(ciudad);
        System.out.println(nombre+"\n"+edad+"\n"+ciudad);     //un solo print, para distintas lineas
        System.out.println(nombre+" "+edad+" "+ciudad);       //en la misma linea
        System.out.println("Nombre:"+nombre+"\nEdad:"+edad+"\nCiudad:"+ciudad);  //misma linea separado usando \n
    }
}
