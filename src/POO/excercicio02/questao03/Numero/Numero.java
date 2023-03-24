package POO.excercicio02.questao03.Numero;

public class Numero {
	// Atributos de Classes
	private int n1;
	private int n2;
	
	// Métodos de Classes - construtor
	
	
	// Métodos de Classes - Getters e Setters
	public int getN1() {
		return this.n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return this.n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	// Métodos de Classes
	public void troca() {
		int aux = n1;
		this.n1 = this.n2;
		this.n2 = aux;
	}
	
	public void mostrar() {
		System.out.print("N1: "+this.n1+" "+"N2: "+this.n2+"\n");
	}
}
