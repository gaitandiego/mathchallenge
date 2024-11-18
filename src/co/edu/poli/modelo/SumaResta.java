package co.edu.poli.modelo;

public class SumaResta {
	int num1;
	int num2;
	
	public SumaResta(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int sumar() {
		return num1 + num2;
	}
	
	public int restar() {
		return num1 - num2;
	}
	
}
