/*
 * Insert Operation in Binary search tree using Recursion 
 */
package binarySearchTreeRecursive;

public class BinarySearchTree {

	Node root;

	/*
	 * This method calls insertKey method
	 */
	public void insert(int key) {

		root = insertKey(root, key);
	}

	/*
	 * Method to insert in a Binary Search Tree
	 */
	Node insertKey(Node root, int key) {

		/*
		 * If tree is empty return a new node
		 */
		if (root == null) {
			root = new Node(key);

			return root;
		}

		else if (key < root.key) {

			root.left = insertKey(root.left, key);
		}

		else if (key > root.key) {

			root.right = insertKey(root.right, key);
		}
		return root;

	}

	/*
	 * This method calls inOrder method
	 */
	public void inOrder() {

		inOrderPrint(root);

	}

	/*
	 * Method to print the nodes in InOrder
	 */
	void inOrderPrint(Node root) {

		if (root == null)
			return;

		// Recursively traverse left child
		inOrderPrint(root.left);

		// Print the key of the node
		System.out.print(root.key + " ");

		// Recursively traverse right child
		inOrderPrint(root.right);
	}

}
