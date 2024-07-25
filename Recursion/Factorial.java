package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Time Complexity: T(n)  	    n<=1
		// Time Complexity: T(n-1)+1    n>1
		// Space Complexity: O(n)
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		int result=factorial(num);
		System.out.println(result);

	}

	private static int factorial(int num) {
		if(num==0 || num==1) {
			return 1;
		}else {
			int result=num*factorial(num-1);
			return result;
		}
	}

}
