package listif;

import java.util.Stack;



public class Stack_1 {

	public static void main(String[] args) {
		
        /**
         * Stack is used in the Java for the  LIFO order.
         */
		
		
		
		/**
		 *  It extends class {@code Vector} with five
 * operations that allow a vector to be treated as a stack.
		 */
		
		Stack<Integer> stack=new Stack<Integer>();
		
		
		stack.push(null);
		stack.push(34);
		stack.push(11);
		
		System.out.println(stack.search(11));
		
		System.out.println(stack);
		stack.pop();
		stack.pop();
		System.out.println(stack.pop());
		
	
	
		
		
	}
}
