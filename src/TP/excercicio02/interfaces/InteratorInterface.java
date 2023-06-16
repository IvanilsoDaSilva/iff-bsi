package TP.excercicio02.interfaces;

import TP.excercicio02.entities.NoEntity;

public interface InteratorInterface<T> {
	public NoEntity<T> getNext();
	public Boolean isLast();
}
