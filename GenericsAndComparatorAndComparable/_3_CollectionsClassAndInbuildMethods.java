package GenericsAndComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.jmu11.staticMethodandNonStatic;

import Collection.Arraylist;

public class _3_CollectionsClassAndInbuildMethods {

	public static void main (String[] args) {
		
		/*
		 
		 -Collections include Static methods.
		 -we can use this methods only with the name of 'Collections' name.
		 
		 */
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(200);
		al.add(75);
		al.add(125);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("sam");
		a2.add("Aam");
		a2.add("Ram");
		a2.add("Mam");
		a2.add("Cam");
		Collections.sort(a2);
		System.out.println(a2);
		
		ArrayList al3=new ArrayList();
		al3.add(50);
		al3.add(100);
		al3.add(150);
		al3.add(50);
		al3.add(200);
		al3.add(225);
		System.out.println(al3);  // gives iindex value as output.
		int index=Collections.binarySearch(al3,50);  //Binarysearch is appliable only and only if the data is in sorted order.
		System.out.println(index);
		
		Collections.rotate(al3, 3);  // rotate index from 3rd index.
		System.out.println(al3);
		
		Collections.shuffle(al3);  // shuffle randomly elements of list.
		System.out.println(al3);
		
		System.out.println(Collections.frequency(al3,50)); //counts the no.of occurance of elements.
	}
}
