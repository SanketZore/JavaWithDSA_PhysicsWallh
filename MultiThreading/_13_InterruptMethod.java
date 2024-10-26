package MultiThreading;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

import stack.nextGreaterElement;


class Example implements Runnable{
	
	public void run() {	
		for(int i=0;i<3;i++) {
			
			try {
				System.out.println("Focus is Important");					
//				Thread.sleep(2000);
			}catch(Exception e) {				// InterruptedException
				System.out.println("Thread is Interrupted");
			}
			
		}
		
	}
}


public class _13_InterruptMethod {

	
	public static void main(String[] args) {

		/*
		- Interrupt() method will invoke only if thread is in Block / waiting state, else interrupt will not work.

		- The interrupt() method asks a thread to stop what it's doing. It can also break a thread out of sleep or waiting by throwing an exception.
		 
		 */
		
		Example example=new Example();
		Thread t1=new Thread(example);
		t1.start();
		t1.interrupt();
		
	}

}
