package QualityKuisok;

import com.jmu11.staticMethodandNonStatic;

import Interface.interfaces;

public class FibonacciSeries {

	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {

		for(int i=0;i<=10;i++) {
			System.out.println(fib(i));
		}
		
	}

}
