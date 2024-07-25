package abstractionAndAbstract;

/* -abstract class which does not have body or which does
not have any implementation. 
-abstract class is a class which contain atleast-
one abstract method.
-We cannot create a Object of abstract class.
-Constructor cannot be created as abstract. */

abstract class Aeroplane{
	
	abstract public void takeOff();
	
	abstract public void fly();
	
	public void landing() {
	// 100% abstraction is not-achieved.
		System.out.println("Aeroplane is Landing ...");
	}
}


class Cargoplane extends Aeroplane{
	public void takeOff() {
		System.out.println("cargoplane is taking off");
	}
	
	public void fly() {
		System.out.println("cargoplane is flying at lower height");
	}
	
	public void alert() {
		// special-method which is only there in child class.

			System.out.println("Alert...");
	}
}

class fighterPlane extends Aeroplane{
	public void takeOff() {
		System.out.println("fighterPlane is taking off");
	}
	
	public void fly() {
		System.out.println("fighterPlane is flying at lower height");
	}
	
	public void alert() {
	// special-method which is only there in child class.

		System.out.println("Alert...");
	}
}

class PassengerPlane extends Aeroplane{
	public void takeOff() {
		System.out.println("passengerPlane is taking off");
	}
	
	public void fly() {
		System.out.println("passengerPlane is flying at medium height");
	}
	
	public void alert() {
	// special-method which is only there in child class.

		System.out.println("Alert...");
	}
}




public class abstraction {

	public static void main(String[] args) {
		
		
//		Aeroplane a=new Aeroplane(); 
//object cannot be created of abstract class.

		Aeroplane ref=new Cargoplane();
		ref.takeOff();
		ref.fly();
		ref.landing();
		((Cargoplane) ref).alert(); // cannot be accessed from parent class.
		/* Down-casting  to access child method from parent.*/
		
		System.out.println("--------x--------");
		
		Aeroplane ref2=new PassengerPlane();
		ref2.takeOff();
		ref2.fly();
		ref.landing();
//		ref.alert();  // cannot be accessed from parent class.


	}

}
