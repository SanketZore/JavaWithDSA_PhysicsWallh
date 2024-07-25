package MultiThreading;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class _3_MainThread {

	public static void main(String[] args) {

		System.out.println("Before changing");

		System.out.println("Main Thread");
		String name=Thread.currentThread().getName();  // name of thread.
		System.out.println("The name of main Thread is "+name);
		System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());	// gives priority of thread
	
		System.out.println("After changing");
	
		/*
		 changing the name of thread and priority by directily using- 
		 Thread class name which means this methods are static( statically defined methods)
		 */
		
		Thread t=Thread.currentThread(); 
		t.setName("PW");  	// setting new name of main thread.
		t.setPriority(1); 	// setting new priority.
		
		String name1=Thread.currentThread().getName();
		System.out.println("The name of main thread is "+name1);
		System.out.println("The priority of main thread is "+Thread.currentThread().getPriority());
		
		
	}

}
