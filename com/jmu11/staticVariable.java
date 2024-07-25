package com.jmu11;
import java.util.*;


class Farmer{
	int pa;
	float td;
	static float ri;
	float si;
	
	static {
		ri=4.5f;		
	}
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pelase Enter the amount required ");
		pa=sc.nextInt();
		System.out.println("Please Enter the time Duration ");
		td=sc.nextFloat();
		
	}
	
	void compute() {
		si=(pa*td*ri)/100f;
	}
	
	void display() {
		System.out.println("Simple Intrest is :"+si);
	}
	
	
}
public class staticVariable {
	
	public static void main(String[] args) {
		
		//Static variables can only be accessed by static methods.
		//Static variables can be accessed from anywhere in the program, without having to create an instance of the class.
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		f1.input();
		f1.compute();
		f1.display();
		
//		f2.input();
//		f2.compute();
//		f2.display();
	}
}
