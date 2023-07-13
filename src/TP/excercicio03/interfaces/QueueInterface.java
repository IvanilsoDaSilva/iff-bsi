package TP.excercicio03.interfaces;

import TP.excercicio03.entities.InteratorEntity;

public interface QueueInterface<T> {	
	/**
	 * Informs the length of the list
	 * 
	 * @return length
	 */
	public int length();
	
	/**
	 * Put a data at the end of the queue
	 * 
	 * @param data
	 * @return state
	 */
	public boolean enqueue(T data);
	
	/**
	 * Take a data from the beginning of the queue
	 * 
	 * @return data
	 * @return state
	 */
	public T dequeue();
	
	/**
	 * View data from the beginning of the queue
	 * 
	 * @return data
	 */
	public T getTop();
	
	/**
	 * Returns if the list is empty
	 * 
	 * @return if the array is empty
	 */
	public boolean isEmpity();
}
