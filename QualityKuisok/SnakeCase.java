package QualityKuisok;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Camel Case String: ");
		String str1=sc.nextLine();
		
		
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str1.length()) {
			
			if(Character.isUpperCase(str1.charAt(i))) {
				sb.append("_").append(Character.toLowerCase(str1.charAt(i)));				
			}else {
				sb.append(str1.charAt(i));				
			}
			i++;
		}
		
		System.out.println(sb.toString());
		
		
		
		
	}

}
