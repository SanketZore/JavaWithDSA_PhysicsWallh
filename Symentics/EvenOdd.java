package Symentics;
import java.util.*;
public class EvenOdd {
	
	public void even(int n) {
		int i=0;
		while(i<n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public void odd(int n) {
		int i=0;
		while(i<n) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number:");
//		int n=sc.nextInt();
		
		EvenOdd evenOdd=new EvenOdd();
		System.out.println("Even Numbers: ");
		evenOdd.even(5);
		System.out.println("Odd Numbers: ");
		evenOdd.odd(5);
		
		
		
		
	}

}
