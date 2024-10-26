package FileHandling;
import java.io.*;
import java.util.*;
public class _2_CreatingFileAndDirectory {

	public static void main(String[] args) throws IOException {

		
		File file1=new File("pw.txt");		// this will check whether there is a file with this name or not, if it is there then it will start refering that file. else it will not create new file.
		System.out.println(file1.exists());  	// checks whether file exists or not.
	
		file1.createNewFile();			// 	to Create New File // this can cause checked exception.
		System.out.println(file1.exists());
		
		
		
		File dir=new File("PW");
		System.out.println(dir.exists());
		dir.mkdir();						// create new directory			
		System.out.println(dir.exists());
		

		
		
	}
}
