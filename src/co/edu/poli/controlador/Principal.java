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
        System.out.println("Bienvenido a Math Challenge"); // Mensaje de bienvenida
        System.out.print("Ingrese su nombre: "); // Solicitar el nombre del jugador
        String nombre = sc.nextLine(); // Leer el nombre ingresado por el usuario
        System.out.print("Ingrese su apodo: "); // Solicitar el apodo del jugador
        String apodo = sc.nextLine(); // Leer el apodo ingresado por el usuario

        // Crear un objeto Jugador con los datos ingresados y puntos iniciales en 0
        Jugador jugador = new Jugador(nombre, apodo, 0, 0, 1);
        System.out.println("Hola " + jugador.getNombre() + " (" + jugador.getApodo() + ")"); // Saludo personalizado

        // Nivel 1
        System.out.println("Iniciando Nivel 1...");
        // Ejecutar el nivel 1 y verificar si el jugador lo completa
        if (!ejecutarNivel(sc, new Nivel1(), jugador)) {
            // Si el jugador falla, termina el juego
            System.out.println("Juego terminado. Intenta de nuevo.");
            System.out.println("Puntos finales: " + jugador.getPuntos());
            return; // Finalizar el programa
        }

        // Nivel 2
        System.out.println("Iniciando Nivel 2...");
        // Ejecutar el nivel 2 y verificar si el jugador lo completa
        if (!ejecutarNivel(sc, new Nivel2(), jugador)) {
            // Si el jugador falla, termina el juego
            System.out.println("Juego terminado. Intenta de nuevo.");
            System.out.println("Puntos finales: " + jugador.getPuntos());
            return; // Finalizar el programa
        }
        
        // Nivel 3
        System.out.println("Iniciando Nivel 3...");
        // Ejecutar el nivel 3 y verificar si el jugador lo completa
        if (!ejecutarNivel(sc, new Nivel3(), jugador)) {
            // Si el jugador falla, termina el juego
            System.out.println("Juego terminado. Intenta de nuevo.");
            System.out.println("Puntos finales: " + jugador.getPuntos());
            return; // Finalizar el programa
        }

        // Si el jugador completa todos los niveles, mostrar los puntos finales
        System.out.println("¡Juego terminado!");
        System.out.println("Puntos finales: " + jugador.getPuntos());
    }

    
    // Método para ejecutar un nivel del juego.
    // @param sc Scanner para leer la entrada del jugador.
    // @param nivel Objeto que representa el nivel actual.
    //  @param jugador Objeto Jugador para actualizar los puntos.
    // @return true si el jugador completa el nivel, false si falla.
     
    private static boolean ejecutarNivel(Scanner sc, Nivel nivel, Jugador jugador) {
        // Iterar por cada pregunta del nivel
        for (int i = 1; i <= nivel.getCantidadPreguntas(); i++) {
            nivel.mostrarPregunta(i); // Mostrar la pregunta al jugador
            System.out.print("Tu respuesta: "); // Pedir la respuesta
            String respuesta = sc.nextLine(); // Leer la respuesta del jugador

            // Validar si la respuesta es correcta
            if (nivel.validarRespuesta(i, respuesta)) {
                System.out.println("Respuesta correcta"); // Notificar respuesta correcta
                // Sumar puntos al jugador
                jugador.setPuntos(jugador.getPuntos() + nivel.getPuntosPorPregunta());
            } else {
                // Notificar respuesta incorrecta y finalizar el nivel
                System.out.println("Respuesta incorrecta");
                return false; // Retornar false, indicando que el nivel no fue completado
            }
            // Mostrar los puntos actuales del jugador
            System.out.println("Puntos actuales: " + jugador.getPuntos());
        }
        return true; // Retornar true si el nivel fue completado exitosamente
    }
}
