package HashingDataStructure;
import java.util.*;
import java.io.*;

public class _1_HashMapFunctions {

	public static void main(String[] args) {

		/*
		 
		 *** HASHMAP ***
		 		|					(KEY, VALUE)
		 		v
		 	Dictionary
		 
		 -Key is a Unique
		 -Value is changeable
		 -Time Complexity O(1)
		 
-Direct Addressing Table     Values(0,1,4,6,9,8)

		 Key	Value
		 0		0		
		 1		1 
		 2			
		 3
		 4		4
		 5		
		 6		6
		 7
		 8		8
		 9		9
		 
-The load factor: is the measure that decides when to increase the-
 				  capacity of the Map.	 

-Hash Function is a method use to map key-value pair in hash table.
		Famous Hash Function --->  Division-Modulo hash function
		
		h(f)= v % m
		m=size of hash table
		v=value


 Q->Division-Modulo hash function		
->suppose;		m=10   (indexing start from 0)
				Values(9,91,88,100,89)
				
-Hash Collision= two values address for same location or Key.
	-Collision Resolution Technique 2 Types.
		-Open Addressing			-Chaining
			-Linear Probing 		
			-Quadratic Probing
			-Double Hashing
				
		h(100)=100 %10=0
		
		Key	  Value
		 0		100		
		 1		91
		 2		
		 3
		 4		
		 5		
		 6		
		 7
		 8		88
		 9		9
		
		
-Various Functions of HashMap
		put()
		get()
		remove()
		entrySet()
		containsKey()
		
		


			 
		 */
// Name of class should be <HashMapFunctions>	
		HashMap <Integer,String> hashmap=new HashMap<>(); 
		
		// Functionality of the put function.
		hashmap.put(1, "Priya");
		hashmap.put(2, "Sanket");
		hashmap.put(4, "Rohit");
		hashmap.put(7, "Himanshu");
		System.out.println("HashMap of the given data: "+hashmap);
		
		// Functionality of the put function.
		String result=hashmap.get(2);
		System.out.println("Value for the given key is: "+result);
		
		// Functionality of the containsKey() function.
		
		System.out.println(hashmap.containsKey(4));
		
		// Functionality of the remove() function.
		
		hashmap.remove(1);
		System.out.println("Updated HashMap: "+hashmap);
		
		// Iterating using the for loop.
		System.out.println("Key\tValue");
		for(Map.Entry<Integer,String> e:hashmap.entrySet()) {
			System.out.println(+e.getKey()+"\t"+e.getValue());
		}
		
	
		
	}

}
