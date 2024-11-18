package co.edu.poli.modelo;

public class Utilidades {
	int puntos;
	int tiempo;
	int nivel;
	
	public Utilidades(int puntos, int tiempo, int nivel) {
		this.puntos = puntos;
		this.tiempo = tiempo;
		this.nivel = nivel;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
