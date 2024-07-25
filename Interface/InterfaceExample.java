package Interface;

// Interface is used to reduce dependencies.

interface Computer{
	public void compileCode();
}

class Laptop implements Computer{
	public void compileCode() {
		System.out.println("You got 5 errors");
	}
}
class Desktop implements Computer{
	public void compileCode() {
		System.out.println("You got 5 errors,faster");
	}
}

class Developer{
	public void buildApp(Computer obj) {
		System.out.println("Building App");
		obj.compileCode();
	}
}




public class InterfaceExample {

	public static void main(String[] args) {
		
		Computer com=new Desktop();
//		Laptop obj=new Laptop();
//		Desktop desk=new Desktop();
		Developer dev=new Developer();
		dev.buildApp(com);
		
	}

}
