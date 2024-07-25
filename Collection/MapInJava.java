package Collection;

import java.util.*;
public class MapInJava {

	public static void main(String[] args) {

		/*
		 MAP=
		 Storing Information in the form of Key and Value pair.
		 Map is Interface.
		 A map is useful if you have to search , update or delete element on the basis of a key.
		 Map Does not extends or implements any class or interface.
		 
		 Key Must be UNIQUE.
		 Key can be of any Data-type.
		 
		 
		 key 	-	value
		 "Virat"	0.1			--> Key value pair Known as Entry
		 "sam"		0.5			--> Entry 
		 
		 
		 Map Hierarchy
		 
		 							Interface Map				
		 				   /			  |					\
		 				  /				  |				interface SortedMap
		 				 / <-implements-> |						|
		 				/				  |						|
		 			Hashtable		   HashMap   		interface NavigableMap
		 								  |						|	
		 								  |						| <-implements
		 							LinkedHashMap			 TreeMap		
		 
		 
		 
		 */
		
//		HashMap hm=new HashMap();
//		HashTable ht=new HashTable();
//		LinkedHashMap lhm=new LinkedHashMap();
//		TreeMap tm=new TreeMap();
		
		
//		-----------------HashMap----------------------
		
	/*	HashMap hm1=new HashMap();
		hm1.put(null,null);     // null can be assigned as a Key or value.
		hm1.put(2, "Sanket");	// HashMap is Assynchronize,thread not safe.
		hm1.put(3, "Sanket");
		System.out.println(hm1);
		
		HashMap hm2=new HashMap();
		hm2.put("Name", "Rohit");
		hm2.put(6, "Sohit");		// not assured, Order of Insertion is Maintained.
		hm2.put("Age",20);
		System.out.println(hm2);
		
		hm1.putAll(hm2);
		System.out.println(hm1);
		
//		--------------LinkedHashMap---------------------
	
		LinkedHashMap lhm2=new LinkedHashMap();
		lhm2.put("Name", "Rohit");
		lhm2.put(6, "Sohit");		// Order of Insertion is Maintained.
		lhm2.put("Age",20);
		System.out.println(lhm2); */
		
		
//		--------------HashTable---------------------

//		Hashtable ht=new Hashtable();
//		ht.put(1,"Sanket");		// Order of insertion is not preserved.
//		ht.put(2, "Rohit");		// load factor- 0.75, 75% of given locations get filled it doubles the size of buckets.
//		ht.put(3,"Ramesh");     // Hashtable is synchronize, thread is safe.
////		ht.put(null, "sdsd")// null key are not allowed.
//		ht.putIfAbsent(4,"sam");
//		System.out.println(ht);
		
		
//		--------------TreeMap---------Code Not Working------------

//		TreeMap tm=new TreeMap();
////		Integer i=new Integer(6); 
////		tm.put(i, "sam");  // key can be a Object.
//		tm.put(4, "Rohan");
//		tm.put(3, "Mohit");
//		tm.put(2, "Rohit");
//		System.out.println(tm);
		
		
		 List<Number> intList = new ArrayList < > ();

	        intList.add(10);

	        intList.add(20);

	        System.out.println("The list is: " + intList);
	}

}
