package queue;
import java.util.*;

public class stackUsingQueue {
	
	static Queue<Integer> queue1=new LinkedList<>();
	static Queue<Integer> queue2=new LinkedList<>();
	
	static void push(int data) {
		if(queue1.size()==0) {
			queue1.add(data);
		}else {
			while(queue1.size()!=0) {
				int ele=queue1.remove();
				queue2.add(ele);				
			}
			queue1.add(data);
			while(queue2.size()!=0) {
				int ele=queue2.remove();
				queue1.add(ele);
			}
		}
	}
	
	static boolean empty() {
		return queue1.isEmpty();
	}
	
	static int peek() {
		int ele;
		if(queue1.size()==0) {
			System.out.println("Stack is Empty");
			ele=-1;
		}else {
			ele=queue1.peek();			
		}
		return  ele;
	}
	
	static int pop() {
		if(queue1.size()==0 && queue2.size()==0) {
			System.out.println("Stack is Empty");
			System.exit(0);
		}
			return queue1.poll();
	}
	

	public static void main(String[] args) {

		stackUsingQueue s=new stackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(queue1);
		System.out.println("Remove Element: "+s.pop());
		System.out.println("Remove Element: "+s.pop());
		System.out.println("Remove Element: "+s.pop());

		System.out.println(s.peek());
		System.out.println(s.empty());
//[1 2 3 4]        [4 3 2 1]
	}

}
