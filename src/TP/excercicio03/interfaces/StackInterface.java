package TP.excercicio03.interfaces;

public interface StackInterface<T> {
	public int length();
	public boolean push(T data);
	public T pop();
	public T getTop();
	public boolean isEmpity();
}
