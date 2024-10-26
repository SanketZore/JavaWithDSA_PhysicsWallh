package Systenics;


public class Palindrome {

	public boolean palindrome(String name) {
		int left=0;				
		int right=name.length()-1;
		while(left<right) {
			if(name.charAt(left)!=name.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="madam";
//		System.out.println(palindrome(name));
		
		Palindrome palindrome=new Palindrome();
System.out.println(palindrome.palindrome(name));

		
	}

}
