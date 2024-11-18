package co.edu.poli.modelo;

/**
 * Clase que encapsula las utilidades del juego, como puntos, tiempo y nivel actual.
 */
public class Utilidades {

    // Puntos acumulados por el jugador.
    int puntos;

    // Tiempo en segundos para completar un nivel.
    int tiempo;

    // Nivel actual del juego.
    int nivel;

    // Constructor para inicializar las utilidades con puntos, tiempo y nivel.
    // @param puntos Puntos iniciales del jugador.
    // @param tiempo Tiempo asignado para el nivel.
    // @param nivel Nivel actual del juego.
    public Utilidades(int puntos, int tiempo, int nivel) {
        this.puntos = puntos;
        this.tiempo = tiempo;
        this.nivel = nivel;
    }

    // Obtiene los puntos acumulados del jugador.
    // @return Los puntos actuales.
    public int getPuntos() {
        return puntos;
    }

    // Asigna nuevos puntos al jugador.
    // @param puntos Los nuevos puntos a asignar.
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Obtiene el tiempo asignado para completar un nivel.
    // @return El tiempo en segundos.
    public int getTiempo() {
        return tiempo;
    }

    // Asigna un nuevo tiempo para completar un nivel.
    // @param tiempo El nuevo tiempo en segundos.
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    // Obtiene el nivel actual del juego.
    // @return El número del nivel actual.
    public int getNivel() {
        return nivel;
    }

    // Asigna un nuevo nivel al juego.
    // @param nivel El nuevo nivel a establecer.
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
