package POO.excercicio04.questao02.animal;

public abstract class Animal {
	protected String nome, raca;
	
	public Animal() {}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void caminha() {}
}