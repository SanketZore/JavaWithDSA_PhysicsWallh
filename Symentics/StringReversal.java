package Symentics;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="sanket";
		
//		StringBuilder sb=new StringBuilder(name);
//		System.out.println(sb.reverse().toString());

		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
//			System.out.print(name.charAt(i));
			reverse+=name.charAt(i);
		}
		System.out.println(reverse);
		
	}

}
