package POO.excercicio04.questao01;

public abstract class Funcionario {
	protected String nome, cpf, matricula;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatriocula() {
		return matricula;
	}

	public void setMatriocula(String matricula) {
		this.matricula = matricula;
	}

	public Funcionario() {
	}
	
	public Funcionario(String nome, String cpf, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	public abstract String exibirDados();
}