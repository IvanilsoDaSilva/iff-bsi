package POO.excercicio02.questao03.Figuras;

public class Triangulo {
	// Atributos de Classe
	private double base, altura;
		
	// Método de Classes - Construtor
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
		
	// Métodos de Classe - Getters e Setters
	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setsetAltura(double altura) {
		this.altura = altura;
	}
	
	// Métodos de Classe
	public double calcularArea() {
		return (this.base * this.altura)/2;
	}
}
