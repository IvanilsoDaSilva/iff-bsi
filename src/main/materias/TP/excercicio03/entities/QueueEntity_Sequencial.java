package TP.excercicio03.entities;

import TP.excercicio03.interfaces.QueueInterface;

public class QueueEntity_Sequencial<T> implements QueueInterface<T> {
	// Fields
	private int last = -1;
	private Object[] arr; 
	private int length = 0;
	
	// Methods - Construct
	/**
	 * Create an empty queue
	 * 
	 * @param length of queue
	 */
	public QueueEntity_Sequencial(int length) {
		this.arr = new Object[length];
		this.length = length;
	}
	
	/**
	 * Creates a stack filling it with a single data
	 * 
	 * @param data
	 * @param length of queue
	 */
	public QueueEntity_Sequencial(T data, int length) {
		this.arr = new Object[length];
		this.length = length;
		this.arr[arr.length-1] = (T) data;
		this.last++;
	}
	
	/**
	 * Create a queue from an array
	 * 
	 * @param array
	 */
	public QueueEntity_Sequencial(Object[] arr) {
		this.arr = new Object[arr.length];
		this.length = this.arr.length;
		
		for (Object i : arr) {
			this.arr[length-1] = i;
			length--;
		}
		
		this.length = this.arr.length;
		this.last = arr.length-1;
	}
	
	/**
	 * creates a queue based on a size and fills it from an array
	 * 
	 * @param array
	 * @param length of queue
	 */
	public QueueEntity_Sequencial(Object[] arr, int length) {
		if (length >= arr.length) {
			this.arr = new Object[length];
			
			for (Object i : arr) {
				this.arr[length-1] = i;
				length--;
			}

			this.length = this.arr.length;
			this.last = arr.length-1;
		} else {
			System.out.println("O tamanho de array deve ser menor ou igual ao tamanho informado");
		}
	}
	
	// Methods - Others
	@Override
	public int length() {
		return this.length;
	}
	
	@Override
	public T dequeue() {
		if (this.last != -1) {
			T data = (T) this.arr[this.length-1];
			
			for (int i=this.length-1; i>0; i--) {
				this.arr[i] = this.arr[i-1];
				this.arr[i-1] = null;
			}
			
			last--;
			return data;
		} else {
			return null;
		}
	}
	
	@Override
	public T getTop() {
		if (this.last != -1) {
			return (T) this.arr[this.length-1];
		} else {
			return null;
		}
	}
	
	public boolean isEmpity() {
		if (this.last == -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean enqueue(T data) {
		if (this.last < this.length-1) {
			this.arr[this.length-2-this.last] = data;
			this.last++;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		String string = "[";
		
		for (int i=this.length-1;i>=0;i--) {
			string = string+this.arr[i]+",";
		}
		
		return string+"]";
	}
}
