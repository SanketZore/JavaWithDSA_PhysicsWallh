package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MoreOnFileReader {

	public static void main(String[] args)throws IOException{
		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		
		FileReader fd=new FileReader(file);
		
		char ch[]=new char[(int)file.length()];   // length method is providing long so we downcasted to int.
		
		fd.read(ch);
		for(char data:ch) {
			System.out.print(data);
		}
		
		
	}

}
