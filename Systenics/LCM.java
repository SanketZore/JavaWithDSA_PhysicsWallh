package Systenics;
import java.util.*;

public class LCM {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int n2=sc.nextInt();
		
		int lcm=(n1>n2)?n1:n2;
		
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println("LCM is "+ lcm);
				break;
			}
			lcm++;
		}
		
//		int a=3;
//		int b=5;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+" "+b);
		
	}

}
