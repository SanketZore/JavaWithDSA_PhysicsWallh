package com.jmu11;
import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;


public class Employee {
	
	
	static void sum() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1: ");
		float a=sc.nextFloat();
		System.out.print("Enter Num2: ");
		float b=sc.nextFloat();
		System.out.print("Sum is "+(a+b));
	}
	
	static void multiply(float a,float b) {
		System.out.print("Multiply is "+(a*b));
	}
	
	
	static void fun(int ...args) {
		System.out.print(Arrays.toString(args));
	}
	
	static int a=20;
	
	
	static void methodOverloading(int ...a){
		System.out.print(Arrays.toString(a));
	}
	
	static void methodOverloading(StringFunctions ...a){
		System.out.print(Arrays.toString(a));
	}
	
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int c=2;
		while(c*c <= num) {
			if(num%c==0) {
				return false;
			}c++;
		}
		return c*c>num;
	}
	
	static boolean ArmStrong(int num) {
			
		int org=num;
		int sum=0;
		while(num > 0) {
			int rem=num%10;
			num=num/10;
			sum+=rem*rem*rem;
		}
		if(sum==org) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(StringFunctions[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Temperature in Celcius: ");
//		int tempCelc=sc.nextInt();
//		
//		float tempfarh=(tempCelc*9/5)+32;
//		System.out.print("Temp in Farhenite is "+tempfarh);
	
//		System.out.print("Enter Name: ");	
//		String name=sc.next();
		
//		switch(name) {
//		case "sanket":
//			System.out.print(name+" Zore");break;
//		case "Rohit":
//			System.out.print(name+" Ramesh");
//		default :
//			System.out.print("Zore");
//		}
		
//		switch(name) {
//		case "sanket" -> System.out.print(name+" zore");
//		case "Rohit" -> System.out.print("Rohit Zore");
//		default -> System.out.print("Zore");
//		}
		
//		sum();
//		
//		multiply(3,6);
		
		
		
		
//		int[] arr= {1,5,7,9,3};
////		System.out.print(arr[2]);
//		
//		String[][] names= {{"Sanket","Ramesh","Zore"},{"Rohit","Ramesh","Zore"}};
//		System.out.print(Arrays.toString(arr));
		
//		------------------------------- Shadowing--------------
		
//		System.out.print(a);
//		int a=10;
//		System.out.print(a);
		
//		------------------------------- Varargs--------------
		
//		fun(2,5,4,3);
		
		
//		------------------------------- Method Overloading--------------

	
//		methodOverloading(20,20,30,5,8);
//		methodOverloading("Sanket","Rohit");
//		
		
//		------------------------------- isPrime--------------//		------------------------------- isPrime--------------

//		System.out.print(isPrime(12));
		
//		------------------------------- Armstrong--------------
		
//		System.out.print("Enter Number to get Armstrong in Range: ");
//		int n=sc.nextInt();
//		for(int num=100;num<=n;num++) {
//			if(ArmStrong(num)) {
//				System.out.println(num);
//			}
//		}
		
//		------------------------------- Array--------------

		
//		int[] arr=new int[5];
//		arr[0]=25;
//		arr[1]=45;
//		arr[2]=65;
//		arr[3]=85;
//		arr[4]=75;
		
//		for(int i=0;i<3;i++) {
//			System.out.print("arr["+i+"] =" );
//			arr[i]=sc.nextInt();
//		}
//		
//		for(int num:arr) {
//			System.out.print(num+" ");
//		}
//		System.out.print(Arrays.toString(arr));
		
		
//		String[] arrstr=new String[5];
//		for(int i=0;i<3;i++) {
//			System.out.print("arrstr["+i+"] =" );
//			arrstr[i]=sc.next();
//		}
//		System.out.print(Arrays.toString(arrstr));
		
		
		
//		------------------------------- Multi-D-Array--------------

//		int[][] marks= {
//				{4,5,7,8,0,4,8,3},{8,7,9,3},{1,0,2,56}
//		};
//		for(int[] row:marks) {
//				System.out.println(Arrays.toString(row));
//		}
//		
		
		
//		int n=2,m=3;
//		int[][] intarr=new int[n][m];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.printf("intarr[%d][%d] =",i,j );
//				intarr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(intarr[i][j]+" ");
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(intarr[i]));
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
