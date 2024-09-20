package API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;

public class StreamAPI {

	public static void main(String[] args){


		List<Integer> list=Arrays.asList(2,4,7,5,8);
		
		/*   javap java.util.stream.Stream in terminal.
		 If we want to change the data but it should not change in original data.
		 */
		
		Stream<Integer> streamData=list.stream();
//		streamData.forEach(n->System.out.println(n));
		/*
		 Advantage: stream can be consumed for once not more than that.
		 */
//		long count =streamData.count();
//		System.out.println(count);
		
		/*
		 All Stream methods required implementation (predicate is abstract method it requires implementation means body.)
		 */
		
		Predicate<Integer> pre= i -> i%2==0;
//						or
//		Predicate<Integer> pre=(Integer i)-> {
//			if(i%2==0) {
//				return true;
//			}else {
//				return false;
//			}
//		};
			
			
		Stream<Integer> finalStream= streamData.filter(n->n%2==0).sorted().map(n->n*2);

//		Stream<Integer> filData= streamData.filter(n->n%2==0);
//		Stream<Integer> sortedStream= streamData.sorted();
//		Stream<Integer> sortedStream= filData.sorted();
//		Stream<Integer> mapStream=sortedStream.map(n->n*2);
		
//		System.out.println(sortedStream);
//		sortedStream.forEach(n->System.out.println(n));
		
//		mapStream.forEach(n->System.out.println(n));
		finalStream.forEach(n->System.out.println(n));
		
		
		
	}

}
