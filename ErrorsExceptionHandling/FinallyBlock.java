package ErrorsExceptionHandling;
import java.util.*;
public class FinallyBlock {

	public static void main(String[] args) {

		int num=0;
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.print("Enter Number:");
			num=sc.nextInt();
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Wrong Input Type... "+e);
		}
		finally 
		{
			sc.close();
			System.out.println("Resource Closed");
			// finally will execute irrespective of exception or not.
		}
		
		System.out.println(num);
		
		
		
		// try with resource
//		try(Scanner sc=new Scanner(System.in)){
//			num=sc.nextInt();
//			}
		
	}

	// DRY -do not repeat yourself.
}
