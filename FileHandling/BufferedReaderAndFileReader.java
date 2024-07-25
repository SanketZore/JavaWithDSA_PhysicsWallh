package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderAndFileReader {

	public static void main(String[] args) throws IOException {

		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		FileReader fr=new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		
		String line= br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();    // after completing first line go to next line.
		}
		
		
	}

}
