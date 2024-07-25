package GenericsAndComparatorAndComparable;
import java.util.*;




class Student implements Comparable<Student>{
	int marks;
	int age;
	String name;

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String toString() {  // comparator
		return ""+marks+" - "+age+" - "+name;
	}
	
	public int compareTo(Student a) {    // comparable.
		if(this.age>a.age) {
			return 1;
		}else {
			return -1;
		}
	}

	
	public Student(int marks,int age,String name) {
		this.marks=marks;
		this.age=age;
		this.name=name;
	}
	
	
	/*
	toString  
	- if any class don't have parent class then by default, object is the parent class.
	- whenever we create a object of class and try to print the reference address we get hash-address, if you want to print data while referring object instead of hash-address then we have to override toString() method to change the behavior of reference or to print the data. 
	*/
}


//class Alpha implements Comparator<Student>{   // Traditional Way.
//	public int compare(Student a,Student b) {
//		if(a.age>b.age) {
//			return 1;
//		}else {
//			return -1;
//		}
//	}
//	
//}

class Marks implements Comparator<Student>{
	public int compare(Student a,Student b) {
		if(a.marks>b.marks) {
			return 1;
		}else {
			return -1;
		}
	}
}


public class _4_1ComparatorVSComparable {

	public static void main(String[] args) {

		Student st1=new Student(45,18,"Rohit");
		Student st2=new Student(55,21,"Sanket");
		Student st3=new Student(65,20,"Himanshu");
//		System.out.println(st1);
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(st1);
		list1.add(st2);
		list1.add(st3);
		System.out.println(list1);
		
//		Collections.sort(list1);   // we get compile time error.
		
		
		/*
		 Comparator is a inbuild interface which consist of  one compare method.
		 
		 
		 */
//		Alpha a=new Alpha();  
//		Collections.sort(list1,a);  
		
//		Comparator<Student> com=(Student s1,Student s2)->{
//			if(s1.age>s2.age) {
//				return 1;
//			}else {
//				return -1;
//			}
//		};
//		Collections.sort(list1,com);  //calles using comparator.
		
		Collections.sort(list1);  // called using comparable./Internally calls compareTo method.
		System.out.println("Sorted by Age: "+list1);
		Marks b=new Marks();
		Collections.sort(list1,b);
		System.out.println("Sorted by Marks: "+list1);
		
		/*
		 When to use comparable and comparator, whenever we want to sort objects using Collections.sort(), if the class of objects we want to sort is accessible or modifiable to us then use Comparable Interface(Directly implements by Comparable Interface and create compareTo() method in it.)
		 
		 If the class of objects we want to sort is not accessible or not modifiable then use Comparator, if we are using comparator class then we dont have to modify class of objects, we implements using traditional method or by lambda Expression.
		 
		 */
		
	}

}
