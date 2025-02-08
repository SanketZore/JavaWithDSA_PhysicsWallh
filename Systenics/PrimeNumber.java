package Systenics;
import java.util.*;

public class PrimeNumber {

	public static Boolean primeList(int n) {
		int num=2;
		if(n<=1) {
			return false;
//			System.out.println("Number is Not Prime Number");						
		}
		if(num==n) {
			return true;
//			System.out.println("Number is Prime Number");			
		}if(n%2==0){
//			System.out.println("Number is Not Prime Number");			
			return false;
		} else if(n>=2){
			Boolean isPrime=true;	
			
			for(int i=3 ; i<=Math.sqrt(n) ; i+=2) {
				if(n%i==0) {     // if mod value gets zero then it means there is another number lesser than given number which is divisible by that given number.
//					System.out.println("Number is Not Prime Number");			
//					isPrime=false;
					return false;     
				}
			}
			if(isPrime) {
//				System.out.println("Number is Prime Number");
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number :");
		int n=sc.nextInt();
		
				
		for(int i=1;i<n;i++) {
			if(primeList(i)) {
				System.out.println(i);
				
			}
		}
		
		
	}
}
