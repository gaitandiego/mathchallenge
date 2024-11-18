package co.edu.poli.modelo;

// Clase que representa el Nivel 3 del juego, con operaciones más complejas de suma, resta, multiplicación y división.
public class Nivel3 implements Nivel {

    // Array que contiene las preguntas de este nivel, basadas en operaciones de suma, resta, multiplicación y división.
    private String[] preguntas = {
        "132 + 859",
        "451 − 376",
        "28 × 45",
        "324 ÷ 9",
        "697 + 182",
        "963 − 527",
        "72 × 23",
        "1056 ÷ 12",
        "482 + 198",
        "1014 − 367",
        "56 × 19",
        "873 ÷ 3",
        "235 + 478",
        "805 − 293",
        "93 × 8",
        "972 ÷ 18"
    };

    // Array que contiene las respuestas correctas correspondientes a las preguntas de este nivel.
    private String[] respuestasCorrectas = {"991", "75", "1260", "36", "879", "436", "1656", "88", "680", "647", "1064", "291", "713", "512", "744", "54"};

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
