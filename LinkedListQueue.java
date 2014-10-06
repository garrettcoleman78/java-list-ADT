/**
 * Author: Garrett Coleman
 * Student No.: 96344598
 * Course: MSc Computer Science (Conversion) 2013-2014 
 * Module: COMP47160 Advanced Java, Data Structures & Algorithms
 * Lecturer: Rem Collier
 * Practical 8, Question 2 
 * Date: 21 Feb 2014
 * This program creates a genericised class called LinkedListQueue and implements the
 * genericised Queue interface using a List implementation, testing the implementation
 * with a series of enqueue and dequeue operations
 */

package W9;

public class LinkedListQueue<T> implements Queue<T> {
	
	List<T> list = new LinkedList<T>();

	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public T front() {
		return list.first().element();
	}
	
	public void enqueue(T value) {
		list.insertLast(value);
		
	}
	
	public T dequeue() {
		return list.remove(list.first());
	}
	
	public String toString() {
		return list.toString();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedListQueue<Integer>();
		
		queue.enqueue(10);
		System.out.println(queue);
		
		queue.enqueue(5);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(15);
		System.out.println(queue);
		
		queue.enqueue(3);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(7);
		System.out.println(queue);
		
		queue.dequeue();
		System.out.println(queue);
		
		queue.enqueue(20);
		System.out.println(queue);
		
		int queueValue = 0;
		while (!queue.isEmpty()) {
			queueValue += queue.dequeue();
		}
		System.out.println("Value of numbers left in queue was: " + queueValue);
	}
}
