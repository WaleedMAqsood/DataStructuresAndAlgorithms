/*
 * Find the Middle Element in LinkedList
 */
package linkedListMiddleElement;

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

		} else {
			Node current = head;
			while (current.next != null) {

				current = current.next;

			}
			current.next = node;

		}
	}

	/*
	 * Method to find the middle element of the Linked List
	 */
	public void linkedListMiddle() {

		Node slowPointer = head;
		Node fastPointer = head;

		while (fastPointer != null && fastPointer.next != null) {

			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;

		}

		System.out.print("\nThe middle element is " + slowPointer.data);

	}

	/*
	 * Method to display all nodes
	 */
	public void show() {
		Node current = head;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Inserting new node at the end
		list.insert(50);
		list.insert(60);
		list.insert(65);
		list.insert(70);
		list.insert(75);
		list.insert(80);
		list.insert(85);

		System.out.println("Printing the nodes");
		list.show();
		// Method to Print the middle element
		list.linkedListMiddle();

	}

}
