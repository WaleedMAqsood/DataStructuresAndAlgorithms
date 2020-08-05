/*
 *  Push, Pop, Peek from Stack
 */
package stackImplementationUsingLinkedList;

import java.util.EmptyStackException;

class Node {

	int data;
	Node next;

}

public class Stack {

	Node top;

	public void push(int data) {

		Node node = new Node();
		node.data = data;
		node.next = top;
		top = node;

	}

	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		} else {

			int data = top.data;

			top = top.next;

			return data;

		}
	}

	public int peek() {

		if (isEmpty()) {
			throw new EmptyStackException();

		} else {
			return top.data;
		}
	}

	public boolean isEmpty() {

		return top == null;
	}

	public void display() {

		Node temp = top;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;

		}
		System.out.println();

	}

}
