package binarySearchTreeRecursive;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(25);
		tree.insert(60);
		tree.insert(20);
		tree.insert(52);
		tree.insert(30);
		tree.insert(55);
		tree.insert(80);
		tree.insert(30);

		System.out.println("Printing the nodes in Inorder traversal");
		tree.inOrder();

		System.out.println("\nDeleting 30");
		tree.delete(30);
		System.out.println("Printing the nodes after deleting");
		tree.inOrder();

		System.out.println("\nDeleting 20");
		tree.delete(20);
		System.out.println("Printing the nodes after deleting");
		tree.inOrder();

		System.out.println("\nDeleting 60");
		tree.delete(60);
		System.out.println("Printing the nodes after deleting");
		tree.inOrder();

		System.out.println("\nDeleting 50");
		tree.delete(50);
		System.out.println("Printing the nodes after deleting");
		tree.inOrder();

	}

}
