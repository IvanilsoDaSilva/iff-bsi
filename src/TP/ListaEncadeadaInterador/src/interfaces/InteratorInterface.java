package interfaces;

import entities.NoEntity;

public interface InteratorInterface<T> {
	public NoEntity<T> getNext();
	public Boolean isLast();
}
