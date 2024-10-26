package Systenics;

import com.jmu11.staticMethodandNonStatic;

public class AllPrimeNumbers {

	public static boolean primeOrNot(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		if(n%2==0) {
			return false; 
		}
		for(int i=3;i<Math.sqrt(n);i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int n=20;
		for(int i=0;i<n;i++) {
			
			if(primeOrNot(i)) {
				System.out.println(i);				
			}
		}
		
		
	}

}
