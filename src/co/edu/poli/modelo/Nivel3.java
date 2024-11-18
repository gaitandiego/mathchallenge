package co.edu.poli.modelo;

public class Nivel3 implements Nivel {
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
   
    private String[] respuestasCorrectas = {"991", "75", "1260", "36", "879", "436", "1656", "88", "680", "647", "1064", "291", "713", "512", "744", "54"};

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
