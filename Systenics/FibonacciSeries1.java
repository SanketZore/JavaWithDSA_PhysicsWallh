package Systenics;

import com.jmu11.staticMethodandNonStatic;

public class FibonacciSeries1 {

	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}
	
	public static void main(String[] args) {

		
		int n=5;
		for(int i=0;i<n;i++) {
			System.out.println(fib(i));			
		}
		
		
	}

}
