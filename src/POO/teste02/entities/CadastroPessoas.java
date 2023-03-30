package POO.teste02.entities;

import java.util.ArrayList;

public class CadastroPessoas {
	// Fields
	private int qtdAtual;
	private ArrayList<Pessoa> pessoas;
	
	// Methods - Getters and Setters
	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	
	// Methods - Constrct
	public CadastroPessoas() {
		this.qtdAtual = 0;
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	// Methods - Others
	public void cadastraPessoa(Pessoa pessoa) {
		this.qtdAtual++;
		this.pessoas.add(pessoa);
	}
	
	public void imprimeCadastro() {
		System.out.println("\n");
		for(int i=0;i<pessoas.size();i++) {
			System.out.println("nome: "+pessoas.get(i).getNome()+"\nNascimento: "+
		pessoas.get(i).getNascimento().getDia()+"/"+pessoas.get(i).getNascimento().getMes()+"/"+pessoas.get(i).getNascimento().getAno()+"\n");
		}
	}
}
