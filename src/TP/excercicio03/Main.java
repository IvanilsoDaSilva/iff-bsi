package TP.excercicio03;

import TP.excercicio03.entities.InteratorEntity;
import TP.excercicio03.entities.QueueEntity_Encadeada;
import TP.excercicio03.entities.QueueEntity_Sequencial;
import TP.excercicio03.entities.StackEntity_Encadeada;
import TP.excercicio03.entities.StackEntity_Sequencial;

public class Main {
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static void main(String[] args) {
		
		// Pilha
		// Formas de instanciar a pilha encadeada
		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada("Primeiro");
		System.out.println("Adicionar \"false\": "+pilha.push("Segundo"));
//		
//		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada();
//		System.out.println("Adicionar \"primeiro\": "+pilha.push("primeiro"));
//		System.out.println("Adicionar \"segundo\": "+pilha.push("segundo"));
		
		// Interador
		InteratorEntity<String> interator = pilha.getInterator();
		System.out.print("Varrer lista via interador: ");
		while (!interator.isLast()) {System.out.print(interator.getNextData()+",");} System.out.println();
		
		// Formas de instanciar a pilha sequencial
//		StackEntity_Sequencial<Integer> pilha = new StackEntity_Sequencial(new Integer[] {1, 2, 3});
//		System.out.println("Para string: "+pilha.toString());
//		System.out.println("Tamanho: "+pilha.length());
//		System.out.println("Adicionar 4: "+pilha.push(4));
		
//		StackEntity_Sequencial<String> pilha = new StackEntity_Sequencial("primeiro", 10);
//		System.out.println("Para string: "+pilha.toString());
//		System.out.println("Adicionar \"segundo\": "+pilha.push("segundo"));
//		System.out.println("Adicionar \"terceiro\": "+pilha.push("terceiro"));
		
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
		System.out.println("É igual à "+new StackEntity_Encadeada(1).toString()+": "+pilha.isEquals(new StackEntity_Encadeada(1)));
		System.out.println("É igual à "+new StackEntity_Encadeada().toString()+": "+pilha.isEquals(new StackEntity_Encadeada()));
		
		// Fila
		// Formas de instanciar a fila encadeada
//		QueueEntity_Encadeada<Integer> fila = new QueueEntity_Encadeada(1);
//		System.out.println("Para string: "+fila.toString());
//		fila.enqueue(2);
		
//		QueueEntity_Encadeada<Integer> fila = new QueueEntity_Encadeada();
//		System.out.println("Para string: "+fila.toString());
//		System.out.println("Adicionar \"primeiro\": "+fila.enqueue(1));
//		System.out.println("Adicionar \"segundo\": "+fila.enqueue(2));
//		System.out.println("Adicionar \"terceiro\": "+fila.enqueue(3));
		
		// Interador
//		InteratorEntity<Integer> interator = fila.getInterator();
//		System.out.print("Varrer lista via interador: ");
//		while (!interator.isLast()) {System.out.print(interator.getNextData()+",");} System.out.println();
		
		
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
