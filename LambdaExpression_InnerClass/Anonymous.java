package LambdaExpression_InnerClass;


interface Car{
	
	void drive();
	
}

//class WagonR implements Car{
//	public void drive() {
//		System.out.println("Driving...");
//	}
//}

public class Anonymous {

	public static void main(String[] args) {

		Car obj=new Car() {
			// object of interface is not created here, it is a class here.
			// class inside another class but without name it is called as anonymous class.
			public void drive() {
				System.out.println("Driving...");
			}
		};
		obj.drive();
		
	}

}
