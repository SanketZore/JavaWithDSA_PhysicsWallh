package Systenics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=2445;
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
