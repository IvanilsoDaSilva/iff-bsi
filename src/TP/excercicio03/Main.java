package TP.excercicio03;

import TP.excercicio03.entities.StackEntity_Encadeada;
import TP.excercicio03.entities.StackEntity_Sequencial;

public class Main {
	public static void main(String[] args) {
//		StackEntity_Encadeada<String> pilha = new StackEntity_Encadeada<String>("primeiro");
		StackEntity_Encadeada<String> pilha = new StackEntity_Sequencial<String>("primeiro");
		
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
