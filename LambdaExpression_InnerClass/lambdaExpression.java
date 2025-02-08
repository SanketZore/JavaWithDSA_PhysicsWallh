package LambdaExpression_InnerClass;

import abstractionAndAbstract.abstraction;

/*
 lambda Expression only works with functional interface(only one abstract method(method without body)).
 
 Why to use lambda Expression.
 - To provide the implementation of Functional Interface.
 - Less Coding.
 - Lambda expression is treated itself as a function.
 */



//@FunctionalInterface
interface Car1{
	void drive(int avg, int ts);
}

public class lambdaExpression {

	public static void main(String[] args) {

//		Car1 obj=(int avg)->System.out.println("Driving..."+avg);
		Car1 obj=(avg,ts)->System.out.println("Driving..."+avg+": "+ts);
		
		
		
//		Car1 obj1=(avg,ts)->{
//			System.out.println();
//		};
		 
	}

}
