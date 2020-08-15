/*
 * Insert and delete Operation in Binary search tree using Recursion 
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

		// If the tree is empty return a new node
		if (root == null) {

			return new Node(key);
		}
		// if the key is less than the root then recur left subtree
		if (key < root.key) {

			root.left = insertKey(root.left, key);
		}
		// if the key is greater than root then recur right subtree

		else if (key > root.key) {

			root.right = insertKey(root.right, key);
		}
		return root;

	}

	/*
	 * This method calls deleteKey method
	 * 
	 */
	public void delete(int key) {

		root = deleteKey(root, key);
	}

	/*
	 * Method to perform delete operator in BST
	 */

	public Node deleteKey(Node root, int key) {

		// if the tree is empty
		if (root == null)
			return null;

		// if the key is less than the root then recur left subtree
		if (key < root.key) {
			root.left = deleteKey(root.left, key);
		}

		// if the key is greater than root then recur right subtree
		else if (key > root.key) {
			root.right = deleteKey(root.right, key);
		}

		// If the key is same as the root get ready to delete the key
		else {

			// Case 1: Node has no children
			if (root.left == null && root.right == null) {
				return null;
			}

			// Case 2: If Node has only one child
			else if (root.left == null) {

				return root.right;

			} else if (root.right == null) {

				return root.left;

			}

			// Case 3: if Node has two children.Can just be an else
			else if (root.left != null && root.right != null) {

				// find inOrder successor node and copy the content of the successor node to
				// the deletion node

				root.key = minNodeRight(root.right);

				// delete the inOrder successor
				root.right = deleteKey(root.right, root.key);

			}

		}

		return root;

	}

	/*
	 * Method to find the inOrder successor
	 */
	int minNodeRight(Node root) {

		int minNodeRight = root.key;

		while (root.left != null) {

			minNodeRight = root.left.key;

			root = root.left;

		}

		return minNodeRight;

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
