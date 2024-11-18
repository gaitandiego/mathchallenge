package co.edu.poli.controlador;

import java.util.Scanner;
import co.edu.poli.modelo.Jugador;
import co.edu.poli.modelo.Nivel;
import co.edu.poli.modelo.Nivel1;
import co.edu.poli.modelo.Nivel2;
import co.edu.poli.modelo.Nivel3;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saludo inicial y creación del jugador
        System.out.println("Bienvenido a Math Challenge");
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su apodo: ");
        String apodo = sc.nextLine();

        Jugador jugador = new Jugador(nombre, apodo, 0, 0, 1);
        System.out.println("Hola " + jugador.getNombre() + " (" + jugador.getApodo() + ")");

        // Nivel 1
        System.out.println("Iniciando Nivel 1...");
        if (!ejecutarNivel(sc, new Nivel1(), jugador)) {
            System.out.println("Juego terminado. Intenta de nuevo.");
            System.out.println("Puntos finales: " + jugador.getPuntos());
            return; // Termina el programa si falla en Nivel 1
        }

        // Nivel 2
        System.out.println("Iniciando Nivel 2...");
        if (!ejecutarNivel(sc, new Nivel2(), jugador)) {
            System.out.println("Juego terminado. Intenta de nuevo.");
            System.out.println("Puntos finales: " + jugador.getPuntos());
            return; // Termina el programa si falla en Nivel 2
        }
        
        // Nivel 3
        System.out.println("Iniciando Nivel 3...");
		if (!ejecutarNivel(sc, new Nivel3(), jugador)) {
			System.out.println("Juego terminado. Intenta de nuevo.");
			System.out.println("Puntos finales: " + jugador.getPuntos());
			return; // Termina el programa si falla en Nivel 3
		}

        // Mostrar puntos finales
        System.out.println("¡Juego terminado!");
        System.out.println("Puntos finales: " + jugador.getPuntos());
    }

    private static boolean ejecutarNivel(Scanner sc, Nivel nivel, Jugador jugador) {
        for (int i = 1; i <= nivel.getCantidadPreguntas(); i++) {
            nivel.mostrarPregunta(i);
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();

            if (nivel.validarRespuesta(i, respuesta)) {
                System.out.println("Respuesta correcta");
                jugador.setPuntos(jugador.getPuntos() + nivel.getPuntosPorPregunta());
            } else {
                System.out.println("Respuesta incorrecta");
                return false; // Termina el nivel si falla una respuesta
            }
            System.out.println("Puntos actuales: " + jugador.getPuntos());
        }
        return true; // El nivel se completó exitosamente
    }
}
