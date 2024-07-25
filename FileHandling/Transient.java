package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Cricket implements Serializable{  
	
	private static final long serialVersionUID = 1L;		// required to Deserialize.
	String name;
	transient int age;    // if transient key is used then that element does not participate in serialization.
	int runs;				// trainsent member of class will not participate in serialization.
	
	public Cricket(String name,int age,int runs) {
		this.name=name;
		this.age=age;
		this.runs=runs;
	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(runs);
	}
}

public class Transient {

	public static void main(String[] args) throws Exception {

		//--------------------Serialization --------------

//		Cricket c=new Cricket("sachin", 44, 30000);
//		c.disp();
//		FileOutputStream fos=new FileOutputStream("pw.txt");
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		ObjectOutputStream oos=new ObjectOutputStream(bos);
//		
//		oos.writeObject(c);
//		oos.flush();
//		oos.close();
		
		//--------------------Deserialization --------------

		
		FileInputStream fis=new FileInputStream("pw.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		Cricket cr=(Cricket) ois.readObject();
		cr.disp();
		
		
		
		
	}

}
