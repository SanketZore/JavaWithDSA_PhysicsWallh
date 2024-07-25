package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		
		for(int i=0;i<num;i++) {
			System.out.println(FibonacciNumber(i));
		}
		
//		int result=FibonacciNumber(num);
//		System.out.println(result);
	}

	private static int FibonacciNumber(int num) {
		// TODO Auto-generated method stub
		int result=0;
		if(num<=1) {
			return num;
		}else {
			result=FibonacciNumber(num-1)+FibonacciNumber(num-2);
		}
		return result;
	}

}
