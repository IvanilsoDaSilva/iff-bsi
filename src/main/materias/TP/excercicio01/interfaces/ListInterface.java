package TP.excercicio01.interfaces;

public interface ListInterface <T> {
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
