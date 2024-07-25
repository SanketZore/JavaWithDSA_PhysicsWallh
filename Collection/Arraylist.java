package Collection;
import java.util.*;

/*
 Stores Data as a objects.
 Dynamically store data.
 Stores Homogenious /Mixed type of data types.
 
// 		Arraylist<Integer> al5=new Arraylist<>();  -- Fixed datatype is possible. -Generic typing.

 
 */


public class Arraylist {

	public static void main(String[] args) {

		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
//		System.out.println(al1);
		
		ArrayList al2=new ArrayList();
		al2.add("Sanket");
		al2.add('j');
		al2.add(25.3);
		al2.add(20);
		System.out.println(al2);
		al2.add(1.02);
//		System.out.println(al2);
		
		ArrayList al3=new ArrayList();
		al3.add(1.01);
		al3.add(1.02);
		al3.add(1.03);
		System.out.println(al3);
		al3.addAll(2,al2);
//		System.out.println(al3);
// we can add one collection to another collection.
		
		al3.add(2,"XXX");
// Added at Specific Index.
		System.out.println(al3);
		System.out.println(al3.size());
// Returns the Size of collection.
		
		ArrayList al4=new ArrayList();
		al4.add(400);
		al4.add(100);
		al4.add(500);
		al4.addAll(al3);
		al4.add(100);
		System.out.println(al4);
// Duplicate values are Allowed.
// Order of insertion is preserved.
//		al4.remove(4);
//		al4.clear();
		System.out.println(al4);
					
	}

}




