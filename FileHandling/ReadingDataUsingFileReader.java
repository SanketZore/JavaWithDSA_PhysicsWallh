package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataUsingFileReader {

	public static void main(String[] args) throws IOException {

		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		FileReader fd=new FileReader(file);
		int i=fd.read();    // it will give each character decimal value.
		
//		System.out.println((char)i);
		
		while(i!=-1) {
//			System.out.println(i+" ----> "+(char)i);
			System.out.print((char)i);
			i=fd.read(); 			// if there are 1000 characters then we have to invoke read method for 1000 times it is not a good approach.  
		}
	}

}
