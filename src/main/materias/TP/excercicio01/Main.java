package TP.excercicio01;

import TP.excercicio01.entities.ListEntity;

public class Main {
	public static void main(String[] args) {
		ListEntity<String> lista = new ListEntity<String>("primeiro");
		
		lista.add("segundo");
		lista.add("terceiro");
		lista.add("quarto");
		lista.add("quinto");
		lista.add("sexto");
//		lista.addFirst(1);
//		lista.update(1, 100);
//		lista.remove(1); // Não funciona
//		lista.removeFirst();
//		lista.removeLast();
		
		
		System.out.println("Primeiro elemento: "+lista.findFirst());
		System.out.println("Ultimo elemento: "+lista.findLast());
		System.out.println("Tamanho da lista: "+lista.length());
		System.out.println("Segundo elemento: "+lista.find(1));
		System.out.println("Para String: "+lista.toString());
	}
}
