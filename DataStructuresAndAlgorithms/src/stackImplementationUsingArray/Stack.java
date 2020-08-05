/*
 *  Push, Pop, Peek from Stack
 */
package stackImplementationUsingArray;

public class Stack {

	int capacity = 4;

	int stack[] = new int[capacity];

	int top = 0;

	public void push(int data) {

		if (size() == capacity) {

			expand();
		}

		stack[top++] = data;
		System.out.println(data + " Pushed into Stack ");

	}

	private void expand() {

		int length = size();
		int newStack[] = new int[capacity * 2];

		System.arraycopy(stack, 0, newStack, 0, length);

		stack = newStack;

		capacity = capacity * 2;

	}

	public int pop() {

		int data = 0;

		if (isEmpty()) {

			System.out.println("Stack is empty");
			System.out.println();

		}

		else {

			data = stack[--top];
			stack[top] = 0;

		}
		return data;

	}

	public int peek() {

		int data = 0;

		if (isEmpty()) {
			System.out.println("Stack is empty");

		}

		else {
			data = stack[top - 1];
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
		for (int n : stack) {
			System.out.print(n + " ");

		}

		System.out.println();

	}

	public static void main(String[] args) {

		Stack st = new Stack();

		st.push(33);
		st.push(43);
		st.push(53);
		st.push(12);
		st.push(30);

		// Method to print Size of the stack
		System.out.println();
		System.out.println("The size of the stack is " + st.size());
		System.out.println();
		System.out.println(st.pop() + " Popped from stack");
		System.out.println();
		System.out.println("Top element is " + st.peek());
		System.out.println();
		System.out.println("Printing the Stack");
		// Print Stack
		st.show();

	}

}
