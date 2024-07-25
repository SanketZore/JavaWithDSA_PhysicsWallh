package HashingDataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _3_TypesOfHashMapsInJava {
	/*
	 
	 			<Interface>
	 				Map
	 	^			^			   ^			^	
	 	|			|			   |            |
	 	|			|			   |	   <Interface>
	 	|			|			   |		SortedMap
	 	|			|			   |			|
	 Hashtable	LinkedHashMap	HashMap	  	 TreeMap
	 
-HashMap Order of insertion is Not Preserved.
-LinkedHashMap order of insertion is preserved. 	 
-TreeMap,output gets in sorted data in terms of key. 

	 */
	
	public static void main (String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(3, "Priya");
		map.put(1, "Ajay");
		map.put(7, "Piyush");
		map.put(5, "Jeet");
		System.out.println(map);	//insertion is Not Preserved.
		
		
		// order of insertion retained in LinkedHashMap.
		LinkedHashMap<Integer, String> map1=new LinkedHashMap<>();
		map1.put(3, "Priya");
		map1.put(1, "Ajay");
		map1.put(7, "Piyush");
		map1.put(5, "Jeet");
		System.out.println(map1);	//insertion is preserved.
		
		
		//Sorted Output on the bases of the keys.
		TreeMap<Integer, String> map2=new TreeMap<>();
		map2.put(3, "Priya");
		map2.put(1, "Ajay");
		map2.put(7, "Piyush");
		map2.put(5, "Jeet");
		map2.put(6, "Anjali");
		System.out.println(map2);
		
		
/*
 
 Values: 
 		 0		20		
		 1		11 
		 2		22
		 3		33
		 4		44
		 5		55
		 6		66
		 7		77
		 8		88
		 9		99
		
		
Load Factor 
	|
	V
	Rehashing(If few enteries get deleted,or if their is empty space then rehash the table, and pair values and double the size of HashMap)
 */
		
		
		
		
	}
	
	
}
