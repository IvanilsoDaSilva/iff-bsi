package POO.excercicio06;

public class Main {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Ivanilso", "da Silva", "000", 3.500);
		
		System.out.println(empregado1.getNome()+empregado1.getSobrenome());
		System.out.println(empregado1.getMatricula());
		System.out.println(empregado1.getSalario());
		System.out.println(empregado1.getTotalPagamento());
	}
}
