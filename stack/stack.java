package stack;
import java.util.*;


/*
 push(3) pop() peek() search(4) empty()
 */
public class stack {

	public static void main(String[] args) {

		Stack<Integer> stack1=new Stack<>();
		
//		push the element inside the stack
		stack1.push(2);
		stack1.push(4);
		stack1.push(6);
		stack1.push(9);
		
		System.out.println(stack1);
		
//		print the topmost element of stack.
		System.out.println("The topmost element of Stack: "+stack1.peek());
		
//		Pop the element outside the stack
		stack1.pop();
		stack1.pop();
		stack1.pop();
		System.out.println(stack1);
		System.out.println("The top element of Stack after pop operation: "+stack1.peek());
	
//		Search an element in stack.
		// Seaching starts from top.
	System.out.println("Element 6 is present at the position : "+stack1.search(6));
	
//	Whether the stack is empty or not.
	//	empty function returns boolean value: true or false.
	System.out.println("Is stack empty or not : "+stack1.empty());

	
	}

}
