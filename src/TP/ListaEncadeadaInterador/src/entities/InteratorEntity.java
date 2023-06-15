package entities;

import interfaces.InteratorInterface;

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
	public NoEntity<T> getNext() {
		return this.current.getNext();
	}

	@Override
	public Boolean isLast() {
		if (current.getNext() == null) {
			return true;
		} else {
			return false;
		}
	}
}
