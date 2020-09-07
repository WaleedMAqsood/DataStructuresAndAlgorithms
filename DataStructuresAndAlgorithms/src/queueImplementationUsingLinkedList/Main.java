package queueImplementationUsingLinkedList;

public class Main {

	public static void main(String[] args) {

		Queue q = new Queue();

		// Inserting elements in Queue
		q.enQueue(32);
		q.enQueue(33);
		q.enQueue(65);
		q.enQueue(32);
		// Printing Queue
		q.show();

		// Printing the front element in Queue
		System.out.println("\nThe front element in queue is:" + q.peek());

		// Deleting an Element in Queue
		System.out.println("\nDeleting the front element:" + q.deQueue());
		// Printing QUeue
		q.show();

	}

}
