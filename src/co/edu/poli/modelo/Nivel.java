package co.edu.poli.modelo;

/**
 * Interfaz que define el comportamiento de un nivel en el juego Math Challenge.
 */
public interface Nivel {

    // Muestra la pregunta correspondiente al identificador proporcionado.
    // @param preguntaId El identificador de la pregunta que se debe mostrar.
    void mostrarPregunta(int preguntaId);

    // Valida si la respuesta proporcionada por el jugador es correcta para la pregunta dada.
    // @param preguntaId El identificador de la pregunta.
    // @param respuesta  La respuesta proporcionada por el jugador.
    // @return true si la respuesta es correcta, false en caso contrario.
    boolean validarRespuesta(int preguntaId, String respuesta);

    // Obtiene la cantidad total de preguntas en este nivel.
    // @return El número total de preguntas disponibles en el nivel.
    int getCantidadPreguntas();

    // Obtiene el puntaje que se otorga por cada respuesta correcta en este nivel.
    // @return Los puntos que se otorgan por cada pregunta correcta.
    int getPuntosPorPregunta();
}
