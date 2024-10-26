package Systenics;

public class SimplePrime {

	public static boolean primeOrnot(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int num=19;
		for(int i=0;i<=num;i++) {
			if(primeOrnot(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
