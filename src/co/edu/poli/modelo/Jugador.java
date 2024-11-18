package co.edu.poli.modelo;


 //Clase que representa a un jugador en el juego. 
 // Hereda de la clase Utilidades para aprovechar los atributos de puntos, tiempo y nivel.
 
public class Jugador extends Utilidades {

    // Nombre real del jugador.
    String nombre;

    // Apodo del jugador, usado como alias en el juego.
    String apodo;

    // Constructor que inicializa un jugador con su nombre, apodo, puntos, tiempo y nivel.
    // @param nombre Nombre real del jugador.
    // @param apodo Apodo o alias del jugador.
    // @param puntos Puntos iniciales del jugador.
    // @param tiempo Tiempo asignado para completar un nivel.
    // @param nivel Nivel inicial del jugador.
    public Jugador(String nombre, String apodo, int puntos, int tiempo, int nivel) {
        super(puntos, tiempo, nivel); // Llama al constructor de la clase padre Utilidades.
        this.nombre = nombre;
        this.apodo = apodo;
    }

    // Obtiene el nombre del jugador.
    // @return El nombre del jugador.
    public String getNombre() {
        return nombre;
    }

    // Asigna un nuevo nombre al jugador.
    // @param nombre El nuevo nombre del jugador.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtiene el apodo del jugador.
    // @return El apodo del jugador.
    public String getApodo() {
        return apodo;
    }

    // Asigna un nuevo apodo al jugador.
    // @param apodo El nuevo apodo del jugador.
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
}
