package Collection;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {

		/*
		 Index based insertion is not allowed.
		 Insertion Order is not Preserved.
		 HashSet Follows Hashing  and Stores Data in Buckets in Hash Table.
		 Duplicate Values not Allowed.
		 Unique Values Required.
		 Complexity= O(1).
		 Default 16 Buckets, if increased over 75% then all buckets get Doubled(32).
		 Load Factor - 75%,  0.75
		 
		 
		 
		 */
		
		HashSet hs=new HashSet();      // Released in 1.2V
		hs.add(30);
		hs.add(100);
		hs.add(20);
		hs.add(40);
		System.out.println(hs);
		
		LinkedHashSet hs1=new LinkedHashSet();  // Preserves Order of Insertion.
		hs1.add(30);
		hs1.add(100);				// Released in 1.4V.
		hs1.add(20);				// sub class of HashSet.
		hs1.add(40);
		System.out.println(hs1);
		
		
		
	}

}
