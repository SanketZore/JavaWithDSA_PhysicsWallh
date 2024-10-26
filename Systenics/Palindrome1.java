package Systenics;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
		
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse+=name.charAt(i);
		}
		
		if(name.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
