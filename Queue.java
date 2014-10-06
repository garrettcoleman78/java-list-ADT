/**
 * Author: Garrett Coleman
 * Student No.: 96344598
 * Course: MSc Computer Science (Conversion) 2013-2014 
 * Module: COMP47160 Advanced Java, Data Structures & Algorithms
 * Lecturer: Rem Collier
 * Practical 9 
 * Date: 26 Feb 2014
 * This program creates a genericised interface called Queue that defines
 * the public method signatures and variables that will be referenced by classes
 * that implement the Queue interface
 */

package W9;

public interface Queue<T> {
	public void enqueue(T value);
	public T dequeue();
	public T front();
	public boolean isEmpty();
	public int size();
}
