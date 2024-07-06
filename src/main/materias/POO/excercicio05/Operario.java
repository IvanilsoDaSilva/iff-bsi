package POO.excercicio05;

public class Operario extends Empregado {
	private double valorProducao, comissao;
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
