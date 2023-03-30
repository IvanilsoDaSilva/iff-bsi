package POO.excercicio06;

public abstract class Pessoa {
	// FIelds
	private String nome, sobrenome;
	// Methods - Construct
	public Pessoa() {
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	
	// Methods - Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return " "+sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	// Methods - Others
}
