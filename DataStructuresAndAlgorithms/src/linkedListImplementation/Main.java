package linkedListImplementation;

public class Main {

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
		list.insert(90);

		System.out.println("Printing the nodes in InOrder traveral");
		list.show();

		System.out.print("\nInserting 100 at the start");
		list.insertAtStart(100);
		System.out.println("\nPrinting the node in InOrder traveral");
		list.show();

		System.out.print("\nInserting 99 at index 2");
		list.insertAt(2, 99);
		System.out.println("\nPrinting the node in InOrder traveral");
		list.show();

		System.out.print("\nDeleting The node at index 2");
		list.deleteAt(0);
		System.out.println("\nPrinting the nodes in InOrder traveral ");
		list.show();

	}
}
