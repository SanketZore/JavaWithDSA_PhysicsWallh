package GenericsAndComparatorAndComparable;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Gen<T>{  // generic class
	T obj;
	
	
	public T getobj() {
		return obj;
	}
	
	public Gen(T obj) {
		this.obj=obj;
	}
	void disp() {
		System.out.println("The type of data is: "+obj.getClass().getName());
	}
}


public class _2_Generics {
	public static void main(String[] args) {
		
		
		Gen<Integer>gen=new Gen<Integer>(10);
		gen.disp();
		System.out.println(gen.getobj());
		
		System.out.println("----------------------");
		Gen<String>gen1=new Gen<String>("sam");
		gen1.disp();
		System.out.println(gen1.getobj());
		
		
		
//		ArrayList<String> list1=new ArrayList<String>();
//		List<String> list2=new ArrayList<String>();
//		Collection<Integer> list3=new ArrayList<Integer>();
////		List<Object> list4=new ArrayList<String>(); // compile time error.
//		List<Integer> list4=new ArrayList<Integer>(); // compile time error.
//		
//		Gen g=new Gen();
//		List<g> list5=new ArrayList<g>(); // compile time error.
//		
		
		
		
		
		
		
		
		
		
		
	}
}
