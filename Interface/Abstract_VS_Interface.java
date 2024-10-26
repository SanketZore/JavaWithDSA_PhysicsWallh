package Interface;

public class Abstract_VS_Interface {

	/*
	 - Abstract classes and interfaces are both used in Java to achieve abstraction.
	 - We cannot instantiate interface and abstract class.
	 - both holds abstract methods.
	 
	 */
	
	/*
	 --------- Abstract Class ---------
	 
	 -If we are talking about implementation but not completely(Partial Implementation) the we should go for abstract class.
	 - Every method present inside abstract class need not be public and abstract.
	 -there are no restrictions on  abstract class methods modifiers.
	 -Every abstract class variable need not be a public static final.
	 -Inside the abstract class we can take constructor because constructor is not usefull as we cannot instantiate abstract class.
	 */
	
	/*   
	  --------- Interface ----------
	  
	 -Multiple Inheritance of Type:
	 -If we don't know anything about implementation just we have requirement specification then we should go for an interface.
	 -Every method present inside the interface is always public and abstract whether we are declaring or not.
	 -we can't declare interface methods with the modifiers private, protected, final, static, synchronized, native, strict.
	 -Every interface variable is always a public static final whether we are declaring or not following modifiers. private, protected,transient, volatile.
	 -Inside the interface we can't take constructor. 
	 
	 100% Abstraction (Until Java 8): Originally, interfaces provided only abstract methods with no implementation. Since Java 8, interfaces can also have default and static methods with implementation. However, interfaces still can't hold state (instance variables).
	
	 */
	
	public static void main(String[] args) {

	}

}
