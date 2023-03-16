package POO.ExcercicioN.Questao1;

import POO.ExcercicioN.Questao2.Fornecedor;
import POO.ExcercicioN.Questao3.Empregado;

public class Main {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		Empregado empregado1 = new Empregado();
		
		fornecedor1.setNome("Ivanilso");
		fornecedor1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua Tal - Nº 58");
		fornecedor1.setTelefone("+55 022 9999-9999");
		fornecedor1.setValorCredito(100);
		fornecedor1.setValorDIvida(50);
		
		empregado1.setNome("Lucia");
		empregado1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua outra - Nº 100");
		empregado1.setTelefone("+55 022 9999-9991");
		empregado1.setCodigoSetor(100);
		empregado1.setImposto(5);
		empregado1.setSalarioBase(100);
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndreco());
		System.out.println(fornecedor1.getTelefone());
		System.out.println(fornecedor1.getValorCredito());
		System.out.println(fornecedor1.getValorDIvida());
		System.out.println(fornecedor1.obterSaldo());
		
		System.out.println(empregado1.getNome());
		System.out.println(empregado1.getEndreco());
		System.out.println(empregado1.getTelefone());
		System.out.println(empregado1.getCodigoSetor());
		System.out.println(empregado1.getCodigoSetor());
		System.out.println(empregado1.getImposto());
		System.out.println(empregado1.getSalarioBase());
		System.out.println(empregado1.calcularSalario());
	}
}
