//3º ejercicio, definir 5 variables de tipos distintos y mostrar tanto su valor como su tipo
// para identificar el tipo de clase usamos -> nombre.getclass() y hay que renombrar las variables primitivas a complejas o ENVOLTORIO para poder obtener datos siempre usando"."
//para simplificar la respuesta usamos la funcion: .getSimpleClass
// String->String / int->Integer / boolean->Boolean / double-> Double / char-> Character /
public class Ejercicio3 {
    public static void main(String[] args){
        String nombre = "Jorge";
        Integer edad = 26;
        Boolean estudiante = true;
        Double altura = 1.75;
        Character inicial = 'J';
        System.out.println("Nombre: " + nombre + " - Tipo: " + nombre.getClass().getSimpleName());
        System.out.println("Edad: " + edad + " - Tipo: " + edad.getClass().getSimpleName());
        System.out.println("¿Es estudiante?: " + estudiante + " - Tipo: " + estudiante.getClass().getSimpleName());
        System.out.println("Altura: " + altura + " - Tipo: " + altura.getClass().getSimpleName());
        System.out.println("Inicial: " + inicial + " - Tipo: " + inicial.getClass().getSimpleName());

    }
}
