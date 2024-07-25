package queue;
import java.util.*;
public class Best_stackUsingQueue {

    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();
	
	public static void push(int x) {
		while(queue1.size()!=0) {
			int ele=queue1.remove();
			queue2.add(ele);				
		}
		queue1.add(x);
		while(queue2.size()!=0) {
			int ele=queue2.remove();
			queue1.add(ele);
		}
	}


public static int pop() {
		return queue1.poll();
}

public static int top() {
	return  queue1.peek();
}

public static boolean empty() {
    return queue1.isEmpty();
}
	public static void main(String[] args) {

		push(1);
		push(2);
		push(3);
		System.out.println(queue1);
		pop();
		pop();
		System.out.println(queue1);
		System.out.println(top());
		System.out.println(empty());
		

	}

}
