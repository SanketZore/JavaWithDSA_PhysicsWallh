package HashingDataStructure;

import java.util.HashMap;
import java.util.Scanner;

import Interface.interfaces;

public class _4_TwoSumInterviewProblem {

	public static void main(String[] args) {

		/*
		arr(i)   i
		Key    Value
		 2		0 
		 7		1	
		 11		2
		 15		3+-
		 0		4

		 
		 map.contains(key)
		 map.get(0)			-gives Index value in output.
		 
		 Time Complexity: O(n)
		 Space Complexity: O(n)
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int n=sc.nextInt();
		
		// input array elements in an Array
		int[] arr=new int[n]; 
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//input target element in an array
		System.out.print("Enter the target element in an array: ");
		int target=sc.nextInt();
		
		//create a hashmap where key is arr[i] and value is i
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(arr[i], i);
		}
//		create a result to display the index of two numbers.
		int result[]=new int[2];
		
//		if current is equal to the target.
		for(int i=0;i<n;i++) {
			if(arr[i]==target && map.containsKey(0)) {
				result[0]=i;
				result[1]=map.get(0);
			}else if(map.containsKey(target-arr[i])) {
				// is the element is non repetable.
				if((map.get(target-arr[i])>i)) {
					result[0]=i;
					result[i]=map.get(target-arr[i]);
					break;
				}
			}else {
				result[0]=-1;
				result[1]=-1;
			}
		}
		System.out.println("Two sum index values are:["+result[0]+" "+result[1]+"]");
		
	}

}
