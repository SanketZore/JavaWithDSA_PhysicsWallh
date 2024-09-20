package MultiThreading;

class Library implements Runnable{

	String res1=new String("Java"); 
	String res2=new String("SQL"); 
	String res3=new String("DSA"); 
	
	public void run() 
	{
		try {
			String name= Thread.currentThread().getName();
			if(name.equals("STUDENT-1")) {
				try {
					Thread.sleep(3000);
					synchronized (res1) {
						System.out.println("Student1 has acquired "+res1);
						Thread.sleep(3000);
						synchronized(res2) {
							System.out.println("Student1 has acquired "+res2);
							Thread.sleep(3000);
							synchronized(res3) {
								System.out.println("Student1 has acquired "+res3);
							}
						}
					}
						
					
				}catch (Exception e) {
					System.out.println("Some problem");
				}
				
			}else {
				
				try {
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("Student2 has acquired "+res3);
						Thread.sleep(3000);
						synchronized(res2) {
							System.out.println("Student2 has acquired "+res2);
							Thread.sleep(3000);
							synchronized(res1) {
								System.out.println("Student2 has acquired "+res1);
							}
						}
					}
						
					
				}catch (Exception e) {
					System.out.println("Some problem");
				}
			}
			
		}catch(Exception e) {
			System.out.println("Some Problem");
		}
		
		
	}
	
}


public class _12_DeadLock {

	public static void main(String[] args) {

		Library lib=new Library();
		
		Thread t1=new Thread(lib);
		Thread t2=new Thread(lib);
		
		t1.setName("STUDENT-1");
		t2.setName("STUDENT-2");
		
		t1.start();
		t2.start();
		
/*

MultiThreading multiple threads stuck in the blocked state due to mutual dependency or cyclic dependency of the resources. 

 */
		
	}

}
