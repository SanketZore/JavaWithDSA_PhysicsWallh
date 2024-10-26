package Systenics;

public class Factorial {

//	public static int Factorial(int num) {
//
//		if(num==1 || num==0) {
//			return 1;
//		}
//		return num*Factorial(num-1);
//	}
	
	
	public static void fibonacciSeries(int n) {
		int first=0;
		int second=1;
		for(int i=0;i<n;i++) {
			int third=first+second;
			System.out.println(first);
			first=second;
			second=third;
		}
	}
	
//	0 1 1 2 3 5 8 13 21 34
	public static int fibonacciSeries1(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacciSeries1(n-1)+fibonacciSeries1(n-2);
	}
	
	public static void main(String[] args) {

//		System.out.println("Factorial is "+Factorial(5));
	
		fibonacciSeries(12);

//		System.out.println(fibonacciSeries1(12));
	
		   System.out.print("Fibonacci series: ");
		   int n=12;
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacciSeries1(i) + " ");
	        }
	}

}
