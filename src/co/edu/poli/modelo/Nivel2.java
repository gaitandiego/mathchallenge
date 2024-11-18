package co.edu.poli.modelo;

// Clase que representa el Nivel 2 del juego, con operaciones de multiplicación y división.
public class Nivel2 implements Nivel {

    // Array que contiene las preguntas de este nivel, basadas en operaciones de multiplicación y división.
    private String[] preguntas = {
        "¿Cuánto es 6 × 4?",
        "¿Cuánto es 8 × 5?",
        "¿Cuánto es 7 × 9?",
        "¿Cuánto es 12 × 3?",
        "¿Cuánto es 15 × 2?",
        "¿Cuánto es 14 × 7?",
        "¿Cuánto es 10 × 6?",
        "¿Cuánto es 11 × 11?",
        "¿Cuánto es 36 ÷ 6?",
        "¿Cuánto es 56 ÷ 8?",
        "¿Cuánto es 81 ÷ 9?",
        "¿Cuánto es 45 ÷ 5?",
        "¿Cuánto es 72 ÷ 12?",
        "¿Cuánto es 99 ÷ 3?",
        "¿Cuánto es 64 ÷ 8?"
    };

    // Array que contiene las respuestas correctas correspondientes a las preguntas de este nivel.
    private String[] respuestasCorrectas = {"24", "40", "63", "36", "30", "98", "60", "121", "6", "7", "9", "9", "6", "33", "8"};

    // Método para mostrar una pregunta específica en la consola.
    // @param preguntaId El número de la pregunta a mostrar (1-indexado).
    @Override
    public void mostrarPregunta(int preguntaId) {
        System.out.println(preguntas[preguntaId - 1]);
    }

    // Método para validar si la respuesta ingresada es correcta para una pregunta específica.
    // @param preguntaId El número de la pregunta a validar (1-indexado).
    // @param respuesta La respuesta proporcionada por el jugador.
    // @return true si la respuesta es correcta, false en caso contrario.
    @Override
    public boolean validarRespuesta(int preguntaId, String respuesta) {
        return respuestasCorrectas[preguntaId - 1].equalsIgnoreCase(respuesta);
    }

    // Método para obtener la cantidad total de preguntas en este nivel.
    // @return El número total de preguntas.
    @Override
    public int getCantidadPreguntas() {
        return preguntas.length;
    }

    // Método para obtener los puntos otorgados por cada respuesta correcta.
    // @return Los puntos por respuesta correcta.
    @Override
    public int getPuntosPorPregunta() {
        return 10;
    }
}
