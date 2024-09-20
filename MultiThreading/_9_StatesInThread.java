package MultiThreading;

import java.lang.classfile.AnnotationValue.OfAnnotation;


class Demo3 implements Runnable{
	public void run() {
		System.out.println("Child Thread Execution");
		try {
			Thread.sleep(3000);
			
		}catch(Exception e) {
			System.out.println("Error problem");
		}
		System.out.println("Child thread task completed");
	}
}


public class _9_StatesInThread {

	public static void main(String[] args) {


		/*
Different states Of thread 
		 
A thread is a path of execution in a programing that goes through the following states of a thread. the five states are as follows:
	New   = New thread is created
	Runnable = Ready state or ready to be executed.
	Running = If the task is running, then we say State is running.
	Blocked(Non-runnable state = If required resources are not available then it goes to Blocked state or it is in sleep state.
	Dead = Execution is completed.
		 */
		
/*
			
						__________ yield() _______
					   |						  | 
					   |						  | 
					   |  (CPU time is allocated) |
    th.start()		   V		TS allocate  	  |			Exits
New------------> Runnable/Ready---------------> Running ---------> Dead
						^						  |
						|						  |
						|________________Blocked/Waiting
	

- TS=Thread Schedular
- yield() makes the process from running state, back to runnable state through yield() method.



*/
	
		System.out.println("Main Thread Started");
		
		Demo3 d=new Demo3();
		Thread t1=new Thread(d);
		t1.start();
		
	}

}
