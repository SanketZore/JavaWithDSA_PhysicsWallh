package API;

import com.jmu11.staticMethodandNonStatic;

import finalKeyword.finalKeyword;

/*
Enum concept Introduced in java 5

enum --1.5version
 
whenever we have value that cannot be changed through out the program than we use enum.
 
enum is pre-defined named concepts.

final = If any variable value is not changing through out the program. Value remains same

It is rare to use enum in java.


 */

//	Convention when we declare final variable then we declare it with Capital word not mandiatory.

enum week{
	MON, TUE,WED,THU,FRI,SAT,SUN;
}

/*
We dont have to use keyword like public,static. 
MON is variable, value and constant.
MON,TUE,WED,... are our own datatypes, it is a type of week.

we cannot create object of abstract class and interface in similar way we cannot create object of enum.


we can use enum to define a group of named constants.
Example1:
 enum Month{
  JAN, FEB, MAR,... DEC  
 }
Example2:
 enum Color{
  RED, BLUE,GREEN;  
 }

By using enum we can define our own data types which are also come enumerated data types.
 

 */
public class Enum {

//	static final int =45;// no need for this in enum
	
	enum Result{
		PASS,FAIL,NORESULT;
	}
	
/*
 java.lang.
 */
	public static void main(String[] args) {

		week w=week.TUE;   // it is own data type.
		System.out.println(w);
		
		int i=week.FRI.ordinal(); // index of enum.
		System.out.println(i);
		
		week[] wr=week.values();
		for(week wi:wr) {
			System.out.println(wi+" :"+wi.ordinal());
		}
		
//		Result result=Result.FAIL;  // we can define enum inside or outside of class.
//		System.out.println(result); 
		
		
		
	}

}
