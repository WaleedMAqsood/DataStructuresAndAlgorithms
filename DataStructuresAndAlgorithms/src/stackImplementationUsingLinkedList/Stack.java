/*
 *  Push, Pop, Peek and display Stack
 */
package stackImplementationUsingLinkedList;

import java.util.EmptyStackException;

public class Stack {

	Node top;

	/*
	 * Method to Add an element to the stack
	 */
	public void push(int data) {

		Node node = new Node(data);
		node.next = top;
		top = node;

	}

	/*
	 * Method to remove the top value of the stack and return the value which was
	 * removed
	 */
	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();
		} else {

			int data = top.data;

			top = top.next;

			return data;

		}
	}

	/*
	 * Method to return the element at the top of the stack
	 */
	public int peek() {

		if (isEmpty()) {
			throw new EmptyStackException();

		} else {
			return top.data;
		}
	}

	/*
	 * Returns True if stack is empty
	 */
	public boolean isEmpty() {

		return top == null;
	}

	/*
	 * Method to display all the elements in stack
	 */
	public void display() {

		Node temp = top;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;

		}
		System.out.println();

	}

}
