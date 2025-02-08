package QualityKuisok;

import Interface.interfaces;

public class ArmStrongNumber {

	
	public static void main(String[] args) {

		int n=153;
		
		String num=Integer.toString(n);
		int sum=0;
		for(int i=0;i<num.length();i++) {
			sum+=Math.pow(Character.getNumericValue(num.charAt(i)),num.length());
		}
		
		if(n==sum) {
			System.out.println("ArmStrong Number");
		}else {
			System.out.println("Not a ArmStrong Number");
		}
		
		
	}

}
