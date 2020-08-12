package binarySearchTreeRecursive;

public class Main {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(5);
		tree.insert(15);
		tree.insert(20);
		tree.insert(25);
		tree.insert(30);

		System.out.println("Print the nodes in Inorder traversal");
		tree.inOrder();

	}

}
