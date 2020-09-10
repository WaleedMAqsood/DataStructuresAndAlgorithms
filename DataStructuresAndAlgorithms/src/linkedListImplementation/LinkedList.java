/*
 * Insert, InsertAtStart, InsertAt (Index) ,deleteAt (Index) and display Linked List
 */

package linkedListImplementation;

public class LinkedList {

	Node head;

	/*
	 * Method to insert a new node at the end
	 */
	public void insert(int data) {

		Node node = new Node(data);
		node.next = null;

		if (head == null) {

			head = node;

		}

		else {
			Node current = head;
			while (current.next != null) {

				current = current.next;

			}
			current.next = node;

		}

	}

	/*
	 * Method to insert a new node at the start
	 */
	public void insertAtStart(int data) {

		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	/*
	 * Method to insert a new node at a given position
	 */
	public void insertAt(int index, int data) {

		if (index == 0) {

			insertAtStart(data);

		} else {
			Node node = new Node(data);
			node.next = null;

			Node current = head;
			for (int i = 0; i < index - 1; i++) {

				current = current.next;

			}
			node.next = current.next;

			current.next = node;
		}
	}

	/*
	 * Method to delete a node at a given position
	 */
	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;

		} else {
			Node current = head;

			for (int i = 0; i < index - 1; i++) {

				current = current.next;

			}
			current.next = current.next.next;

		}
	}

	/*
	 * Method to display all nodes
	 */

	public void show()

	{
		Node current = head;

		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;

		}
		System.out.println();

	}

}
