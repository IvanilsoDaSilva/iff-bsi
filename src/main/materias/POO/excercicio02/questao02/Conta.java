package POO.excercicio02.questao02;
public class Conta {
	// Atributos de Classe
	private String numero, titular;
	private double saldo, limite; 
	
	// Metodos de Classe - Construtor
	public void cadastrarConta(String numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}
	// Métodos de Classe - Setters e Getters
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return this.titular;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return this.limite;
	}
	
	// Métodos de Classe
	public void sacar(double valor) {
		this.saldo =- valor;
	}
	public void depositar(double valor) {
		this.saldo =+ valor;
	}
}