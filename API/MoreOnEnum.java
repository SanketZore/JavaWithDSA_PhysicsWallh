package API;


enum Result{
	PASS,
	FAIL,NORESULT;  
	
	// public static final Result PASS=new Result();
	
	// public static final Result FAIL=new Result();
	
	// public static final Result NORESULT=new Result();
	
	int marks;   // We can define variables and methods in Enum.
	
	Result(){			// constructor is called based on the No.of Constants in enum. if there are 3 constants in Enum then constructor is called for three times.
		System.out.println("yoyo Constructor Enum");
	}
	void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
}


public class MoreOnEnum {

	public static void main(String[] args) {

		Result.PASS.setMarks(60);
		int m1= Result.PASS.getMarks();
		System.out.println(m1);
		
		int m2=Result.FAIL.getMarks(); // we will get default value as we have not assigned any value.
		System.out.println(m2);
		
		Result.NORESULT.setMarks(40);
		int m3=Result.NORESULT.getMarks();
		System.out.println(m3);
				
	}

}
