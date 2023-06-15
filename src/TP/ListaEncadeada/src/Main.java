import entities.ListEntity;

public class Main {
	public static void main(String[] args) {
		ListEntity<Integer> lista = new ListEntity<Integer>(1);
		
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
//		lista.addFirst(1);
//		lista.update(2, 3);
//		lista.remove(1); // Não funciona
//		lista.removeFirst();
//		lista.removeLast();
		
		
		System.out.println("Primeiro elemento: "+lista.findFirst());
		System.out.println("Ultimo elemento: "+lista.findLast());
		System.out.println("Tamanho elemento: "+lista.length());
		System.out.println("Segundo elemento: "+lista.find(2));
		System.out.println("Para String: "+lista.toString());
	}
}
