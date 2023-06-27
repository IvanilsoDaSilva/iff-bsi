package TP.excercicio03;

import TP.excercicio03.entities.StackEntity_Encadeada;
import TP.excercicio03.entities.StackEntity_Sequencial;

public class Main {
	public static void main(String[] args) {
		// Formas de instanciar a pilha encadeada
//		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada<String>("primeiro");
//		pilha.push("segundo");
		
//		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada<String>();
//		pilha.push("primeiro");
//		pilha.push("segundo");
		
		// Formas de instanciar a pilha sequencial
//		StackEntity_Sequencial<String> pilha = new StackEntity_Sequencial<String>(new String[] {"primeiro"});
		
//		StackEntity_Sequencial<String> pilha = new StackEntity_Sequencial<String>("primeiro", 10);
//		pilha.push("segundo");
		
		StackEntity_Sequencial<String> pilha = new StackEntity_Sequencial<String>(new String[] {"primeiro"}, 10);
		pilha.push("segundo");
		
		
		System.out.println("Para string: "+pilha.toString());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Ver topo: "+pilha.getTop());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("Para string: "+pilha.toString());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("Desempilhar: "+pilha.pop());
		System.out.println("É vazía? "+pilha.isEmpity());
		System.out.println("Para string: "+pilha.toString());
	}
}
