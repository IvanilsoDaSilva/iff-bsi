package TP.excercicio03.interfaces;

public interface QueueInterface<T> {
	public int length();
	public boolean enqueue(T data);
	public T dequeue();
	public T getTop();
	public boolean isEmpity();
}
