package inheritance;

class Demo1{
	int a,b;
	public Demo1() {
		this(1,2);
		System.out.println("Parent Class Constructor");
	}

	public Demo1(int x, int y) {
		System.out.println("Parametrrized Parent Class Constructor "+x+y);
		a=x;
		b=y;	
	}
}

class Demo2 extends Demo1{
	int m,n;
	public Demo2() {
//		super();    // default super() exist in line of constructor.
		System.out.println("Child Class Constructor");
	}
	public Demo2(int x,int y) {
		// automatically super() is called by JVM.
		super(5,7);
		System.out.println("Parameterixed parent class constructor "+x+y);
		m=x;
		n=y;
	}
}

public class constructor_Execution_In_Case_Of_Inheritance {

	public static void main(String[] args) {
		
		Demo2 d=new Demo2();
//		Demo2 d2=new Demo2(2,5);
	}

}
