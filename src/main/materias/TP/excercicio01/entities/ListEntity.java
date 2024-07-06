package TP.excercicio01.entities;

import TP.excercicio01.interfaces.ListInterface;

public class ListEntity<T> implements ListInterface<T> {
	// Fields
	private NoEntity<T> first = null;
	private NoEntity<T> last = null;
	private int length = 0;
	
	// Methods - Construct
	public ListEntity() {
	}
	
	public ListEntity(T data) {
		this.length++;
		this.first = new NoEntity<T>(data, null);
		this.last = first;
	}
	
	// Methods - Encapsulation
	@Override
	public int length() {
		return this.length;
	}
	
	// Methods - Others
	@Override
	public void add(T data) {
		this.length++;
		if (this.first == null) {
			this.first = new NoEntity<T>(data, null);
			this.last = first;
		} else {
			NoEntity<T> No = new NoEntity<T>(data, null);
			this.last.setNext(No);
			this.last = No;
			if (first.getNext() == null) {
				first.setNext(this.last);
			}
		}
	}
	
	@Override
	public void addFirst(T data) {
		length++;
		if (this.first == null) {
			this.first = new NoEntity<T>(data, null);
			this.last = first;
		} else {
			NoEntity<T> aux = this.first;
			this.first = new NoEntity<T>(data, aux);
		}
	}

	@Override
	public T find(int index) {
		if (index>this.length || index<1) {
			return null;
			// Erro
		} else {
			NoEntity<T> no = this.first;
			for(int i = 0; i < index; i++) {
				no = no.getNext();
			}
			return no.getData();
		}
	}

	@Override
	public T findFirst() {
		if (this.length == 0) {
			// Erro
			return null;
		} else {
			return this.first.getData();
		}
	}

	@Override
	public T findLast() {
		if (this.length == 0) {
			// Erro
			return null;
		} else {
			return this.last.getData();
		}
	}
	
	@Override
	public void update(int index, T data) {
		if (index>this.length || index<1) {
			// Erro
		} else {
			NoEntity<T> no = this.first;
			for(int i = 0; i < index; i++) {
				no = no.getNext();
			}
			no.setData(data);
		}
	}
	
	@Override
	public void remove(int index) {
		if (index>this.length || index<1) {
			// Erro
		} else {
			this.length--;
			NoEntity<T> no = this.first;
			for(int i = 0; i < index-1; i++) {
				no = no.getNext();
			}
//			no.setNext(no.getNext().getNext());
		}
	}
	
	@Override
	public void removeFirst() {
		if (this.length == 0) {
			// Erro
		} else {
			length--;
			this.first = this.first.getNext();
		}
	}
	
	@Override
	public void removeLast() {
		if (this.length == 0) {
			// Erro
		} else {
			length--;
			NoEntity<T> no = this.first;
			
			for(int i = 0; i < this.length; i++) {
				no = no.getNext();
			}
			no.setNext(null);
		}
	}
	
	@Override
	public String toString() {
		String string;
		NoEntity<T> no = this.first;
		
		string = "[";
		for(int i = 0; i < this.length; i++) {
			string = string+no.getData().toString()+",";
			no = no.getNext();
		}
		string = string+"]";
		return string;
	}
}
