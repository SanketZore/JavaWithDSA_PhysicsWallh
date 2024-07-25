package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.jmu11.staticVariable;

public class StreamOperationsDemo {

	public static void main(String[] args) {
		List<String> strList= Arrays.asList("","NewDelhi","Mumbai","","Pune","","Dehradhun","","Nashik");
		System.out.println(strList.isEmpty());
		
		Stream<String> stream=strList.stream();
		long result =StreamOperations.countEmptyString(stream);
		System.out.println("The number of empty strings are= "+result);
		
		List<Integer> numList=Arrays.asList(2,7,8,9,20);
//		Stream<Integer> Stream1= numIntegers.stream(); 
		StreamOperations.showStatistics(numList.stream());
	}
}
