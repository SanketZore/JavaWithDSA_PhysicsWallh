package Interface;

/*
 JAVA 8 Features over Interface.
 - Default methods in interfaces - 
 - Static methods in  interfaces.
 - Functional Interfaces -only one abstract method.
 
 
 (
An abstract method is a method that is declared without an implementation (i.e., without a body))
 
 
 TYPES OF INTERFACES
 -single Abstract Method(SAM) Interface (Functional Interface) - only one abstract method.
 -Normal Interface- Multiple methods.
 -Marker Interface- not a single Method.    (In modern Java, marker interfaces have been partially replaced by annotations)
 
 
 
 */


interface Z{
	void show();
	default void config() {     // non static method // can be overRidden.
		System.out.println("In Config");
	}
	static void abc() {                
		System.out.println("In abc");
	}
}

class Y implements Z{
	public void show() {
		System.out.println("In Show");
	}

}

public class Java8FeaturesAndFunctionalInterface {

	public static void main(String[] args) {

		Z.abc();
		Z obj=new Y();
		obj.show();
		obj.config();
	}

}
