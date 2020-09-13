/*
 * enQueue, deQueue,peek and display stack
 */

package queueImplementationUsingLinkedList;

public class Queue {

	Node front, rear;

	/*
	 * Method to add an element to Queue
	 */
	public void enQueue(int data) {

		Node node = new Node(data);
		System.out.println(data + " Inserted in Queue");
		if (front == null) {

			front = node;
			rear = node;
		}

		else {

			rear.next = node;
			rear = node;

		}

	}

	/*
	 * Method to remove an element from Queue
	 */
	public int deQueue() {

		if (front == null) {

			System.out.print("The Queue is empty");
			System.exit(1);

		}
		Node temp = front;
		front = front.next;
		return temp.data;

	}

	/*
	 * Method to return the front element in Queue
	 */
	public int peek() {
		if (front == null) {
			System.out.print("The Queue is empty");
			System.exit(1);

		}

		return front.data;

	}

	/*
	 * Method to display Queue
	 */
	public void show() {

		Node current = front;

		System.out.println("\nPrinting Elements in Queue:");

		while (current != null) {

			System.out.print(current.data + " ");

			current = current.next;
		}
		System.out.println();

	}

}
