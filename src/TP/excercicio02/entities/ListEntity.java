package TP.excercicio02.entities;

import TP.excercicio02.interfaces.ListInterface;

public class ListEntity<T> implements ListInterface<T> {
	// Fields
	private int length;
	
	// Methods - Construct
	public ListEntity() {
	}
	
	public ListEntity(T data) {
	}
	
	// Methods - Encapsulation
	public int length() {
		return this.length;
	}
	
	// Methods - Others
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addFirst(T data) {
		// TODO Auto-generated method stub
	}

	@Override
	public T find(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(int index, T data) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
	}
}
