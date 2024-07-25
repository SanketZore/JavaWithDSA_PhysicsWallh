package MultiThreading;

import java.util.Scanner;

public class _1_FundamentalsOfMultithreading {

	public static void main(String[] args) {

		/*
		 
		 Task--> Activity / piece of work. 
		 
		 Multitasking 
		 	Executing several tasks simultaneously is the concept of multitasking.
		 
		 There  are 2 types of multitasking
		 	a) Process based multitasking 
		 	b) Thread based multitasking
		 */
		
		
// ----Thread and need of multiple threads----.		
		System.out.println("Calculation Task Started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=sc.nextInt();
		System.out.println("Please enter first number");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		
		System.out.println("Calculation Task Eneded");
		System.out.println("****************************");
		System.out.println("Printing * Task Started");
		
		for(int i=0;i<4;i++) {
			System.out.println("*");
		}
		
		System.out.println("Printing * Task Ended");
		System.out.println("*****************************");
		System.out.println("Displaying important message task");
		
		for(int i=0;i<4;i++) {
			System.out.println("Focus is important to master skill");
		}
		
		System.out.println("Displaying import message task ended");
		System.out.println("*****************************");
		
	}

}
