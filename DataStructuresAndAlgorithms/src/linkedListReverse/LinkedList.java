/*
 * Reverse a Linked List
 */
package linkedListReverse;

class Node {

	Node next;
	int data;

}

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

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Inserting a new node at the end
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		System.out.println("Displaying before Reversing Linked list");
		list.show();

		// Reversing a Linked list
		list.reverseList();

		System.out.println("Displaying Reverse Linked list");
		list.show();

	}

}
