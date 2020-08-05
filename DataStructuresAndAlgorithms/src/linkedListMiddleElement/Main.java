package linkedListMiddleElement;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Inserting in Linked list
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
