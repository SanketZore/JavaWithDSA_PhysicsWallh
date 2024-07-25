package com.jmu11;


class student{
	private int roll,age;
	private String name;
	
//	public void setData() {
//		age=20;
//		roll=1;
//		name="sanket";
//	}
	
	student(String name,int age ,int roll){
		this.roll=roll;
		this.age=age;
		this.name=name;
	}
	
	public void setData(int roll,int age,String name) {
		this.roll=roll;
		this.age=age;
		this.name=name;
	}
	public int getRoll() {
		return roll;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
	public void show() {
		System.out.printf("%d %s %d",roll,name,age);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		student obj=new student("sanket",20,2);
//		obj.roll=1;
//		obj.name="Sanket";
//		obj.age=20;
//		obj.setData();
//		obj.show();
//		obj.setData1(1,20,"sanket");
//		obj.show();

//		obj.setData(1,20,"sanket");
		int age=obj.getAge();
		int roll=obj.getRoll();
		String name=obj.getName();
//		
		System.out.printf("%d %s %d",roll,name,age);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
