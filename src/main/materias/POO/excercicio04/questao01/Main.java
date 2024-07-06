package POO.excercicio04.questao01;

public class Main {
	public static void main(String[] args) {
		Tecnico tecnico1 = new Tecnico("Ivanilso", "000.000.000-00", "000000000000", 12.0);
		Administrativo assistente1 = new Administrativo("Lucia", "000.000.000-01", "000000000001", "noite", 0.0);
		
		System.out.println(tecnico1.exibirDados());
		System.out.println(assistente1.exibirDados());
	}
}