package TP.excercicio03;

import TP.excercicio03.entities.QueueEntity_Encadeada;
import TP.excercicio03.entities.QueueEntity_Sequencial;
import TP.excercicio03.entities.StackEntity_Encadeada;
import TP.excercicio03.entities.StackEntity_Sequencial;

public class Main {
	public static void main(String[] args) {
		// Pilha
		// Formas de instanciar a pilha encadeada
//		StackEntity_Encadeada<Boolean> pilha = new StackEntity_Encadeada(true);
//		System.out.println("Adicionar \"false\": "+pilha.push(false));
		
//		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada();
//		System.out.println("Para string: "+pilha.toString());
//		System.out.println("Adicionar \"primeiro\": "+pilha.push("primeiro"));
//		System.out.println("Adicionar \"segundo\": "+pilha.push("segundo"));
		
		// Formas de instanciar a pilha sequencial
		StackEntity_Sequencial<Integer> pilha = new StackEntity_Sequencial(new Integer[] {1, 2, 3});
		System.out.println("Para string: "+pilha.toString());
		System.out.println("Adicionar \"segundo\": "+pilha.push(4));
	
//		StackEntity_Sequencial<Integer> pilha = new StackEntity_Sequencial<Integer>(new Integer[] {1,2}, 3);
//		System.out.println("Para string: "+pilha.toString());
//		System.out.println("Adicionar \"4\": "+pilha.push(3));
//		System.out.println("Adicionar \"5\": "+pilha.push(4));
		
		// Chamada dos metodos da pilha encadeada e sequencial
		System.out.println("Para string: "+pilha.toString());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Ver topo: "+pilha.getTop());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("Para string: "+pilha.toString());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Para string: "+pilha.toString());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Para string: "+pilha.toString());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Para string: "+pilha.toString());
		
		// Fila
		// Formas de instanciar a fila encadeada
//		QueueEntity_Encadeada<Boolean> fila = new QueueEntity_Encadeada(true);
//		System.out.println("Para string: "+fila.toString());
//		fila.enqueue(false);
		
//		QueueEntity_Encadeada<String> fila = new QueueEntity_Encadeada();
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Adicionar \"primeiro\": "+fila.enqueue("primeiro"));
//		System.out.println("Adicionar \"segundo\": "+fila.enqueue("segundo"));
//		System.out.println("Adicionar \"terceiro\": "+fila.enqueue("terceiro"));
		
		
		// Formas de instanciar a fila sequencial
//		QueueEntity_Sequencial<String> fila = new QueueEntity_Sequencial(new String[] {"primeiro", "segundo", "terceiro"});
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Adicionar \"segundo\": "+fila.enqueue("segundo"));
		
//		QueueEntity_Sequencial<String> fila = new QueueEntity_Sequencial("primeiro", 10);
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Adicionar \"segundo\": "+fila.enqueue("segundo"));
//		System.out.println("Adicionar \"terceiro\": "+fila.enqueue("terceiro"));
	
//		QueueEntity_Sequencial<Integer> fila = new QueueEntity_Sequencial(new Integer[] {1,2}, 3);
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Adicionar \"4\": "+fila.enqueue(3));
//		System.out.println("Adicionar \"5\": "+fila.enqueue(4));
		
		
		// Chamada dos metodos da fila encadeada e sequencial
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("É vazía? "+fila.isEmpity());
//		System.out.println("Ver topo: "+fila.getTop());
//		System.out.println("Desenfilar: "+fila.dequeue());
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Ver topo: "+fila.getTop());
//		System.out.println("Desenfilar: "+fila.dequeue());
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("É vazía? "+fila.isEmpity());
//		System.out.println("Desenfilar: "+fila.dequeue());
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("É vazía? "+fila.isEmpity());
//		System.out.println("Desenfilar: "+fila.dequeue());
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("É vazía? "+fila.isEmpity());
//		System.out.println("Desenfilar: "+fila.dequeue());
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("É vazía? "+fila.isEmpity());
	}
}
