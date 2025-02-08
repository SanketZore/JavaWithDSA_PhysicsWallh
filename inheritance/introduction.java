package inheritance;

// Diamond shape problem
// this() method is used to call constructor of same class.
// super() method is used to call constructor of parent class.
// constructor doesn't get inherited.


class Human{ // extends object
	int age;
	private String name;
	
	Human(){
		System.out.println("Human Class Constructor");
	}
	
	void sleep() {
		age=10;
		System.out.println("Human needs good Sleep");
		System.out.println(age);
	}
}

class Student extends Human{
	
	void disp() {
		System.out.println("The age is :"+ age);
//		System.out.println("The name is :"+ name);
	}
}
public class introduction {
	public static void main(String[] args) {
		
		Human hum=new Human();
		hum.hashCode();
//		Student st=new Student();
//		st.sleep();
//		st.disp();
//		st.Human();
		
	}

}
