/*Tipos de variables:

simples-> en memoria solo tengo el dato
int : int edad =24;
double: int altura = 24.89;
char: char = 'a';
float:
boolean: comparacion = True;

Complejas->en memoria ademas del dato se guardan funcionalidades
String: String nombre = new String("Alvaro"); lo mismo que: String: String nombre = "Alvaro";
Scanner: Scanner teclado = new Scanner(System.in)
   nombre.funcionalidad
   nombre.atributo

   POO-> Que es un objeto?: es una clase con definicion de un "molde" comun,
   ejemplo:
   jugadores
      nombre
      apellido
      nivelhabilidad
      vida
      ataque
      defensa
      j1 (Jorge Celada, 23453, 34. 334...)
      j2 (Pablo, Guitierrez, 2344, ...)

ejemplo: Para un jugador con correo, nombre, nivel y nVidas

metodo antiguo:


public class apuntes {
    static void main(String[] args) {
        System.out.println("iniciando videojuego version 1");
        String nombreJugador1 = "hdhjf";
        String correoJugador1 = "jajdh@jhhsdjd";
        int nivelJugador1 = 56;
        int nVidasJugador1 = 3;
    }
    */
/*antiguo metodo:
    public class apuntes {
    static void main(String[] args) {
        System.out.println("iniciando videojuego version 1");
        String nombreJugador1 = "hdhjf";
        String correoJugador1 = "jajdh@jhhsdjd";
        int nivelJugador1 = 56;
        int nVidasJugador1 = 3;

}
/* model: clases que representan los futuros elementos del programa, los moldes
view: clases que representan lainteraccion con el usuario o sistema. la parte grafica
controller: clases que reptresentan la parte logivca, como funciona el sistema
 */