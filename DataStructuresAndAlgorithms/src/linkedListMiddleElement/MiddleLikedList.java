/*
 * Find the Middle Element in Linked List
 */
package linkedListMiddleElement;

class Node {

	Node next;
	int data;

}

public class MiddleLikedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {

			head = node;

		} else {
			Node n = head;
			while (n.next != null) {

				n = n.next;

			}
			n.next = node;

		}
	}

	public void linkedListMiddle() {

		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer != null && fastPointer.next != null) {

			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;

		}

		System.out.print("The middle element is " + slowPointer.data);

	}

	public void show() {
		Node current = head;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}
	}

	public static void main(String[] args) {
		MiddleLikedList list = new MiddleLikedList();

		// Inserting a new node at the end
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		// Displaying LinkedList
		list.show();

		// Method to Print the middle element
		list.linkedListMiddle();

	}

}
