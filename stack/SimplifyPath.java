package stack;
import java.util.*;
public class SimplifyPath {
	
	static void path(String str) {
		
		String[] arr=str.split("[./]");
		Stack<String> stack=new Stack<>();
		
		for(String ele:arr) {
			stack.push(ele);
			
			if(stack.peek()=="." && ele==".") {
				stack.pop();
			}			
		}
		
//		if(stack.peek()=='/' ) {
//			stack.pop();
//		}
		System.out.println(stack);
		
		
		
	}

	public static void main(String[] args) {
		String str="/home//foo/";
		path(str);
	}

}
