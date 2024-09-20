package MultiThreading;


class Printing implements Runnable{

	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println("Focus is important");
				Thread.sleep(3000);
			}
		}catch(Exception e) {
			System.out.println("Some Problem");
		}
	}
	
}


public class _10_JoinAnsIsAliveMethods {

	public static void main(String[] args) throws Exception {

		System.out.println("Main Thread Started");
		
		Printing printing=new Printing();
		Thread t1=new Thread(printing);  // thread doesn't get life when we create object of thread.
		
		System.out.println(t1.isAlive());  // Gives information about thread whether its running or not.
		t1.start();   // life gets when start() method is invoked.
		System.out.println(t1.isAlive());
		t1.join();  // it gives exception.  // It waits till completion of task of one thread after completion next code starts execution.
		
		
		
		System.out.println("Main Thread finished the work");
		System.out.println(System.currentTimeMillis());
	}

}
