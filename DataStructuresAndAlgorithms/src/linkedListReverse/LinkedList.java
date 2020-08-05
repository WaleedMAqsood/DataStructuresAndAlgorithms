/*
 * Reverse a Linked List
 */
package linkedListReverse;

public class LinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
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

	public void show()

	{
		Node current = head;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}
	}

}
