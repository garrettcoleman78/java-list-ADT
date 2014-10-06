/**
 * Author: Garrett Coleman
 * Student No.: 96344598
 * Course: MSc Computer Science (Conversion) 2013-2014 
 * Module: COMP47160 Advanced Java, Data Structures & Algorithms
 * Lecturer: Rem Collier
 * Practical 9 
 * Date: 26 Feb 2014
 * This program creates a genericised interface called Position that defines
 * the public method signatures that will be referenced by classes
 * that implement the Position interface
 */

package W9;

public interface Position<T> {
	public T element();
}
