/*
 * Insert, InsertAtStart, InsertAt (Index) ,deleteAt (Index) and display Linked List
 */

package doublyLinkedListImplementation;

public class DoublyLinkedList {

	Node head;

	/*
	 * Method to insert a new node at the end
	 */
	public void insert(int data) {

		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {

			Node current = head;

			while (current.next != null) {

				current = current.next;

			}

			current.next = node;
			node.prev = current;

		}
	}

	/*
	 * Method to insert a new node at the start
	 */
	public void insertAtStart(int data) {

		Node node = new Node(data);
		head.prev = node;
		node.next = head;
		head = node;

	}

	/*
	 * Method to insert a new node at a given position
	 */
	public void insertAt(int index, int data) {

		// if node to be deleted is head
		if (index == 0) {

			insertAtStart(data);

		}

		else {
			Node node = new Node(data);
			node.next = null;

			Node current = head;

			for (int i = 0; i < index - 1; i++) {

				current = current.next;

			}

			if (current.next != null) {
				node.next = current.next;
				current.next.prev = node;

			}

			current.next = node;

			node.prev = current;

		}
	}

	/*
	 * Method to delete a node at a given position
	 */
	public void deleteAt(int index) {

		Node current = head;

		// if head needs to be deleted
		if (index == 0) {

			head = head.next;
			head.prev = null;

		}

		else {
			for (int i = 0; i < index; i++) {
				current = current.next;

			}

			if (current.next != null) {
				current.next.prev = current.prev;
			}

			if (current.prev != null) {

				current.prev.next = current.next;
			}
		}

	}

	/*
	 * Method to display all nodes
	 */
	public void show() {

		Node current = head;
		Node last = null;

		while (current != null) {

			System.out.print(current.data + " ");
			last = current;

			current = current.next;

		}

		System.out.println("\nPrinting the nodes in reverse order");

		while (last != null) {

			System.out.print(last.data + " ");
			last = last.prev;

		}

	}

}
