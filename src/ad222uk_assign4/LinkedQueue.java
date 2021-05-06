package ad222uk_assign4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {

	private class Node { 
		private T data;
		private Node next;
	}
	
	private int size = 0;
	private Node head;
	private Node tail;

	public LinkedQueue() {}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() { 
		return head == null;
	}

	@Override
	public void enqueue(T element) { 
		if (isEmpty() == true) {
			Node newNode = new Node();
			newNode.data = element;
			head = newNode;
			tail = head;

		} else {
			Node newNode = new Node();
			newNode.data = element;
			tail.next = newNode;
			tail = tail.next;
		}
		size++;
	}

	@Override
	public T dequeue() { 
		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}

		T element = head.data;
		head = head.next;
		size--;
		return element;
	}

	@Override
	public T first() {
		if (head == null) {
			throw new NoSuchElementException();
		} else
			return head.data;
	}

	@Override
	public T last() {
		if (tail == null) {
			throw new NoSuchElementException();
		} else
			return tail.data;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		Node newNode = new Node();
		newNode = head;
		string.append("<");
		while (newNode != null) {
			string.append(" " + newNode.data);
			newNode = newNode.next;
		}
		string.append(" >");
		return string.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator<T>();
	}

	private class QueueIterator<X> implements Iterator<X> { 
		
		private Node position = null;
		
		public X next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			if (position == null) {
				position = head;
			} else {
				position = position.next;
			}
			return (X) position.data;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}

// I got help from geeksfor geeks + github