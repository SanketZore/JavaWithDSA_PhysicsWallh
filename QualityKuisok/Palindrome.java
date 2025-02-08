package QualityKuisok;

import javax.sound.midi.VoiceStatus;

import com.jmu11.staticMethodandNonStatic;

import Interface.interfaces;

public class Palindrome {
	
	
	public static boolean palindrome(String str) {
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(!String.valueOf(str.charAt(left)).equalsIgnoreCase(String.valueOf(str.charAt(right)))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
	boolean answer=palindrome("maddam");
	System.out.println(answer);
	
//	String nameString="Sanket";
//	String sirString="sanet";	
//	System.out.println(String.valueOf(nameString.charAt(0)).equalsIgnoreCase(String.valueOf(sirString.charAt(0))));
	
	}
}
