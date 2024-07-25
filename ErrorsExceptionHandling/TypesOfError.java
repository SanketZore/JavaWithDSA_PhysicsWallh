package ErrorsExceptionHandling;


public class TypesOfError {

	public static void main(String[] args) {

		/*
		-Syntax Error
		-Logical Error
		-Runtime Error		-Exception 
		 */
		
		// Exception is a class which through's which we catch exception.
		
		
		int num1=5;
		int num2=2;
		int result=0;
		int values[]= {4,7,2,9};
		String name=null;
		
		try{
			result=num1/name.length();
			System.out.println(values[5]);
		}catch(ArithmeticException obj) {
			
			System.out.println("Cannot divide by zero "+obj);
			
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Stay in your limit "+obj);
		}catch(Exception e) {
			System.out.println("Something went Wrong.");
		}
		
		System.out.println(result);
		
		System.out.println("Bye");
		
		
		
		// normal Statement
		//critical statement
		
		
		
	}

}
