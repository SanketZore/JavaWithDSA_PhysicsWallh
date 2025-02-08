package Collection;
import java.util.*;
public class IteratorListIterator {

	public static void main(String[] args) {

		/*
		 
		 PriorityQueue, ArrayDeque, TreeSet Index based Accessing is not allowed.
		 
		 Iterator and ListIterator(Cursor):
		 	ListIterator facility is only available in ArrayList and LinkedList.
		 */
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(100);
		System.out.println(a1);
		
//		for(int i=0;i<a1.size();i++){
////			Object obj=a1.get(i);
//			System.out.println(a1.get(i));
////			System.out.println(obj);
//		}
		
//		for each
		
//		for(Object obj:a1) {
//			System.out.println(obj);
//		}
		
// ----------------Straight Iteration--------------------
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
//			Integer i=(Integer)itr.next(); // Downcast from Iterator to Integer.
			System.out.println(itr.next());
			}
		
		System.out.println("");
		
// ----------------Reverse Iteration--------------------
		// Previous method is only in ListIterator, not in Iterator.
		
		ListIterator litr=a1.listIterator(a1.size());
		while(litr.hasPrevious()) {
//			Integer i=(Integer)litr.next(); // Downcast from Iterator to Integer.
			System.out.println(litr.previous());
//			System.out.println(i);
			}
		
		
	}

}
