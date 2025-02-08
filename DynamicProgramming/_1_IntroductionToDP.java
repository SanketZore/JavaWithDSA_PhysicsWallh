package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import javax.sql.CommonDataSource;

import com.jmu11.staticMethodandNonStatic;

import Interface.interfaces;
import stack.nextGreaterElement;

public class _1_IntroductionToDP {
	
	
	// function calling -Recursive Approach
	//time complexity - O(2^n)
	// Space Complexity - O(log n) or O(n)
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		
		return fib(n-1)+fib(n-2);
		
	}
	
	
	//Function calling -Memoization Dynamic Programming (Enhanced Recursion)
	// time complexity- O(n)
	//Space complexity - stack space + hashtable- O(n)  //// Linear Complexity.
	
	public static Map<Integer,Long> memo=new HashMap<>();
	
	public static long fibMemo(int n) {
		
		//Base Case Condition
		if(n<=1) {
			return n;
		}
		// 1. Optimised logic - avoid the recomputations in the recursive function call.
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		// 2. Recursive Function Call.
		long fibVal=fibMemo(n-1)+fibMemo(n-2);
		memo.put(n, fibVal);
		return fibVal;
	}
	
	// Function calling- Tabulation Dynamic Programming (No Recursion)
	// time complexity- O(n)
	//Space complexity- O(n)
	
	public static long fibTab(int n) {
		long fib[] =new long[n+1];
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		return fib[n];
	}

	
	//function calling- Most Optimized Approach.
	// time complexity- O(n)
	// Space Complexity- O(1)
	
	public static long fibOpt(int n) {
		long first=0,second=1,third;      // No use of any external data structure.
		for(int i=2;i<=n;i++) {
			third=first+second;
			first=second;
			second=third;
		}
		
		return second;
	}
	
	
	public static void main(String[] args) {

		int n=50;
//		System.out.println("The Fibonacci Series Value is: "+fibTab(n));
		System.out.println("The Fibonacci Series Value is: "+fibOpt(n));
		
		
	}

}
