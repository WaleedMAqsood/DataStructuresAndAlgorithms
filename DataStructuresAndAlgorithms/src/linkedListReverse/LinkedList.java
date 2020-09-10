/*
 * Reverse Linked List
 */
package linkedListReverse;

class Node {

	Node next;
	int data;

	Node(int value) {
		data = value;
		next = null;

	}

}

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

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Inserting new node at the end
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		System.out.println("Displaying before Reversing Linked list");
		list.show();

		// Reversing a Linked list
		list.reverseList();

		System.out.println("\nDisplaying Reverse Linked list");
		list.show();

	}

}
