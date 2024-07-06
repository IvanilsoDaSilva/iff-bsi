package TP.excercicio03.entities;

public class NoEntity<T> {
	// Fields
	private NoEntity<T> next;
	private T data;
	
	// Methods - Construct
	public NoEntity() {
	}
	
	public NoEntity(T data, NoEntity<T> next) {
		this.data = data;
		this.next = next;
	}
	
	// Methods - Setters and Getters
	public NoEntity<T> getNext() {
		return next;
	}
	public void setNext(NoEntity<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
