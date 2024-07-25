package Collection;
import java.util.*;
public class Treeset {
	
	/*
	     		TreeSet (Binary Search Tree)
	 TreeSet implements set Interface.
	 Searching Becomes Fast.
	 Order of insertion is not preserved.
	 TreeSet gives output in Sorted Order.
	 TreeSet does not allow Duplicate Values.
	 TreeSet Follows BinaryTree Data Structure.
	 TreeSet follows InOrder Traversal.
	 Tree becomes Balanced Binary Search Tree.
	 
	 InOrder = Lelf Value Right
	 
	 	       100					
	 50    		   		150
 25      75	  	    125	     175
	 
	 
	 
	 
	 */

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(125);   // duplicate not allowed
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.higher(50));
		System.out.println(ts.lower(50));
		
		System.out.println(ts.ceiling(76)); 
		// if Value not present then it Gives Closest Upper or Lower Value.
		// if value Present then it Gives the same value as of Given.
		System.out.println(ts.floor(76));
		
		System.out.println(ts.ceiling(120));
		System.out.println(ts.floor(120));
		
		
		
	}

}
