package POO.excercicio02.questao03.Figuras;

public class Trapezio {
	// Atributos de Classe
	private double baseMaior, baseMenor, altura;
		
	// Método de Classes - Construtor
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
		
	// Métodos de Classe - Getters e Setters
	public double getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Métodos de Classe
	public double calcularArea() {
		return (this.baseMaior + this.baseMenor)*this.altura/2;
	}
}
