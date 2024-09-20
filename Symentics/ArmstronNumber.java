package Symentics;

public class ArmstronNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153;
		String s=Integer.toString(n);
//		int sum=0;
//		for(int i=0;i<s.length();i++) {
//			int digit=n%10;
//			sum+=Math.pow(digit,s.length());
//			n/=10;
//			System.out.println(sum);
//		}
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=Math.pow(Character.getNumericValue(s.charAt(i)), s.length());
		}
		
		
		
		if(n==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Arnstrong");
		}
		
	}

}
