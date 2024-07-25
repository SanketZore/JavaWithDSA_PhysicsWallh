package Interface;

public class Abstract_VS_Interface {

	/*
	 ---------Abstract Class---------
	 
	 -If we are talking about implementation but not completely(Partial Implementation) the we should go for abstract class.
	 - Every method present inside abstract class need not be public and abstract.
	 -there are no restrictions on  abstract class methods modifiers.
	 -Every abstract class variable need not be a public static final.
	 -Inside the abstract  class we can take constructor.
	 */
	
	/*
	 -If we don't know anything about implementation just we have requirement specification then we should go for an interface.
	 -Every method present inside the interface is always public and abstract whether we are declaring or not.
	 -we can't declare interface methods with the modifiers private , private, protected, final, static, synchronized, native, strict.
	 -Every interface variable is always a public static final whether we are declaring or not following modifiers. private, protected,transient, volatile.
	 -Inside the interface we can't take constructor. 
	
	 */
	
	public static void main(String[] args) {

	}

}
