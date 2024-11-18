package co.edu.poli.modelo;

public class Nivel1 implements Nivel {
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
    
    private String[] respuestasCorrectas = {"7", "4", "9", "2", "9", "3", "9", "2", "7", "4"};

    @Override
    public void mostrarPregunta(int preguntaId) {
        System.out.println(preguntas[preguntaId - 1]);
    }

    @Override
    public boolean validarRespuesta(int preguntaId, String respuesta) {
        return respuestasCorrectas[preguntaId - 1].equalsIgnoreCase(respuesta);
    }

    @Override
    public int getCantidadPreguntas() {
        return preguntas.length;
    }

    @Override
    public int getPuntosPorPregunta() {
        return 10;
    }
}
