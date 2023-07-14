package TP.excercicio03.entities;

import TP.excercicio03.interfaces.StackInterface;

@SuppressWarnings("rawtypes")
public class StackEntity_Encadeada<T> implements StackInterface<T> {
	// Fields
	private NoEntity<T> first = null;
	private int length = 0;
	
	// Methods - Construct
	/**
	 * Create an empty stack
	 */
	public StackEntity_Encadeada() {
	}
	
	/**
	 * Creates a stack filling it with a single data
	 * 
	 * @param data
	 */
	public StackEntity_Encadeada(T data) {
		this.first = new NoEntity<T>(data, null);
	}
	
	// Methods - Others
	public InteratorEntity<T> getInterator() {
		return new InteratorEntity<T>(this.first);
	}
	
	@Override
	public int length() {
		return this.length;
	}
	
	@Override
	public T pop() {
		if (this.first != null) {
			NoEntity<T> aux = this.first;
			this.first = this.first.getNext();
			return aux.getData();
		} else {
			return null;
		}
	}
	
	@Override
	public T getTop() {
		if (this.first != null) {
			return first.getData();
		} else {
			return null;
		}
	}

	@Override
	public boolean push(T data) {
		NoEntity<T> aux = this.first;
		this.first = new NoEntity<T>(data, aux);
		return true;
	}
	
	@Override
	public boolean isEmpity() {
		if (this.length == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean isEquals(StackEntity_Encadeada stack) {
		if (stack.toString().equals(toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String string = "[";
		NoEntity<T> no = this.first;
		
		while (no != null) {
			string = string+no.getData()+",";
			
			no = no.getNext();
		}
		
		return string+"]";
	}
}
