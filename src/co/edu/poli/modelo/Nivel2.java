package co.edu.poli.modelo;

public class Nivel2 implements Nivel {
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
   
	    private String[] respuestasCorrectas = {"24", "40", "63", "36", "30", "98", "60", "121", "6", "7", "9", "9", "6", "33", "8"};
	
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
