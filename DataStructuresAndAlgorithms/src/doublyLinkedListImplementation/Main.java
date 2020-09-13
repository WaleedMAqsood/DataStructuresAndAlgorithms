package doublyLinkedListImplementation;

public class Main {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		// Inserting new node at the end
		list.insert(50);
		list.insert(60);
		list.insert(65);
		list.insert(70);
		list.insert(75);

		System.out.println("Printing the Nodes");
		list.show();

		System.out.println("\n\nDeleting The node at index 3");
		list.deleteAt(3);

		System.out.println("\nPrinting the Nodes after deletion");
		list.show();

		System.out.println("\n\nInserting The node at index 3");
		list.insertAt(3, 44);

		System.out.println("\n\nPrinting the Nodes after deletion");
		list.show();

	}

}
