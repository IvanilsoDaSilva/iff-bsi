package TP.excercicio03.entities;

import TP.excercicio03.interfaces.StackInterface;

public class StackEntity_Sequencial<T> implements StackInterface<T> {
	// Fields
	private int first = -1;
	private Object[] arr; 
	private int length = 0;
	
	// Methods - Construct
	public StackEntity_Sequencial(int length) {
		this.arr = new Object[length];
		this.length = length;
		first = length-1;
	}
	
	public StackEntity_Sequencial(T data, int length) {
		this.arr = new Object[length];
		this.arr[0] = (T) data;
		this.length = length;
		first = 0;
	}
	
	public StackEntity_Sequencial(Object[] arr) {
		this.arr = arr;
		this.length = arr.length;
		first = arr.length-1;
	}
	
	public StackEntity_Sequencial(Object[] arr, int length) {
		this.arr = new Object[length];
		
		for(int i=0; i<arr.length;i++) {
			this.arr[i] = arr[i]; 
		}
		
		this.length = length;
		first = arr.length-1;
	}
	
	// Methods - Others
	@Override
	public int length() {
		return this.length;
	}
	
	@Override
	public T pop() {
		if (this.first != -1) {
			T aux = (T) this.arr[first];
			this.arr[first] = null;
			this.first--;
			return aux;
			
		} else {
			return null;
		}
	}
	
	@Override
	public T getTop() {
		if (this.first != -1) {
			return (T) this.arr[first];
		} else {
			return null;
		}
	}
	
	public boolean isEmpity() {
		if (this.first == -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(T data) {
		if (this.first != this.length-1) {
			arr[this.first+1] = data;
			this.first++;
		} else {
			
		}
	}
	
	@Override
	public String toString() {
		String string = "[";
		
		for (int i=0; i<this.length;i++) {
			string = string+this.arr[i]+",";
		}
		
		return string+"]";
	}
}
