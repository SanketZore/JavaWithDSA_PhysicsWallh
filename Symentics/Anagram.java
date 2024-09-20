package Symentics;
import java.util.*;

import java.io.NotActiveException;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="roma";
		String name2="aomr";		
		char[] arr=name1.toCharArray();
		char[] arr1=name2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		System.out.println(arr);
		System.out.println(arr1);
		if(Arrays.equals(arr, arr1)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
