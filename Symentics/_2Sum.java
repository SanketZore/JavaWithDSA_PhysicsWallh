package Symentics;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.*;

public class _2Sum {

	
	public static String TwoArray(int[] arr,int target) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				return "[ "+arr[i]+" "+"0 ]";
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target && i!=j) {
//					return "[ "+arr[i]+" "+arr[j]+" ]";
//				}
//			}
//		}
		
		for(int i=0;i<arr.length;i++) {
			int first=arr[i];
			int second=arr[i+1];
			if(first+second==target) {
				
				return "[ "+first+" "+second+" ]";
			}
		}
		return "Target Cannot be Completed!!";
	}
	
	
	public static void main(String[] args) {

//		1. find consecutive pairs from array whose sum is equal to given sum

//		[2 5 7 6 4 3]
		
		
		int[] arr= {5,6,9,8};
		int target=15;
		
		System.out.println(TwoArray(arr,target));

		
	}

}
