package finalKeyword;

import Interface.interfaces;

// Restrict Class Inheritance by using final class
// Final Variable --> To create constant variable.
// Final Methods --> Prevent Method Overriding.
// Final Clases --> Prevent Inheritance.

//final class Animal {    // subclass cannot inherit final class.
//	void sleep() {
//		System.out.println("Animal is Sleeping");
//	}
//}

class Animal {
	final void sleep() {
		System.out.println("Animal is Sleeping");
	}
}

class Tiger extends Animal{
	
}


public class finalKeyword {

	public static void main(String[] args) {
		
		Tiger t=new Tiger();
		t.sleep();
		
		
		

	}

}
