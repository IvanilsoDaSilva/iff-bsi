package POO.teste02.entities;

public class Funcionario extends Pessoa {
	// Fields
	protected double salario;
	
	// Method - Getters and Setters
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Methods - Construct
	public Funcionario(String nome, Data nascimento, double salario) {
		super(nome, nascimento);
		this.salario = salario;
	}
	
	public Funcionario() {
	}
	
	// Methods - Others
	@Override
	public void imprimeDados() {
		// TODO Auto-generated method stub
		System.out.println(
			"\nNome: "+this.nome+"\nNascimento: "+this.nascimento.getDia()+"/"+this.nascimento.getMes()+"/"+this.nascimento.getAno()+
			"\nSalario: "+this.salario
		);
	}
	
	public double calculaImpostos() {
		return this.salario * 0.03;
	}
}
