package POO.excercicio02.questao03.Contador;

public class Contador {
	// Atributo de Classe
	private int numero;
	
	// Método de Classe - Construtor
	public Contador() {
		super();
	}
	
	// Método de Classe - Getters e Setters
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Método de Classe
	public void incremento() {
		this.numero =+ 1;
	}
public void decremento() {
		this.numero =- 1;
	}
}
