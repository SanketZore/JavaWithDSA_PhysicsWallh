package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import com.jmu11.staticMethodandNonStatic;

import Interface.interfaces;

public class _2_Climbing_Staircase {

	// Stack space is used in Recursion for storing values.
	
	// Time Complexity= O(2^n) , Exponentional
	// Space Complexity=  Best Case:O(log n), Worst Case: O(n)
	
	
	public static int climbStairs(int n) {
		
		// Base Case Condition
		if(n==1 || n==2) {
			return n;
		}else {
			// Recursive Function Call
			return climbStairs(n-1)+climbStairs(n-2);			
		}
		
	}
	
	// Memoization Approach (Dynamic Approach) - Enhanced Recursion.
	//Time Complexity= O(n)
	//Space Complexity= O(n)   ---Space will be Combination of Stack and Map.
	public static Map<Integer, Integer> memo= new HashMap<>();
	
	public static int climbStair_Memoization(int n) {
		// Base Condition.
		if(n==1 || n==2) {
			return n;
		}else {
			// Avoid Recomputations.
			
			if(memo.containsKey(n)) {
				return memo.get(n);
			}
			
			// Recursive Function Call
			
			int numWays=climbStair_Memoization(n-1)+climbStair_Memoization(n-2);
		
			memo.put(n,numWays);
			return numWays;
		}
		
	}
	
	
	// Tabulation Approach (Dynamic Approach)
	// No Recursion
	//Time Complexity= O(n)
	//Space Complexity= O(n)
	public static int climbStair_Tabulation(int n) {
		if(n==1) {
			return 1;
		}
//		1 2 3
		//Array Initialization
		
		int[] cs=new int[n+1];
		cs[1]=1;
		cs[2]=2;
		
		for(int i=3;i<=n;i++) {
			cs[i]=cs[i-1]+cs[i-2];
		}
		
		return cs[n];
	}
	
	
	// Most Optimized Approach
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static int climbStair_WithoutDP(int n) {
		if(n==1) {
			return 1;
		}
		int first=1,second=2,third;
		for(int i=3;i<=n;i++) {
			third=first+second;
			first=second;
			second=third;
		}
		return second;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=45;

//		System.out.println(climbStairs(n));  // This method takes Time for computation.
		System.out.println(climbStair_Memoization(n));
		System.out.println(climbStair_Tabulation(n));
		System.out.println(climbStair_WithoutDP(n));
//		Long startTime = System.nanoTime(); // Start time
//        System.out.println(startTime);      // time taken to run the program in milliseconds.
		
		
	}

}
