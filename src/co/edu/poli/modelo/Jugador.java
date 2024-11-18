package co.edu.poli.modelo;

public class Jugador extends Utilidades {
	String nombre;
	String apodo;

	public Jugador(String nombre, String apodo, int puntos, int tiempo, int nivel) {
		super(puntos, tiempo, nivel);
		this.nombre = nombre;
		this.apodo = apodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
}
