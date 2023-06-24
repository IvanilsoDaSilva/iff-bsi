package TP.excercicio02;

import TP.excercicio02.entities.ListEntity;
import TP.excercicio02.entities.InteratorEntity;

public class Main {
	public static void main(String[] args) {
		ListEntity<Integer> lista = new ListEntity<Integer>(1);
		InteratorEntity<Integer> interador_lista = lista.getInterator();
		
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
//		lista.addFirst(1);
//		lista.update(1, 100);
//		lista.remove(1); // Não funciona
//		lista.removeFirst();
//		lista.removeLast();
		
//		System.out.println("Primeiro elemento: "+lista.findFirst());
//		System.out.println("Ultimo elemento: "+lista.findLast());
//		System.out.println("Tamanho da lista: "+lista.length());
//		System.out.println("Segundo elemento: "+lista.find(1));
//		System.out.println("Para String: "+lista.toString());
		System.out.print("Varrer lista: ");
		while (!interador_lista.isLast()) {System.out.print(interador_lista.getNextData());}
	}
}
