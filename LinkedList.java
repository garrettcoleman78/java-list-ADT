/**
 * Author: Garrett Coleman
 * Student No.: 96344598
 * Course: MSc Computer Science (Conversion) 2013-2014 
 * Module: COMP47160 Advanced Java, Data Structures & Algorithms
 * Lecturer: Rem Collier
 * Practical 9, Question 1 
 * Date: 26 Feb 2014
 * This program creates a genericised class called LinkedList and implements the
 * genericised List interface using an doubly linked list approach, with a main method
 * creates a linked list, inserts data and displays the linked list
 */

package W9;

public class LinkedList<T> implements List<T> {
	private class Node implements Position<T> {
		T element;
		Node next, prev;
		
		public Node(T element) {
			this.element = element;
		}

		@Override
		public T element() {
			return element;
		}
	}
	
	Node front, rear;
	int size = 0;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Position<T> first() {
		if (front == null) throw new ListEmptyException();
		return front;
	}

	@Override
	public Position<T> last() {
		if (rear == null) throw new ListEmptyException();
		return rear;
	}

	@Override
	public Position<T> prev(Position<T> p) {
		if (isEmpty()) throw new ListEmptyException();
		return ((Node) p).prev;
	}

	@Override
	public Position<T> next(Position<T> p) {
		return ((Node) p).next;
	}

	@Override
	public Position<T> insertFirst(T e) {
		Node n = new Node(e);
		if (front == null) {
			rear = n;
		} else {
			n.next = front;
			front.prev = n;
		}
		front = n;
		size++;
		return n;
	}

	@Override
	public Position<T> insertLast(T e) {
		Node n = new Node(e);
		if (rear == null) {
			front = n;
		}
		else {
			n.prev = rear;
			rear.next = n;
		}
		rear = n;
		size++;
		return n;
	}

	@Override
	public Position<T> insertBefore(Position<T> p, T e) {
		if (p == front) return insertFirst(e);
		
		Node node = (Node) p;
		
		Node n = new Node(e);
		n.prev = node.prev;
		n.next = node;
		node.prev.next = n;
		node.prev = n;
		size++;
		return n;	
	}

	@Override
	public Position<T> insertAfter(Position<T> p, T e) {
		if (p == rear) return insertLast(e);
		
		Node node = (Node) p;
		
		Node n = new Node(e);
		n.next = node.next;
		n.prev = node;
		node.next.prev = n;
		node.next = n;
		size++;
		return n;
	}

	@Override
	public T replace(Position<T> p, T e) {
		if (front == null) throw new ListEmptyException();
		
		Node node = (Node) p;
		Node n = new Node(e);
		
		T toReturn = node.element;
		
		if (node == front) {
			front = n;
		}
		if (node == rear) {
			rear = n;
		}
		n.next = node.next;
		n.prev = node.prev;
		
		return toReturn;
	}

	@Override
	public T remove(Position<T> p) {
		if (front == null) throw new ListEmptyException();
		
		Node node = (Node) p;
		
		if (p == front) {
			front = front.next;
		}
		else {
			node.prev.next = node.next;
		}
		
		if (p == rear) {
			rear = rear.prev;
		}
		else {
			node.next.prev = node.prev;
		}
		
		size--;
		return node.element;
	}
	
	public String toString() {

		String out = "[" + size + "]: ";
		Node n = front;
		while ( n != null ) {
			if( n.next != null){
				out +=  "\""+ n.element + "\"" + ",";
			} else {
				out +=  "\""+ n.element + "\"";
			}
			n = n.next;
		}
		return out;
	}	
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		Position<String> f = list.insertFirst("P");
		list.insertFirst("A");
		list.insertAfter(f, "E");
		
		// Display the contents of the list
		Position<String> p = list.first();
		System.out.print(list);
	}
}
