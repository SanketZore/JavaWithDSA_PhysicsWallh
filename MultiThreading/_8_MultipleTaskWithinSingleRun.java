package MultiThreading;

import java.security.PublicKey;
import java.util.Scanner;

class MyThread1 extends Thread{
	
	public void run() {
	 	String tName= Thread.currentThread().getName();
	 	if(tName.equalsIgnoreCase("calc")) {
	 		calc();
	 	}else {
	 		importantMesg();
	 	}
	}
	
	public void calc() {
		System.out.println("Calculate task started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1=sc.nextInt();
		System.out.println("Please enter second number:");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Calculatation task ended");
		
		System.out.println("*******************************");
		
	}
	public void importantMesg() {
		System.out.println("Displaying important message task");
		
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Focus is important to master skills");
				Thread.sleep(2000);
			}
		}catch(Exception e){
			System.out.println("Some problem");
		}
		System.out.println("Displaying import meassage task ended");
	}
	
}



public class _8_MultipleTaskWithinSingleRun {

	public static void main(String[] args) {

		System.out.println("Main thread Started");
		MyThread1 thread1=new MyThread1();
		MyThread1 thread12=new MyThread1();
		
		thread1.setName("CALC");
		thread12.setName("IMPORTANTMESG");
		
		thread1.start();
		thread12.start();
		
	}

}
