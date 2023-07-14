package TP.excercicio03.entities;

import TP.excercicio03.interfaces.StackInterface;

public class StackEntity_Sequencial<T> implements StackInterface<T> {
	// Fields
	private int last = -1;
	private Object[] arr;
	private int length = 0;
	
	// Methods - Construct
	/**
	 * Create an empty stack
	 * 
	 * @param length of stack
	 */
	public StackEntity_Sequencial(int length) {
		this.arr = new Object[length];
		this.length = length;
	}
	
	/**
	 * Creates a stack filling it with a single data
	 * 
	 * @param data
	 * @param length of stack
	 */
	public StackEntity_Sequencial(T data, int length) {
		this.arr = new Object[length];
		this.length = this.arr.length;
		this.last++;
		this.arr[last] = data;
	}
	
	/**
	 * Create a stack from an array
	 * 
	 * @param array
	 */
	public StackEntity_Sequencial(Object[] arr) {
		this.arr = arr;
		this.length = arr.length;
		this.last = this.length-1;
	}
	
	// Methods - Others
	@Override
	public int length() {
		return this.length;
	}
	
	@Override
	public T pop() {
		if (this.last != -1) {
			T data = (T) this.arr[last];
			this.arr[last] = null;
			this.last--;
			return data;
		} else {
			return null;
		}
	}
	
	@Override
	public T getTop() {
		if (this.last != -1) {
			return (T) this.arr[last];
		} else {
			return null;
		}
	}

	@Override
	public boolean push(T data) {
		if (last+1 == length) {
			return false;
		} else {
			last++;
			this.arr[last] = data;
			return true;
		}
	}
	
	@Override
	public boolean isEmpity() {
		if (this.last == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean isEquals(StackEntity_Encadeada stack) {
		if (stack.toString().equals(toString())) {
			System.out.println(stack.toString());
			System.out.println(toString());
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String string = "[";
		
		for(int i=length-1; i>=0;i--) {
			string = string+(T)this.arr[i]+",";
		}
		
		return string+"]";
	}
}
