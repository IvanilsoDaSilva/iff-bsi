package POO.excercicio02.questao03.Conta;

public class Conta {
	// Atributo de Classe
	private double saldo;
	
	// Método de Classe - Construtor
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	// Método de Classe - Getters e Setters
	public double getSaldo() {
		return this.saldo;
	}
	
	// Método de Classe
	public void depositar(double valor) {
		this.saldo =+ valor;
	}
	public void sacar(double valor) {
		this.saldo =- valor;
	}
	public double extrato() {
		return this.saldo;
	}
}
