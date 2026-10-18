package Ejercicio6_POO;

public class Estudiante {
    String nombre;
    String curso;
    Boolean matricula;


    public Estudiante(String nombre, String curso){
        this.nombre= nombre;
        this.curso= curso;
        this.matricula = false;
    }
    public Estudiante(String nombre, String curso, boolean matricula){
        this.nombre= nombre;
        this.curso= curso;
        this.matricula = matricula;
    }


}
