package TP.excercicio03.entities;

import TP.excercicio03.interfaces.QueueInterface;

public class QueueEntity_Encadeada<T> implements QueueInterface<T> {
	// Fields
	private NoEntity<T> first = null;
	private int length = 0;
	
	// Methods - Construct
	/**
	 * Create an empty queue
	 */
	public QueueEntity_Encadeada() {
	}
	
	/**
	 * Creates a stack filling it with a single data
	 * 
	 * @param data
	 */
	public QueueEntity_Encadeada(T data) {
		this.first = new NoEntity<T>(data, null);
		this.length++;
	}
	
	// Methods - Others
	public InteratorEntity<T> getInterator() {
		return new InteratorEntity<T>(this.first);
	}
	
	@Override
	public int length() {
		return this.length;
	}
	
	public boolean enqueue(T data) {
		length++;
		if (this.first == null) {
			this.first = new NoEntity<T>(data, null);
		} else {
			NoEntity<T> no = this.first;
			while (no.getNext() != null) {
				no = no.getNext();
			}
			no.setNext(new NoEntity<T>(data, null));
		}
		return true;
	}
	
	public T dequeue() {
		if (this.length > 0) {
			NoEntity<T> aux = this.first;
			this.first = aux.getNext();
			this.length--;
			return aux.getData();
		} else {
			return null;
		}
	}
	
	@Override
	public T getTop() {
		return this.first.getData();
	}
	
	public boolean isEmpity() {
		if (this.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String string = "[";
		NoEntity<T> no = first;
		
		while (no != null) {
			string = string + no.getData().toString()+",";
			no = no.getNext();
		}
		
		string = string+"]";
		return string;
	}
}
