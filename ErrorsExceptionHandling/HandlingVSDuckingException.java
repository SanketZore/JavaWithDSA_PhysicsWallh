package ErrorsExceptionHandling;


/*
 -Handling 
  	Handling means, solve the exception.

 	try{ }catch( ){ }
 	
 -Ducking
 	Ducking means, Avoid to solve the exception.
 	public void name() throws Exception{	}
 	
 */



class Demo{
	public void a() throws Exception{
		
//		try {
			b();			
//		}catch(Exception e) {
//			System.out.println("Error"+e.getMessage());
//		}
	}
	
	public void b() throws Exception {
		int num1=0;
		int num2=0;
		
		int result=num1/num2;
		System.out.println(result);			

	}
}



public class HandlingVSDuckingException {

	public static void main(String[] args) {

		Demo obj=new Demo();
		try {
			obj.a();			
		}catch(Exception e){
			System.out.println("Error"+e.getMessage());
		}
	
	}

}
