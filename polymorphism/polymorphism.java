package polymorphism;

// polymorphism one object many methods/functions/features.

class Aeroplane{
	public void takeOff() {
		System.out.println("Aeroplane is taking off");
	}
	
	public void fly() {
		System.out.println("Aeroplane is flying");
	}
}


class Cargoplane extends Aeroplane{
	public void takeOff() {
		System.out.println("cargoplane is taking off");
	}
	
	public void fly() {
		System.out.println("cargoplane is flying at lower height");
	}
}

class fighterPlane extends Aeroplane{
	public void takeOff() {
		System.out.println("fighterPlane is taking off");
	}
	
	public void fly() {
		System.out.println("fighterPlane is flying at lower height");
	}
}

class PassengerPlane extends Aeroplane{
	public void takeOff() {
		System.out.println("passengerPlane is taking off");
	}
	
	public void fly() {
		System.out.println("passengerPlane is flying at medium height");
	}
}

class Airport{
	public void poly(Aeroplane ref) {
		ref.takeOff();
		ref.fly();
		
		System.out.println("-----------------------");
	}
}



public class polymorphism {

	public static void main(String[] args) {

		/*
		      2 types of polymorphism.
		 Static Polymorphism ex; Overloading
		 Dynamic Ploymorphism ex; Overriding
		 
		 */
		
		Cargoplane cp=new Cargoplane();
//		cp.takeOff();
//		cp.fly();
		
		PassengerPlane pp=new PassengerPlane();
//		pp.takeOff();
//		pp.fly();
		
		fighterPlane fp=new fighterPlane();

		// parent class has ability to hold the address of child class.
		
//		Aeroplane ref;
//		ref=cp;
//		ref.takeOff();
//		ref.fly();
//		System.out.println("-------");
//		ref=pp;
//		ref.takeOff();
//		ref.fly();
		
		Airport a=new Airport();
		a.poly(cp);
		a.poly(pp);
		a.poly(fp);
		
		
		
	}

}
