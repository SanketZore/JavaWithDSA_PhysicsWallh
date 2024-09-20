package API;



// Functional Interface
@FunctionalInterface
interface Demo{
	void disp();   // only one abstract method allowed in functional interface.
//	void disp1();
}

// This is parent class.
//@Deprecated // striceThrough method means methods are old not in current use.
class Plane
{
	public void planeFliesAtGoodHeight() {
		System.out.println("Plane is Flying");
	}
}

//this is subclass or child class.
class CargoPlane extends Plane
{
	
	//Overridden method from parent class.
	
	@Override
	public void planeFliesAtGoodHeight() {
		System.out.println("Plane is landing");
	}
	
}

public class IntroductionToAnnotation {

	public static void main(String[] args) {

		// Object of child class
		Plane cp=new CargoPlane();   //To achieve loose-Coupling, always give reference of parent class, to child class object.
		cp.planeFliesAtGoodHeight();
		
	}

}
