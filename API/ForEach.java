package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {

		
//		List<Integer> list1=new ArrayList<Integer>();
//		list1.add(2);
//		list1.add(4);
//		list1.add(6);
//		list1.add(8);
//		list1.add(9);
//		System.out.println(list1);
		
		List<Integer> list2=Arrays.asList(2,4,6,8,9); // another way to create Arraylist
		System.out.println(list2);
		
//		for(Integer i:list2) {   // we can also use Integer instead of Object.
//			System.out.println(i);
//		}
		
//		Consumer<Integer> cons=new Consumer<Integer>() {   
//			/*
//			 We are Directly openning a class body which means it is a Anonymous InnerClass.
//			 */
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//			}
//		};
		
//		Consumer<Integer> cons=(Integer i)-> {   
//				System.out.println(i);
//		};
		
		Consumer<Integer> cons=i->System.out.println(i);
		
		
//		list2.forEach(n-> System.out.println(n));  // for each expects to give implementation of Consumer interface(it is a functional interface).
		list2.forEach(cons);
	}

}
