package collection.application;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class vector_and_stack {

	public static void main(String[] args) {
			
		Stack<String > stack= new Stack<String>();
		stack.add("add");
		stack.add("sub");
		stack.add("multi");
		System.out.println(stack.peek());   // will give us the top element  in the stack
		System.out.println(stack.pop());;    // will delete the top element that was added into the stack
		stack.push("%");    // will add new element at the top of the stack. 
		System.out.println(stack.peek());
		System.out.println(stack);
		
		Vector<String> vector=new Vector<String>(stack);  // adding stack to vector using constructor approach
		System.out.println("default capacity of a vector: "+vector.capacity());
		vector.add("reo");
		vector.add("rio");
		vector.add("jio");
		vector.add("leo");
		vector.add("dino");
		for(String a: vector) {
			System.out.println("in : "+a);
		}
		Collections.sort(vector);
		
		vector.addAll(stack); // adding again the stack using addAll() method.
		
		System.out.println(vector);
	}

}
