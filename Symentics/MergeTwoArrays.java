package Symentics;

import java.lang.reflect.Array;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1= {2,4,9};
		int[] arr2= {1,3,6,8};
		
		int[] merge=new int[arr1.length+arr2.length];
		
		
		
//		for(int i=0;i<arr1.length;i++) {
//			merge[i]=arr1[i];
//		}
//		for(int i=0;i<arr2.length;i++) {
//			merge[i+arr1.length]=arr2[i];
//		}
		
		for(int i=0;i<merge.length;i++) {
			if(i<arr1.length) {
				merge[i]=arr1[i];
			}else {
				merge[i]=arr2[i-arr1.length];
			}
		}
		
		for(int i:merge) {
			System.out.println(i);
		}
				
		
	}

}
