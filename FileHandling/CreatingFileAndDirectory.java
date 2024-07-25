package FileHandling;
import java.io.*;
import java.util.*;
public class CreatingFileAndDirectory {

	public static void main(String[] args) throws IOException {

		
		File file1=new File("pw.txt");
		System.out.println(file1.exists());  	// checks whether file exists or not.
	
		file1.createNewFile();			// 	Create New File
		System.out.println(file1.exists());
		
		
		File dir=new File("PW");
		System.out.println(dir.exists());
		dir.mkdir();						// create new directory			
		System.out.println(dir.exists());
		

		
		
	}
}
