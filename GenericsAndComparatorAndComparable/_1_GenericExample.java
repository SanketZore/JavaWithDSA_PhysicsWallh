package GenericsAndComparatorAndComparable;
import java.security.AllPermission;
import java.util.*;
class Student1{
	
	private String name;
	private int id;
	
}

class Employee{
	private String name;
	private int id;
}

public class _1_GenericExample {
	
	public static void main(String[] args) {
		
		Student1 student1=new Student1();
		Student1 student2=new Student1();
		
		Employee employee=new Employee();
		
		ArrayList<Student1> al=new ArrayList<>(); 
		al.add(student1);
		al.add(student2);
//		al.add(e);
	}
}
