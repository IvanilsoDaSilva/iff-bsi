package POO.excercicio02.questao03.Contador;

public class Main {
	public static void main(String[] args) {
		Contador contador1 = new Contador();
		
		contador1.setNumero(2);
		contador1.incremento();
		System.out.print(contador1.getNumero()+"\n");
		contador1.decremento();
		System.out.print(contador1.getNumero());
	}
}
