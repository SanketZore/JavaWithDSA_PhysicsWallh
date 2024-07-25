package com.jmu11;



class Alpha{
	
	static int a;
	static int b;
	
	int m;
	int n;
	
	// An instance variable is a variable declared within a class but outside any method, constructor, or block.
	
	static {   // Memory is assigned while loading of class means Only one time execution of static block, even after multiple class objects are created.
		System.out.println("Static Block");
		a=10;
		b=20;
	}
	{   // Instance Initialization Block
		System.out.println("Non static block");
		m=100;
		n=200;
	}
}
public class instanceVariable {
	

	public static void main(String[] args) {
		Alpha a1=new Alpha();  // 2 Objects means 2 time execution of Instance Initialization Block.
		Alpha a2=new Alpha();
		
		Alpha.a=20;
		Alpha.b=30;
		
		a1.m=30;   // many objects which will allocate many time memory to m and n.
		a1.n=300;
		
//		System.out.println(Alpha.a);
//		System.out.println(Alpha.b);
//		System.out.println(a1.m);
//		System.out.println(a1.n);
		
		
	}
}
