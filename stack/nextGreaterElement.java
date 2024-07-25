package stack;
import java.util.*;

/** -------------- Code Not Working.---------**/

public class nextGreaterElement {

	public static void main(String[] args) {

int[] num1= {4,1,2};
int[] num2= {1,3,4,2};

Stack<Integer> stack1 =new Stack<>();

for(int i=0;i<num1.length;i++) {
	for(int j=0;j<num2.length;j++) {
		if(num2[j]==num1[i]) {
			for(int k=j;k<num2.length;k++) {
				if(num2[k]>num2[j]) {
					stack1.push(num2[k]);
				}else {
					stack1.push(-1);
				}
			}
		}else {
			continue;
		}
	}
}

	System.out.println(stack1);

		
		
		
		
	}

}
