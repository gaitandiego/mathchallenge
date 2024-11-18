package co.edu.poli.modelo;

public interface Nivel {
	 void mostrarPregunta(int preguntaId);
	 boolean validarRespuesta(int preguntaId, String respuesta);
	 int getCantidadPreguntas();
	 int getPuntosPorPregunta();
}
