package POO.excercicio05;

public class Fornecedor extends Pessoa {
	private double  valorCredito, valorDIvida;

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDIvida() {
		return valorDIvida;
	}

	public void setValorDIvida(double valorDIvida) {
		this.valorDIvida = valorDIvida;
	}
	
	public double obterSaldo() {
		return valorCredito-valorDIvida;
	}
	
	public Fornecedor() {
		super();
	}
}