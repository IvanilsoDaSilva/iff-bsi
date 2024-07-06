package TP.excercicio03.interfaces;

public interface InteratorInterface<T> {
	/**
	 * Get the next data from the list
	 * 
	 * @return data
	 */
	public T getNextData();
	
	/**
	 * Get the next data from the list
	 * 
	 * @return Get the next data from the list 
	 */
	public Boolean isLast();
}
