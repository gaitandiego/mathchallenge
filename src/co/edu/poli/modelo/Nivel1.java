package co.edu.poli.modelo;

/**
 * Clase que representa el Nivel 1 del juego Math Challenge.
 * Este nivel introduce las operaciones básicas de suma y resta.
 */
public class Nivel1 implements Nivel {

    /**
     * Array que contiene las preguntas de este nivel.
     */
    private String[] preguntas = {
        "¿Cuánto es 4 + 3?",
        "¿Cuánto es 9 - 5?",
        "¿Cuánto es 7 + 2?",
        "¿Cuánto es 6 - 4?",
        "¿Cuánto es 8 + 1?",
        "¿Cuánto es 5 - 2?",
        "¿Cuánto es 3 + 6?",
        "¿Cuánto es 9 - 7?",
        "¿Cuánto es 2 + 5?",
        "¿Cuánto es 7 - 3?"
    };

    /**
     * Array que contiene las respuestas correctas correspondientes a las preguntas.
     */
    private String[] respuestasCorrectas = {"7", "4", "9", "2", "9", "3", "9", "2", "7", "4"};

    /**
     * Muestra una pregunta específica.
     * 
     * @param preguntaId El número de la pregunta a mostrar (1-indexado).
     */
    @Override
    public void mostrarPregunta(int preguntaId) {
        System.out.println(preguntas[preguntaId - 1]);
    }

    /**
     * Valida si la respuesta ingresada es correcta para una pregunta específica.
     * 
     * @param preguntaId El número de la pregunta a validar (1-indexado).
     * @param respuesta La respuesta proporcionada por el jugador.
     * @return true si la respuesta es correcta, false en caso contrario.
     */
    @Override
    public boolean validarRespuesta(int preguntaId, String respuesta) {
        return respuestasCorrectas[preguntaId - 1].equalsIgnoreCase(respuesta);
    }

    /**
     * Obtiene la cantidad total de preguntas en este nivel.
     * 
     * @return El número total de preguntas.
     */
    @Override
    public int getCantidadPreguntas() {
        return preguntas.length;
    }

    /**
     * Obtiene los puntos otorgados por cada respuesta correcta.
     * 
     * @return Los puntos por respuesta correcta.
     */
    @Override
    public int getPuntosPorPregunta() {
        return 10;
    }
}
