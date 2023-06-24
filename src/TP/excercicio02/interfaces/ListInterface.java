package TP.excercicio02.interfaces;

import TP.excercicio02.entities.InteratorEntity;
import TP.excercicio02.entities.NoEntity;

public interface ListInterface <T> {
	public InteratorEntity<T> getInterator();
	public int length();
	public void add(T data);
	public void addFirst(T data);
	public T find(int index);
	public T findFirst();
	public T findLast();
	public void update(int index, T data);
	public void remove(int index);
	public void removeFirst();
	public void removeLast();
}
