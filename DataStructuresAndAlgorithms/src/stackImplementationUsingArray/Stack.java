/*
 *  Push, Pop, Peek, expand and display Stack
 */
package stackImplementationUsingArray;

public class Stack {

	int capacity = 4;

	int arr[] = new int[capacity];

	int top = 0;

	/*
	 * Method to add an element to the stack
	 */
	public void push(int data) {

		// If array is full increase capacity
		if (size() == capacity) {

			expand();
		}

		arr[top++] = data;
		System.out.println(data + " Pushed into Stack ");

	}

	private void expand() {

		int length = size();

		int newArray[] = new int[capacity * 2];

		System.arraycopy(arr, 0, newArray, 0, length);

		arr = newArray;

		capacity = capacity * 2;

		/*
		 * Doing the same thing as above instead using a loop int length = size();
		 * intnewArray[] = new int[capacity * 2]; for (int i = 0; i < length; i++) {
		 * newArray[i] = arr[i]; } arr = newArray; capacity = capacity * 2;
		 */

	}

	/*
	 * Method to remove the top value of the stack and return the value which was
	 * removed
	 */

	public int pop() {

		int data = 0;

		if (isEmpty()) {

			System.out.println("Stack is empty");
			System.out.println();

		}

		else {

			data = arr[--top];
			arr[top] = 0;

		}
		return data;

	}

	/*
	 * Method to return the element at the top of the stack
	 */
	public int peek() {

		int data = 0;

		if (isEmpty()) {
			System.out.println("Stack is empty");

		}

		else {
			data = arr[top - 1];
		}

		return data;

	}

	/*
	 * Returns True if stack is empty
	 */
	public boolean isEmpty() {

		return top == 0;
	}

	public int size() {

		return top;
	}

	/*
	 * Method to Display elements in stack
	 */
	public void show() {
		for (int n : arr) {
			System.out.print(n + " ");

		}

		System.out.println();

	}

}
