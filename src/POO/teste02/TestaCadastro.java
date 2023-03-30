package POO.teste02;

import POO.teste02.entities.*;

public class TestaCadastro {
	public static void main(String[] args) {
		// Fields
		Funcionario funcionario1 = new Funcionario("funcionario1", new Data(12,12,2000), 5000.01);
		Gerente gerente1 = new Gerente("gerente1", new Data(13,13,3000), 10000.02, "TI");
		Cliente cliente1 = new Cliente("cliente1", new Data(14,14,4000), "30030030030");
		CadastroPessoas cadastroPessoas1 = new CadastroPessoas();
		
		// Methods
		funcionario1.imprimeDados();
		gerente1.imprimeDados();
		cliente1.imprimeDados();
		
		cadastroPessoas1.cadastraPessoa(funcionario1);
		cadastroPessoas1.cadastraPessoa(gerente1);
		cadastroPessoas1.cadastraPessoa(cliente1);
		
		cadastroPessoas1.imprimeCadastro();
	}
}
