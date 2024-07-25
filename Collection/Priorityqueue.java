package Collection;
import java.util.*;
public class Priorityqueue {

	public static void main(String[] args) {

		/*
		 - PriorityQueue implements Queue interface.
		 - Index based Accessing is not allowed.
		 - no middle insertion.
		 - Order of Insertion is not preserved.
		 - It follows min-heap dataStructure.
		 - It allows Integers only
		 - No null Values excepted
		 
		 Follows Binary and min-heap Data Structure.
		 
		 		
		 		100				50						0Level
		 	50				100		150 				1Level
		 
		 
		 50					50					25				0Level
	100		150			25		150			50		150			1Level
25					100					100		75				2Level


				25								25					0Level
		50				150				50				125			1Level
	100		75		125  			100		75		150		175		2Level
		 
		 */
		
		PriorityQueue pq=new PriorityQueue();
//		pq.add(100);
//		pq.add(50);
//		pq.add(150);
//		pq.add(25);
//		pq.add(75);
//		pq.add(125);
//		pq.add(175);
		
		
		pq.add(100);
		pq.add(200);
		pq.add(150);
		pq.add(300);
		pq.add(300);
		pq.add(175);
		pq.add(125);
		System.out.println(pq);
		
		
		
		
		
	}

}
