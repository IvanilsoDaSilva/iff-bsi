package POO.excercicio04.questao03;

public class VIP extends Ingresso {
	private double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public VIP() {
		super();
	}
	
	public VIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public double valorIngresso() {
		return this.valorAdicional + this.valorAdicional;
	}
}
