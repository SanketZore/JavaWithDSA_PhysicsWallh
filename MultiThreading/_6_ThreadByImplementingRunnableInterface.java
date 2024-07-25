package MultiThreading;

import java.util.Scanner;

class Demo1{
	
}

class Calc1 extends Demo1 implements Runnable{
	public void run() {
		System.out.println("Calculation Task Started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=sc.nextInt();
		System.out.println("Please enter second"
				+ " number");
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
	
	}
}

class Message1 implements Runnable{
	
	public void run(){
	System.out.println("Displaying important message task");
		
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Focus is important to master skill");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println("Some Problem");
		}
		
		
		System.out.println("Displaying import message task ended");
		System.out.println("*****************************");
		
	}
}


public class _6_ThreadByImplementingRunnableInterface {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		
		Calc1 c1=new Calc1();
		Message1 m2=new Message1();
		Thread t1=new Thread(c1);  // work done by Constructor
		Thread t2=new Thread(m2);
		
		t1.start();   //  start gives life of thread, to thread-Schedular.
		t2.start();
	
//		t1.run();    // this will run, but not like MultiThreading , it will run line by line.
//		t2.run();
		
	}
}
