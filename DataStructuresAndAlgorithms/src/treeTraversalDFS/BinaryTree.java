/* DFS traversal of a tree using recursion
 * 
 * Depth First Traversals: 
 * PreOrder: (Root,Left,Right)
 * InOrder:(Left,Root,Right)
 * PostOrder(Left,Right,Root)
 */

package treeTraversalDFS;

public class BinaryTree {

	/*
	 * Method to print the nodes in PreOrder
	 */
	public static void preOrder(Node root) {

		if (root == null)
			return;

		// Print the key of the node
		System.out.print(root.key + " ");

		// Recursively traverse left child
		preOrder(root.left);

		// Recursively traverse right child
		preOrder(root.right);

	}

	/*
	 * Method to print the nodes in InOrder
	 */
	public static void inOrder(Node root) {

		if (root == null)
			return;

		// Recursively traverse left child
		inOrder(root.left);

		// Print the key of the node
		System.out.print(root.key + " ");

		// Recursively traverse right child
		inOrder(root.right);
	}

	/*
	 * Method to print the nodes in PostOrder
	 */
	public static void postOrder(Node root) {

		if (root == null)
			return;

		// Recursively traverse left child
		postOrder(root.left);

		// Recursively traverse right child
		postOrder(root.right);

		// Print the key of the node
		System.out.print(root.key + " ");

	}

}
