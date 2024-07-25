package GenericsAndComparatorAndComparable;

import java.util.ArrayList;

import com.jmu11.staticMethodandNonStatic;

import Collection.Arraylist;

public class _1_Generics {

	
	/*
	 
	 Generics introduced in java 5.
	 
	 It provides compile time type safety.
	 
	 */
	
	
	public static void main (String[] args) {
		
//		String ar[]=new String[10];
//		ar[0]="Hyder";
//		ar[1]="ps";
////		ar[2]=10; 	//array supports type safety.
//		
//		String name1=ar[0];
//		String name2=ar[1];
		
		
		// No typesafety
		ArrayList<String> al= new ArrayList<>();
		al.add("hyder");
		al.add("pw");
		
		al.add("10");
		
		String n1=(String)al.get(0);	//typecasting
		String n2=(String)al.get(1);	
		String n3=(String)al.get(1);	
		
		System.out.println(al.get(0));
		
		
		
		
	}
}
