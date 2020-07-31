package linkedListMiddleElement;

public class LinkedList {

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

	public void show()

	{
		Node current = head;

		while (current != null) {

			System.out.println(current.data);
			current = current.next;

		}

		{

		}

	}

}
