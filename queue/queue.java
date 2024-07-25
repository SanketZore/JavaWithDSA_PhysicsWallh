package queue;
import java.util.*;
public class queue {

	public static void main(String[] args) {

		/*
		 Abstract Data Type(Frequent Used DataType)
		 	-Enqueue -insert  add()
		 	-Dequeue -deletion  remove()
		 	topmost element -peek()
		 	check current size of queue -size()
		 */
		
		Queue<Integer> q=new LinkedList<>();
		
		// to add the data inside the queue -Enqueue
		
		for(int i=0;i<2;i++) {
			q.add(i);
		}
		System.out.println("Queue data looks like: "+q);
		
		
		// to display top element of the queue.
		System.out.println("The top Element in the queue is before deletion "+q.peek());
				
		
		// to remove the data from the queue -Dequeue
		
		q.remove();
		q.remove();
		
		// to display top element of the queue.
		System.out.println("The top Element in the queue is after deletion "+q.peek());
		
		// check the Size of the Queue
		System.out.println("The current size of queue "+q.size());
		
	}

}
