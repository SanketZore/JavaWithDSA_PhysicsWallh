package Interface;

/*
 No constructor in Interface.
 It will allow only abstract methods.
 It cannot be Instantiated
 */
interface A{
	int num=6;  // variables are public static final.
	void show();  // Methods are public and abstract.
}
interface X{
	void abc();
}

class B implements A,X{
	public void show() {
		System.out.println("In Show");
	}
	public void abc() {
		System.out.println("C-abc");
	}
}
public class interfaces {

	public static void main(String[] args) {

//		System.out.println(A.num);
		B b=new B();	//will call Both methods A,X.
//		A b=new B();   // will call only A methods not of X.
//		X b=new B();   // will call only X methods not of A.
		b.show();
		b.abc();
		
		
	}

}
