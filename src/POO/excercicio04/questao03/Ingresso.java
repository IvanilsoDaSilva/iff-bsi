package POO.excercicio04.questao03;

public abstract class Ingresso {
	protected double valor;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Ingresso() {
	}
	
	public Ingresso(double valor) {
		this.valor = valor;
	}
}
