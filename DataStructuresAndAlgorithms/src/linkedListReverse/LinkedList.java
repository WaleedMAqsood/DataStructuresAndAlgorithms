/*
 * Reverse Linked List
 */
package linkedListReverse;

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
	 * Method to reverse a Linked List
	 */
	public void reverseList() {

		Node current = head;
		Node prev = null;
		Node next = null;

		while (current != null) {

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;

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
	}

}
