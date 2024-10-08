package ErrorsExceptionHandling;

/*
 Custom Exception and throw keyword
 Creating Exception 
 */

class MyException extends Exception{
	MyException(){}
	MyException(String msg){
		super(msg);
	}
}

public class RethrowingException {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = -2;

		try {
			if (num2 < 0) {
//				Exception e = new MyException("Negative Number");
//				throw e; 
//					OR
				throw new MyException("Negative Number");
			} else {
				int result = num1 / num2;
				System.out.println(result);
			}
		} catch (Exception e) {
			System.out.println("Enter a Valid Number " + e);
		}
	}
}
