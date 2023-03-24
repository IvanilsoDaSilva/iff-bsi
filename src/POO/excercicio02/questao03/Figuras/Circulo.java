package POO.excercicio02.questao03.Figuras;

public class Circulo {
	// Atributos de Classe
	private double raio;
	
	// Atributos de Classe - Construtor
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
		
	// Métodos de Classe - Getters e Setters
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
		
	// Métodos de Classe
	public double calcularArea() {
		return raio*raio*Math.PI;
	}
}
