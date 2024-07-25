package MultiThreading;

class MyThread extends Thread{   // All properties and methods of Thread class get inherited by MyThread class.
	public void run() {		// we cannot invoke run method using class Object.
		System.out.println("Child Thread");
	}
}


public class _4_CreateThread {

	public static void main(String[] args) {
		
		/*
		 There are two ways to create a thread
		 	- By extending Thread class.
		 	- By implementing Runnable interface.
		 */
		
		MyThread t=new MyThread();
		t.start();				
		
		
		
		
	}

}
