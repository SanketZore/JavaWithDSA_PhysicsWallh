package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Cricketer implements Serializable{  // Serializable is a empty interface(Marker Interface)-->(interface without abstract method)
	
	private static final long serialVersionUID = 1L;		// required to Deserialize.
	private String name;
	transient private int age;    // if transient key is used then that element does not participate in serialization.
	private int runs;
	
	public Cricketer(String name,int age,int runs) {
		this.name=name;
		this.age=age;
		this.runs=runs;
	}
	
//	public String toString() {
//		return "name: "+name+" age: "+age+" runs: "+runs;
//	}
	
	public void disp() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(runs);
	}
}


public class SerializationAndDeserialization {

	public static void main(String[] args) throws Exception {


		/*
		 -Serialization means converting Object data in sequence of bytes which humans cannot read and saving to file.
		 -To use that bytes-object, we have to use Deserialization to make it readable.
		
		-To make data safe class must implement Serializable() interface is a marker-Interface.
		-marker-Interface --> which do not have any abstract method.
		
		-Serializable internally worked by JVM to convert into bytes.
		
		 */
		
		
		//--------------------Serialization --------------
		
		Cricketer c=new Cricketer("sachin", 44, 30000);
		FileOutputStream fos=new FileOutputStream("pw.txt");
//		BufferedOutputStream bos=new BufferedOutputStream(fos); // efficient
		ObjectOutputStream oos=new ObjectOutputStream(fos); // less efficient
		
		oos.writeObject(c);
//		bos.flush(); 
//		bos.close();
		System.out.println(c);
		
		
		//-------------------Deserialization--------------
		
//		try {
//			   FileInputStream fis = new FileInputStream("pw.txt");
//	           ObjectInputStream ois = new ObjectInputStream(fis);
//	           Cricketer cr = (Cricketer) ois.readObject();
//	           ois.close();
//
//	           System.out.println("Deserialization done!");
//	           cr.disp();
//		}catch(IOException | ClassNotFoundException e){
//            e.printStackTrace();
//		}
		   
		
		
		
	}

}
