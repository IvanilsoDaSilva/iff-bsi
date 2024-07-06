package POO.excercicio05;

public class Main {
	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();
		Administrador admistrador1 = new Administrador();
		Operario operario1 = new Operario();
		Vendedor vendedor1 = new Vendedor();
		
		fornecedor1.setNome("Ivanilso");
		fornecedor1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua Tal - Nº 58");
		fornecedor1.setTelefone("+55 022 9999-9999");
		fornecedor1.setValorCredito(100);
		fornecedor1.setValorDIvida(50);
		
		admistrador1.setNome("Lucia");
		admistrador1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua outra - Nº 100");
		admistrador1.setTelefone("+55 022 9999-9991");
		admistrador1.setCodigoSetor(100);
		admistrador1.setImposto(5);
		admistrador1.setAjudaDeCusto(2);
		admistrador1.setSalarioBase(100);
		
		operario1.setNome("Lucia");
		operario1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua outra - Nº 100");
		operario1.setTelefone("+55 022 9999-9991");
		operario1.setCodigoSetor(100);
		operario1.setImposto(5);
		operario1.setValorProducao(2);
		operario1.setComissao(3);
		operario1.setSalarioBase(100);
		
		vendedor1.setNome("Lucia");
		vendedor1.setEndreco("Campos dos Goytacazes/RJ - Tocos, Rua outra - Nº 100");
		vendedor1.setTelefone("+55 022 9999-9991");
		vendedor1.setCodigoSetor(100);
		vendedor1.setImposto(5);
		vendedor1.setValorVendas(2);
		vendedor1.setComissao(3);
		vendedor1.setSalarioBase(100);
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndreco());
		System.out.println(fornecedor1.getTelefone());
		System.out.println(fornecedor1.getValorCredito());
		System.out.println(fornecedor1.getValorDIvida());
		System.out.println(fornecedor1.obterSaldo());
		System.out.println();
		System.out.println(admistrador1.getNome());
		System.out.println(admistrador1.getEndreco());
		System.out.println(admistrador1.getTelefone());
		System.out.println(admistrador1.getCodigoSetor());
		System.out.println(admistrador1.getCodigoSetor());
		System.out.println(admistrador1.getImposto());
		System.out.println(admistrador1.getSalarioBase());
		System.out.println(admistrador1.calcularSalario());
		System.out.println();
		System.out.println(operario1.getNome());
		System.out.println(operario1.getEndreco());
		System.out.println(operario1.getTelefone());
		System.out.println(operario1.getCodigoSetor());
		System.out.println(operario1.getCodigoSetor());
		System.out.println(operario1.getImposto());
		System.out.println(operario1.getSalarioBase());
		System.out.println(operario1.calcularSalario());
		System.out.println();
		System.out.println(vendedor1.getNome());
		System.out.println(vendedor1.getEndreco());
		System.out.println(vendedor1.getTelefone());
		System.out.println(vendedor1.getCodigoSetor());
		System.out.println(vendedor1.getCodigoSetor());
		System.out.println(vendedor1.getImposto());
		System.out.println(vendedor1.getSalarioBase());
		System.out.println(vendedor1.calcularSalario());
	}
}
