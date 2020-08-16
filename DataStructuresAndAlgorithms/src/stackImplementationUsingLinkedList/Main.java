package stackImplementationUsingLinkedList;

public class Main {
	public static void main(String[] args) {

		Stack st = new Stack();

		st.push(5);
		st.push(9);
		st.push(3);
		st.push(8);
		st.push(3);
		st.push(8);

		// display stack
		System.out.println("Printing the stack");
		st.display();

		System.out.println("\nPopped from stack " + st.pop());
		System.out.println("Printing the stack");
		st.display();

		System.out.println("\nTop element is " + st.peek());

	}
}
