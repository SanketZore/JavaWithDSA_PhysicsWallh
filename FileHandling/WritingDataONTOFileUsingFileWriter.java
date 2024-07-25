package FileHandling;
import java.io.*;
import java.util.*;
public class WritingDataONTOFileUsingFileWriter {

	public static void main(String[] args) throws IOException {

		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
//		file.createNewFile();
		FileWriter fw = new FileWriter(file,true);		// dafault-false   which prevent append, make it true which will enable append.
		fw.write("\nsanket is a good Boy 2");
		fw.write("\n");
		fw.write(65);
		fw.write("\n");
		fw.write(97);
		fw.write("\n");
		char ch[]= {'j','a','v','a'};
		fw.write(ch); 					// Overriding Nature- new data is stored, previous is vanished every time.
		
		fw.flush();     // flush is also used to close resource.
//		fw.close();   //Recomended way- Close is IMP to complete write operation. 
		// Data is went to Buffered-location in wait of new data.
		
	}

}
