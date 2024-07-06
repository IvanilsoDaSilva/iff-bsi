package POO.excercicio02.questao03.Balanco;

public class Balanco {
	// Atributos de Classe
	private double gastoMes1, gastoMes2, gastoMes3;
	
	// Métodos de Classe - Construtor
	public Balanco(double gastoMes1, double gastoMes2, double gastoMes3) {
		super();
		this.gastoMes1 = gastoMes1;
		this.gastoMes2 = gastoMes2;
		this.gastoMes3 = gastoMes3;
	}

	// Métodos de Classe - Getters e Setteres
	public double getGastoMes1() {
		return gastoMes1;
	}
	public void setGastoMes1(double gastoMes1) {
		this.gastoMes1 = gastoMes1;
	}
	public double getGastoMes2() {
		return gastoMes2;
	}
	public void setGastoMes2(double gastoMes2) {
		this.gastoMes2 = gastoMes2;
	}
	public double getGastoMes3() {
		return gastoMes3;
	}
	public void setGastoMes3(double gastoMes3) {
		this.gastoMes3 = gastoMes3;
	}
	
	// Métodos de Classe
	public double calcularTrimestre() {
		return this.gastoMes1+this.gastoMes2+this.gastoMes3;
	}
}
