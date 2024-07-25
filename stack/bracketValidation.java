package stack;
import java.util.*;
public class bracketValidation {
	
	
	 static boolean bracketValidation(String str) {
		
		 char[] arr=str.toCharArray();
			
			Stack<Character> stack=new Stack<>();
			
			for(char ele:arr) {
				if(ele=='[' || ele=='('|| ele=='{') {
					stack.push(ele);
					continue;
				}else if(stack.empty()) {
					return false;
				}
				char top=stack.pop();
				if(top=='[' && ele!=']' || top=='{' && ele!='}' || top=='(' && ele!=')') {
					return false;
				}
			}
			
			return stack.empty()==true;
	}

	public static void main(String[] args) {


		String str="([](){})";
		
		
		
		System.out.println(bracketValidation(str));
		
		
	}

}
