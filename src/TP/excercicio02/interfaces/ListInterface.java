package TP.excercicio02.interfaces;

import TP.excercicio02.entities.InteratorEntity;
import TP.excercicio02.entities.NoEntity;

public interface ListInterface <T> {
	public InteratorEntity<T> getInterator();
	public Integer length();
	public void add(T data);
	public void addFirst(T data);
	public void addToIndex( Integer index, T data);
	public T findToIndex(Integer index);
	public Integer findToData(T data);
	public T findFirst();
	public T findLast();
	public void updateToIndex(Integer index, T data);
	public void removeToIndex(Integer index);
	public void removeFirst();
	public void removeLast();
}
