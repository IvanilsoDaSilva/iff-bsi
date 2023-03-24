package POO.excercicio02.questao02;
public class Aluno {
	// Atributo de Classe
	private	String nome;
	private String cpf ;
	private String matricula;
	
	// Métodos de Classe - Construtor
	public void cadastrarAluno(String nome, String cpf, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}
	
	// Setters e Getters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	
	// Métodos de Classe
	// Vázio
}