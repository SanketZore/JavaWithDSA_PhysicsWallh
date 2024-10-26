package FileHandling;

class Student{
	private String name;
	private int age;
	private String city;
	
	public Student(String name,int age, String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String toString() {
		return "Name : "+name+" | Age : "+age+" | City : "+city;
	}
	// to print values using object reference use toString method.
	
}


public class _1_IOoperations {

	public static void main(String[] args) {

		Student st1=new Student("Sanket",20,"Mumbai");
		System.out.println(st1);
		// to print values using object reference use toString method.
		
		Student st2=new Student("Rohit", 18, "Pune");
		System.out.println(st2);
		
	}

}
