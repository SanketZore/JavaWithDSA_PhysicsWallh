package MultiThreading;

import java.util.Scanner;

class Demo{
	
}

//class Calc extends Thread,Demo{  // this is not possible, restricted by extending.
	class Calc extends Thread{
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

class Message extends Thread{
	
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

class First extends Thread{
	public void run() {
			System.out.println("First");
	}
}
class Second extends Thread{
	public void run() {
			System.out.println("Second");
	}
}



public class _5_MultipleThreads {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		
		Calc t1=new Calc();
		Message t2=new Message();
		
		t1.start();
		t2.start();
	
		
		
		
		
		
//		First first=new First();
//		Second second=new Second();
//		first.start();
//		second.start();
		
		
		
	}

}
