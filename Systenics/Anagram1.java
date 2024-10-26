package Systenics;

import java.io.NotActiveException;
import java.util.Arrays;

public class Anagram1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="san";
		String s2="nsa";
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
