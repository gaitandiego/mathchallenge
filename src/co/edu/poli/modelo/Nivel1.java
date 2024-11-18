package co.edu.poli.modelo;

public class Nivel1 {

	public void pregunta1() {
		 System.out.println("¿Cuánto es 2 + 2?");
		 System.out.println("A. 3");
		 System.out.println("B. 4");
		 System.out.println("C. 9");
		 System.out.println("D. 5");
	}

	public boolean pregunta1(String respuesta) {
		if(respuesta.equals("B")) {
			return true;
		}else {			
			return false;
		}
    }
	
	
	

}
