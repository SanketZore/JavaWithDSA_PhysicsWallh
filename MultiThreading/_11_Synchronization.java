package MultiThreading;


class Car implements Runnable{
	
	public void run() {   
//	synchronized public void run() {   
		try {
			
			System.out.println(Thread.currentThread().getName()+" has entered the parking");
			Thread.sleep(2000);  // multiple threads can enter at the same time.
			synchronized(this){  // multiple threads cannot enter at the same time.
				System.out.println(Thread.currentThread().getName()+" Got into Car to drive");
				Thread.sleep(2000);
				
				System.out.println(Thread.currentThread().getName()+"Started to drive the car");
				Thread.sleep(2000);
				
				System.out.println(Thread.currentThread().getName()+"came back and parked the car");
				Thread.sleep(2000);
			}
			
			
			
			/*
we can use synchronized with block also.


			 */			
			
		}catch (Exception e) {
			System.out.println("Some Problem");
		}finally {
//			System.out.println(System.currentTimeMillis());
		}
	}
}


public class _11_Synchronization {

	public static void main(String[] args) {

/*

when we have one car and all three has started to drive the car at the same time this problem is associated with multithreading.

when we have one resource and multiple threads using the same object at the same time out gets is illogical.

Synchronization= If we have one resource and multiple threads are trying to execute the resource the same. then we use Synchronization concept.
		- Untill one thread completes task another thread cannot use the same object.
race condition= multiple threads race to complete their task by utilizing the time of CPU doesn't matter what the output is.
 
 */


		Car car=new Car();
		
		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		
		t1.setName("son-1");
		t2.setName("son-2");
		t3.setName("son-3");
	
		t1.start();
		t2.start();
		t3.start();

		
		
		
	}

}
