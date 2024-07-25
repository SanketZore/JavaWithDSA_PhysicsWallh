package com.jmu11;



class Demo1{
	static int a;
	static int b;
	int m,n;
	
	static {
		System.out.println("Control in Static Block");
		a=10;
		b=20;
	}
	{
		System.out.println("Control in non static block");
		m=30;
		n=40;
	}
	
	static void disp() {
		System.out.println("Value of static var a:"+a);
		System.out.println("Value of static var b:"+b);
	}
	 void disp1() {
		System.out.println("Value of Non-static var m:"+m);
		System.out.println("Value of Non-static var n:"+n);
	}
}



public class classLoadingStaticNonStatic {

	/* Static block,method,variable are executed first before main() method. 
	 memory is directly assigned in heap memory, not in object.  */
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		Demo1 d=new Demo1();
		Demo1.disp();
		d.disp1();
	}
}
