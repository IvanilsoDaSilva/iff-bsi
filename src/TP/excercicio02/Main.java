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
		System.out.println("Objeto inicial: "+lista.toString());
		
		lista.addToIndex(6, 200);
		System.out.println("Adicinar a posicao 0: "+lista.toString());
		
		lista.addFirst(0);
		System.out.println("Adicionar ao inicio: "+lista.toString());
		
		lista.updateToIndex(1, 100);
		System.out.println("Atualizar na posição: "+lista.toString());
		
//		lista.removeToIndex(1); // Não funciona
//		System.out.println("Para String: "+lista.toString());
		
		lista.removeFirst();
		System.out.println("Remover no inicio: "+lista.toString());
		
		lista.removeLast();
		System.out.println("Remover no final: "+lista.toString());
		
		System.out.println("Primeiro elemento: "+lista.findFirst());
		System.out.println("Ultimo elemento: "+lista.findLast());
		System.out.println("Tamanho da lista: "+lista.length());
		System.out.println("Segundo elemento: "+lista.findToIndex(1));
		System.out.println("Para String: "+lista.toString());
		System.out.println("Posição do elemento 3: "+lista.findToData(3));
		System.out.print("Varrer lista via interador: ");
		while (!interador_lista.isLast()) {System.out.print(interador_lista.getNextData()+",");}
	}
}
