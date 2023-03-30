package POO.excercicio05;

public class Administrador extends Empregado {
	protected double ajudaDeCusto;
	
	public double calcularSalario() {
		return this.salarioBase*((this.imposto)/100)+this.ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
}