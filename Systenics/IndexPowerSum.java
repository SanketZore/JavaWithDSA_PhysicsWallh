package Systenics;

import java.math.*;
public class IndexPowerSum {

	public static void main(String[] args) {


		int n=45;
		String m=n+"";     // Integer.toString(n);
		int p=m.length();
		double value=0;
		
//		while(n!=0) {            // 4^1+5^2
//			int digit=n%10;
//			value+=Math.pow(digit, p);
//			n/=10;
//			p--;	
//		}
//		System.out.println(value);
		
		
		char[] arr=m.toCharArray();
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sum+=Math.pow(Character.getNumericValue(arr[i]), arr.length-i);
		}
		System.out.println(sum);
		
	}

}
