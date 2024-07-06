package POO.excercicio04.questao01;

public class Tecnico extends Funcionario {
	private double bonusSalarial;
	
	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

	public Tecnico() {
		super();
	}
	
	public Tecnico(String nome, String cpf, String matricula, double bonusSalarial) {
		super(nome, cpf, matricula);
		this.bonusSalarial = bonusSalarial;
	}
	
	public String exibirDados() {
		return "\nNome: "+this.nome+"\nCpf: "+this.cpf+"\nMatricula: "+this.matricula+"\nBonus salárial: "+bonusSalarial;
	}
}