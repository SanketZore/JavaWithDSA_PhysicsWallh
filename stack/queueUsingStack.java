package stack;
import java.util.*;


// time complexity of enQueue: O(1)
// time complexity of deQueue: O(n)
// space complexity: O(n)



public class queueUsingStack {
	
	static Stack<Integer> stack1=new Stack<>();
	static Stack<Integer> stack2=new Stack<>();
	
	//insertion of the data in the queue.
	// time complexity: O(1)
	static void enQueue(int data) {
		stack1.push(data);
	}
	
	static int deQueue() {
		int ele;
		if(stack1.empty() && stack2.empty()) {
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		// push all the element from stack1 to stack2.
		// time complexity: O(n)
		if(stack2.empty()) {
			while(!stack1.empty()) {  // negation is used.
				ele=stack1.pop();
				stack2.push(ele);
			}
		}
		
		//pop the top element from stack2.
		// FIFO -first in first out.
		ele=stack2.pop();
		return ele;
	}
	
	public static void main(String[] args) {

		queueUsingStack q=new queueUsingStack();
		
		// function calling for insertion in the queue.
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		
		// function calling for deletion of element in the queue.

		System.out.println("Deleted Element: "+q.deQueue());
		System.out.println("Deleted Element: "+q.deQueue());
		System.out.println("Deleted Element: "+q.deQueue());
		System.out.println("Deleted Element: "+q.deQueue());
		System.out.println("Deleted Element: "+q.deQueue());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
