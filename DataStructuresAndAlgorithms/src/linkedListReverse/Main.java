package linkedListReverse;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// Inserting in Linked list
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
