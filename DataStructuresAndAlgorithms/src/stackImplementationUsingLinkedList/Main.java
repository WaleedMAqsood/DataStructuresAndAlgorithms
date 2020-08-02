package stackImplementationUsingLinkedList;

public class Main {
	public static void main(String[] args) {

		LinkedListStack st = new LinkedListStack();

		st.push(5);
		st.push(9);
		st.push(3);
		st.push(8);
		st.push(3);
		st.push(8);

		// display stack
		st.display();
		System.out.println("Popped from stack " + st.pop());

		// display stack
		st.display();

		System.out.println("Top element is " + st.peek());

		System.out.println();

	}

}
