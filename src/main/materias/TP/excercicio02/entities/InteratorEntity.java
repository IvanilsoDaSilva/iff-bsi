package TP.excercicio02.entities;

import TP.excercicio02.interfaces.InteratorInterface;

public class InteratorEntity<T> implements InteratorInterface<T>{
	// Fields
	private NoEntity<T> current;
	
	// Methods - Construct
	public InteratorEntity(NoEntity<T> current) {
		this.current = current;
	}
	
	// Methods - Encapsulation
	public NoEntity<T> current() {
		return this.current;
	}

	// Methods - Others
	@Override
	public T getNextData() {
		T aux = current.getData();
		this.current = this.current.getNext();
		return aux;
	}

	@Override
	public Boolean isLast() {
		if (current == null) {
			return true;
		} else {
			return false;
		}
	}
}
