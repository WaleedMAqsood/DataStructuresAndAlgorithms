package stackImplementationUsingArray;

public class Main {
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
