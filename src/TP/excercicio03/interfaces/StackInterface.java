package TP.excercicio03.interfaces;

import TP.excercicio03.entities.StackEntity_Encadeada;

public interface StackInterface<T> {
	/**
	 * Informs the length of the list
	 * 
	 * @return length
	 */
	public int length();
	
	/**
	 * Place a data on top of the stack
	 * 
	 * @param data
	 * @return state
	 */
	public boolean push(T data);
	
	/**
	 * Take a data from the top of the stack
	 * 
	 * @return data
	 * @return state
	 */
	public T pop();
	
	
	/**
	 * View data at the top of the stack
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
	
	/**
	 * Checks if two batteries are equal
	 * 
	 * @param stack
	 * @return if stack is equals to current stack
	 */
	public boolean isEquals(StackEntity_Encadeada stack);
}
