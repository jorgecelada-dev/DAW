package Ejercicio6_POO;

public class main {
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Alex", "1º de DAW");
        Estudiante estudiante2 = new Estudiante("Ana", "2º de DAW", true);

        System.out.println("Estudiante 1:" + estudiante1.nombre + " - " + estudiante1.curso + " - Matriculado: " + estudiante1.matricula);
        System.out.println("Estudiante 2:" + estudiante2.nombre + " - " + estudiante2.curso + " - Matriculado: " + estudiante2.matricula);

    }
}
