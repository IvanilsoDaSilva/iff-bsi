package POO.excercicio05;

public class Vendedor extends Empregado {
	private double valorVendas, comissao;

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return this.salarioBase*((this.imposto)/100)+this.comissao;
	}
}
