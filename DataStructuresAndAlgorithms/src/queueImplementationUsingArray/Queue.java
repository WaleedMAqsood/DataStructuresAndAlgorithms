/*
 * enQueue, deQueue,peek, isEmpty isFull and display stack
 */

package queueImplementationUsingArray;

public class Queue {

	int capacity = 5;
	int arr[] = new int[capacity];
	int rear;
	int front;
	int size;

	/*
	 * Method to add an element to Queue
	 */
	public void enQueue(int data) {

		if (isFull()) {
			System.out.print("Queue is full");
			System.exit(1);
		}
		System.out.println(data + " Inserted in Queue");
		arr[rear] = data;
		rear = (rear + 1) % 5;
		size++;
	}

	/*
	 * Method to remove an element from Queue
	 */
	public int deQueue() {

		if (isEmpty()) {
			System.out.print("Queue is Empty");
			System.exit(1);

		}

		int data = arr[front];
		front = (front + 1) % 5;
		size--;
		return data;

	}

	/*
	 * Method to return the size of Queue
	 */
	public int size() {
		return size;
	}

	/*
	 * Method to check if the Queue is full or not
	 */
	public boolean isFull() {

		return size() == capacity;

	}

	/*
	 * Method to check if Queue is empty or not
	 */
	public Boolean isEmpty() {

		return size() == 0;

	}

	/*
	 * Method to return the front element in Queue
	 */
	public int peek() {

		if (isEmpty()) {
			System.out.print("Queue is Empty");
			System.exit(1);

		}
		return arr[front];

	}

	/*
	 * Method to display Queue
	 */
	public void show() {

		if (isEmpty()) {
			System.out.print("Queue is Empty");
			System.exit(1);
		}

		System.out.println("\nPrinting Elements in the Queue:");
		for (int i = 0; i < size; i++) {

			System.out.print(arr[front + i] + " ");

		}
		System.out.println();

	}
}
