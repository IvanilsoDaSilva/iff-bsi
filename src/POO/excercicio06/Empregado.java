package POO.excercicio06;

public class Empregado extends Pessoa implements Pagamento {
	// FIelds
	private String matricula;
	private double salario;
	// Methods - Construct
	public Empregado() {
		super();
	}
	
	public Empregado(String nome, String sobrenome, String matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	// Methods - Getters and Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Methods - Others
	@Override
	public Double getTotalPagamento() {
		return this.getSalario();
	}
}
