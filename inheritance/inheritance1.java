package inheritance;

class Aeroplane{
	public void takeOff() {
		System.out.println("Aeroplane is taking off");
	}
	public void fly() {          // overridden method
		System.out.println("Aeroplane is flying");
	}
}

class CargoPlane extends Aeroplane {
	public void fly() {   // overridding method
		System.out.println("CargoPlane flies at lower height");
	}
	
	public void carryGoods() {   // overridding method
		System.out.println("CargoPlane carries goods");
	}
}

class PassengerPlane extends Aeroplane{
	public void fly() {
		System.out.println("PassengerPlane flies at Medium height");
	}
	public void carryPassenger() {   // overridding method
		System.out.println("carryPassenger flies at lower height");
	}
}



public class inheritance1 {
	
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		cp.fly();
		cp.takeOff();
		
		PassengerPlane pp=new PassengerPlane();
		pp.fly();
		pp.takeOff();
	}

}
