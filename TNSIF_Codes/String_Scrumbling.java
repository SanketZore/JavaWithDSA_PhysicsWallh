package TNSIF_Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class String_Scrumbling {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		
		ArrayList<Character> letters=new ArrayList<Character>();
		
		for(char ch:str.toCharArray()) {
			letters.add(ch);
		}
		Collections.shuffle(letters);
		
		StringBuilder sBuilder=new StringBuilder();
		for(Character ch:letters) {
			sBuilder.append(ch);
		}
		System.out.println(sBuilder);
		
	}

}
