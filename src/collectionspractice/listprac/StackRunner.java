package collectionspractice.listprac;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {

		Stack st = new Stack();
		st.push("apple");
		st.push("banana");
		st.push("carrot");
		
		
		System.out.println(st);
		
		System.out.println(st.peek()); // peek() retun top most element + wont delete
		
		System.out.println(st);
		System.out.println("***** ");
		System.out.println(st.pop()); // pop() retun top most element + delete
		
		System.out.println(st);
		
		System.out.println(st.peek());
		
		System.out.println(st);
	}
}
