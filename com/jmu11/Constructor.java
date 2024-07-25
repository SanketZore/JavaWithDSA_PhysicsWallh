package com.jmu11;



class Demo{
	private String name;
	private int age;
	private int a;
	private int b;
	
//	public Demo() {
//		         Default constructor with 0 parameters.
//	}
	
	Demo(){
		super();
		System.out.println("Default Constructor is Called");
		name="Rohan";
		age=30;
	}
	
	Demo(String name){
		this("samOK",50);
		this.name=name;
//		age=20;
	}
	Demo(String name,int age){
		System.out.print("Both values");
		this.name=name;
		this.age=age;
	}                     
	
	public Demo(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		System.out.println(age);
		}
}
public class Constructor {
	
	public static void main(String[] args) {
	
		Demo d=new Demo("rohan");
		d.disp();
		
		
		
		
	}	
}
