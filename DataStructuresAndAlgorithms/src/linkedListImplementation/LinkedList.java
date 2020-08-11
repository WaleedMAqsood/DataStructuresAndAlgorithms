/*
 * Insert, InsertAtStart, InsertAt (Index) ,deleteAt (Index) and display Linked List
 */

package linkedListImplementation;

public class LinkedList {

	Node head;

	/*
	 * Method to insert a new node
	 */
	public void insert(int data) {

		Node node = new Node(data);
		node.next = null;

		if (head == null) {

			head = node;

		}

		else {
			Node n = head;
			while (n.next != null) {

				n = n.next;

			}
			n.next = node;

		}

	}

	/*
	 * Method to insert a new node at the start
	 */
	public void insertAtStart(int data) {

		Node node = new Node(data);
		node.data = data;
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
			node.data = data;
			node.next = null;

			Node n = head;
			for (int i = 0; i < index - 1; i++) {

				n = n.next;

			}
			node.next = n.next;

			n.next = node;
		}
	}

	/*
	 * Method to delete a node at a given position
	 */
	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;

		} else {
			Node n = head;

			for (int i = 0; i < index - 1; i++) {

				n = n.next;

			}
			n.next = n.next.next;

		}
	}

	/*
	 * Method to display all nodes
	 */

	public void show()

	{
		Node current = head;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}

	}

}
