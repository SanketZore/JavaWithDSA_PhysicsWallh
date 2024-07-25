package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAndSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Deque:
		 	Offers both Stack and Queue Functionality.
		 
		 Sliding Window:
		 	
		 
		 */
		
		Deque<Integer> deque=new ArrayDeque<>();
		deque.addFirst(5);
		deque.addFirst(7);
		deque.addFirst(9);
		deque.addLast(2);
		deque.addLast(6);
		deque.addLast(4);
		
		System.out.println(deque);		
		deque.removeFirst();
		deque.removeLast();
		System.out.println(deque);
	
	
	}

}
