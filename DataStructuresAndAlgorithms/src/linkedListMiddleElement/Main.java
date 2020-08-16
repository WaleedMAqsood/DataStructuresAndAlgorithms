package linkedListMiddleElement;

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

		System.out.println("Printing the nodes in InOrder traveral");
		list.show();
		// Method to Print the middle element
		list.linkedListMiddle();

	}

}
