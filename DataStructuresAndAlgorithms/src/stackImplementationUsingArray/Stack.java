package stackImplementationUsingArray;

public class Stack {

	static final int CAPACITY = 5;

	int stack[] = new int[CAPACITY];

	int top = 0;

	public void push(int data) {

		if (top == CAPACITY) {

			System.out.print("Stack Overflow");

		}

		else {

			stack[top++] = data;
			System.out.println(data + " Pushed into Stack ");

		}
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
			System.out.println(n);

		}

	}

}
