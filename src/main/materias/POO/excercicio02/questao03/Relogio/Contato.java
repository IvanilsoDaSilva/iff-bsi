package POO.excercicio02.questao03.Relogio;

public class Contato {
	// Atributos de Classe
	private String nome, telefone;

	// Métodos de Classe - Construtor
	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	// Métodos de Classe - Getters e Setteres
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Métodos de Classe
	public String mostrarContato() {
		return this.nome+" - "+this.telefone;
	}
}
