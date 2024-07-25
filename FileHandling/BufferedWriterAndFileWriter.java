package FileHandling;

import java.io.*;
import java.io.IOException;

public class BufferedWriterAndFileWriter {

	public static void main(String[] args) throws IOException {

		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);  // to run BufferedWriter there is compulsion of using FileWriter.
		
		bw.write("javasanket");
		bw.newLine();
		bw.write(65);
		bw.newLine();
		char[] ch= {'p','w','s','j'};

		bw.write(ch);
		bw.flush();  // 100% write. It makes sure write operation will get successfull.
		bw.close();	// otherwise close() is also enough.
		
		
		// if we close BufferredWriter then automatically, internally FileWriter will get close.
		
		//BufferedWriter is the way of writing data into file.
		
	}

}
