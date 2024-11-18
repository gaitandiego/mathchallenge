package co.edu.poli.controlador;

import java.util.Scanner;

import co.edu.poli.modelo.Jugador;
import co.edu.poli.modelo.Nivel1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido a Math Challenge");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su apodo");
		String apodo = sc.nextLine();
	
		Jugador jugador = new Jugador(nombre, apodo, 0, 0, 1);
		
		System.out.println("Hola " + jugador.getNombre() + " (" + jugador.getApodo() + ")");
		
		System.out.println("Nivel 1");
	    
		Nivel1 nivel1 = new Nivel1();
		nivel1.pregunta1();
		
		String respuestaNivel1 = sc.nextLine();
		
		if (nivel1.pregunta1(respuestaNivel1)) {
			System.out.println("Respuesta correcta");
			jugador.setPuntos(jugador.getPuntos() + 10);
			System.out.println("Puntos Ganados: " + jugador.getPuntos());
		} else {
			System.out.println("Respuesta incorrecta");
		}
		
		
		
		
		
	}

}
