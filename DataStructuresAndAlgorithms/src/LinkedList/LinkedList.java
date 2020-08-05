/*
 * Insert, InsertAtStart, InsertAt and delete from Linked List
 */

package LinkedList;

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

	public void insertAtStart(int data) {

		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;

	}

	public void insertAt(int index, int data) {

		if (index == 0) {

			insertAtStart(data);

		} else {
			Node node = new Node();
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

		// Inserting node at the start
		list.insertAtStart(0);
		// inserting node at at given index
		list.insertAt(2, 100);
		// deleting node at at given index
		list.deleteAt(0);

		// Printing Linked List
		list.show();

	}

}
