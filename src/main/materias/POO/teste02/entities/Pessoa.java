package POO.teste02.entities;

public abstract class Pessoa {
	// Fields
	protected String nome;
	protected Data nascimento;
	
	// Methods - Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getNascimento() {
		return nascimento;
	}
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	// Methods - Construct
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Pessoa() {
	}
	
	// Methods - Others
	public abstract void imprimeDados();
}
