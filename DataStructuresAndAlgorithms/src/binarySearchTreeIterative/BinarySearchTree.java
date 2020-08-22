/*
 * Insert Operation in Binary search tree (Iterative)
 */

package binarySearchTreeIterative;

import java.util.Stack;

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

		// If the tree is empty return a new node
		if (root == null) {

			return new Node(key);
		}

		Node parent = null;
		Node current = root;

		// Traverse the tree
		while (current != null) {

			// Pointer to the parent node of the current node
			parent = current;

			// if key is less than the current node go to the left subtree
			if (key < current.key)
				current = current.left;
			// if key is greater then the current node go to the right subtree
			else if (key > current.key)
				current = current.right;

		}

		// if key is less than the parent node
		if (key < parent.key)
			parent.left = new Node(key);
		// if key is greater then the parent node
		if (key > parent.key)
			parent.right = new Node(key);

		return root;

	}

	/*
	 * This method calls inOrder method
	 */
	void inOrder() {

		inOrderPrint(root);

	}

	/*
	 * Method to print the nodes in InOrder (Iterative)
	 */
	void inOrderPrint(Node root) {

		Node current = root;
		Stack<Node> st = new Stack<Node>();

		// While current is not null or Stack is not empty keep the loop going
		// Traverse to the left most Node
		while (current != null || !st.empty()) {

			if (current != null) {

				st.push(current);
				current = current.left;

			}

			else {

				// if the current node is null, pop element from the stack
				current = st.pop();
				System.out.print(current.key + " ");
				current = current.right;

			}

		}

	}

}
