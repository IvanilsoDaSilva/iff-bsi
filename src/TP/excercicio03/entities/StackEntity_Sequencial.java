package TP.excercicio03.entities;

import TP.excercicio02.entities.NoEntity;
import TP.excercicio03.interfaces.StackInterface;

public class StackEntity_Sequencial<T> implements StackInterface<T> {
	// Fields
	private int topo = -1;
	private Object[] arr; 
	
	// Methods - Construct
	public StackEntity_Sequencial(int length) {
		this.arr = new Object[length];
	}
	
//	public StackEntity_Sequencial(int length, T data) {
//		this.first = new NoEntity<T>(data, null);
//	}
	
	// Methods - Others
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
	
	public boolean isEmpity() {
		if (this.first == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void push(T data) {
		NoEntity<T> aux = this.first;
		this.first = new NoEntity<T>(data, aux);
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
