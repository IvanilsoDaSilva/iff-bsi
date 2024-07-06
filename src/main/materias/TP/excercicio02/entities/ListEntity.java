package TP.excercicio02.entities;

import TP.excercicio02.interfaces.ListInterface;

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
	
	// Methods - Others
	@Override
	public InteratorEntity<T> getInterator() {
		return new InteratorEntity<T>(this.first);
	}
	
	@Override
	public Integer length() {
		return this.length;
	}
	
	@Override
	public boolean add(T data) {
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
		return true;
	}
	
	@Override
	public boolean addFirst(T data) {
		length++;
		if (this.first == null) {
			this.first = new NoEntity<T>(data, null);
			this.last = first;
		} else {
			NoEntity<T> aux = this.first;
			this.first = new NoEntity<T>(data, aux);
		}
		return true;
	}
	
	public boolean addToIndex(Integer index, T data) {
		if (index>this.length || index<0) {
			return false;
		} else if(index == 0) {
			NoEntity<T> aux = this.first;
			this.first = new NoEntity<T>(data, aux);
			length++;
			return true;
		} else {
			NoEntity<T> no = this.first;
			for(int i = 0; i < index-1; i++) {
				no = no.getNext();
			}
			
			NoEntity<T> aux = no.getNext();
			no.setNext(new NoEntity<T>(data, aux));
			length++;
			return true;
		}
	}

	@Override
	public T findToIndex(Integer index) {
		if (index>this.length || index<0) {
			return null;
		} else {
			NoEntity<T> no = this.first;
			for(int i = 0; i < index; i++) {
				no = no.getNext();
			}
			return no.getData();
		}
	}
	
	@Override
	public Integer findToData(T data) {
		NoEntity<T> no = this.first;
		Integer index = -1;
		
		while(no != null) {
			index++; 
			
			if (no.getData().equals(data)) {
				break;
			}
			
			no = no.getNext();
		}
		
		if (no == null) {
			index = null;
		}
		
		return index;
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
	public boolean updateToIndex(Integer index, T data) {
		if (index>this.length || index<1) {
			return false;
		} else {
			NoEntity<T> no = this.first;
			for(int i = 0; i < index; i++) {
				no = no.getNext();
			}
			no.setData(data);
			return true;
		}
	}
	
	@Override
	public boolean removeToIndex(Integer index) {
		if (index>this.length-1 || index<0) {
			return false;
		} else if (index == 0) {
			removeFirst();
			return true;
		} else {
			this.length--;
			NoEntity<T> no = this.first;
			for(int i = 0; i < index-1; i++) {
				no = no.getNext();
			}
			no.setNext(no.getNext().getNext());
			return true;
		}
	}
	
	@Override
	public boolean removeToData(T data) {
		Integer index = findToData(data);
		if (index != null) {
			removeToIndex(index);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean removeFirst() {
		if (this.length == 0) {
			return false;
		} else {
			length--;
			this.first = this.first.getNext();
			return true;
		}
	}
	
	@Override
	public boolean removeLast() {
		if (this.length == 0) {
			return false;
		} else {
			length--;
			NoEntity<T> no = this.first;
			
			for(int i = 0; i < this.length; i++) {
				no = no.getNext();
			}
			no.setNext(null);
			return true;
		}
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
