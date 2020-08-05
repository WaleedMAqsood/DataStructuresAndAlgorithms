package linkedList;

public class Main {

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
