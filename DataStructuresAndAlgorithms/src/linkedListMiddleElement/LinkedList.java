/*
 * Find the Middle Element in LinkedList
 */
package linkedListMiddleElement;

public class LinkedList {

	Node head;

	/*
	 * Method to insert a new node
	 */
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

		System.out.print("The middle element is " + slowPointer.data);

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

}
