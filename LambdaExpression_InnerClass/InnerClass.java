package LambdaExpression_InnerClass;

/*
 InnerClass Types- member, static and Anonymous
 */


class Person{
	int age;
	String name;
	Address add;
	
	class Address{
		String city;
		String state;
		int pincode;
	}
}


class A{
	
	public void show() {
		System.out.println("In Show");
	}
	
	static class B{
		// static class is only works with innerClass.
		
		public void display() {
			System.out.println("In Display");
		}
		
		
	}
}


public class InnerClass {

	public static void main(String[] args) {

		A obj=new A();
//		A.B obj1=obj.new B(); // if member class(inner class without static keyword) then we need obj of outerClass.
		A.B obj1=new A.B(); 
		obj.show();
		obj1.display();
		
		
	}

}
