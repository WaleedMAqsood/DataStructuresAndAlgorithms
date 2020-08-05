/*
 *  Push, Pop, Peek, expand and display Stack
 */
package stackImplementationUsingArray;

public class Stack {

	int capacity = 4;

	int arr[] = new int[capacity];

	int top = 0;

	public void push(int data) {

		if (size() == capacity) {

			expand();
		}

		arr[top++] = data;
		System.out.println(data + " Pushed into Stack ");

	}

	private void expand() {

		int length = size();

		// A new array newArray is created which has double the size of the original
		// array arr.
		int newArray[] = new int[capacity * 2];

		// Copy the contents of the original array arr to the new array newArray
		System.arraycopy(arr, 0, newArray, 0, length);

		// arr reference is now pointing to the same location as newArray points too
		arr = newArray;

		capacity = capacity * 2;

		/*
		 * Doing the same thing as above instead using a loop int length = size();
		 * intnewArray[] = new int[capacity * 2]; for (int i = 0; i < length; i++) {
		 * newArray[i] = arr[i]; } arr = newArray; capacity = capacity * 2;
		 */

	}

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

	public boolean isEmpty() {

		return top == 0;
	}

	public int size() {

		return top;
	}

	public void show() {
		for (int n : arr) {
			System.out.print(n + " ");

		}

		System.out.println();

	}

}
