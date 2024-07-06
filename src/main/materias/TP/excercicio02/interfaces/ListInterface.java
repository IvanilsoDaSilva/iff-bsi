package TP.excercicio02.interfaces;

import TP.excercicio02.entities.InteratorEntity;

public interface ListInterface <T> {
	public InteratorEntity<T> getInterator();
	public Integer length();
	public boolean add(T data);
	public boolean addFirst(T data);
	public boolean addToIndex(Integer index, T data);
	public T findToIndex(Integer index);
	public Integer findToData(T data);
	public T findFirst();
	public T findLast();
	public boolean updateToIndex(Integer index, T data);
	public boolean removeToIndex(Integer index);
	public boolean removeToData(T data);
	public boolean removeFirst();
	public boolean removeLast();
	public boolean isEmpity();
}
