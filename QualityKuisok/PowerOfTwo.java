package QualityKuisok;

import Interface.interfaces;

public class PowerOfTwo {

	
	public boolean powerOfTwoOrNot(int num) {
		if(num<=0) {
			return false;
		}
		
		while(num%2==0) {
			num/=2;
		}
		
		return num==1;
	}
	
	public static void main(String[] args) {


		PowerOfTwo pow=new PowerOfTwo();
		System.out.println(pow.powerOfTwoOrNot(64));
		
		
		
	}

}
