package Collection;
import java.util.*;
public class Arraydeque {

	public static void main(String[] args) {

		/*
		 ArrayDeque= follows Double Ended Queue.
		 Insertion of data is possible from front and Rear Side of Queue.
		 All type of Data can be stored.
		 */
		
		ArrayDeque ad1=new ArrayDeque();
		ad1.add(100);
		ad1.add(200);
		ad1.add(300);
		ad1.add(300);
		System.out.println(ad1);
		ad1.addFirst(10);
		ad1.addLast(500);
		ad1.add("Sanket");
		System.out.println(ad1);
		System.out.println(ad1.peekFirst());
		System.out.println(ad1.peekLast());
		ad1.offer(66);  // Insert Element at Last.
		ad1.offerLast(77);	// Insert Element at Last.
		ad1.offerFirst(55);	// Insert Element at First.
		System.out.println(ad1);

		
		
	}

}
