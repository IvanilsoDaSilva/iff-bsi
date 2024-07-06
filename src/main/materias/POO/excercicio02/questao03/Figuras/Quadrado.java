package POO.excercicio02.questao03.Figuras;

public class Quadrado {
	// Atributos de Classe
	private double lado;
	
	// Atributos de Classe - Construtor
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
		
	// Métodos de Classe - Getters e Setters
	public double getLado() {
		return this.lado;
	}
	public void setBase(double lado) {
		this.lado = lado;
	}
		
	// Métodos de Classe
	public double calcularArea() {
		return lado*lado;
	}
}
