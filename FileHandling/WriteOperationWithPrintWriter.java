package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteOperationWithPrintWriter {

	public static void main(String[] args) throws IOException{

		File dir=new File("PW");
		File file=new File(dir,"pw.txt");
		
		// 
		FileWriter fw=new FileWriter(file,true);
		PrintWriter pw=new PrintWriter(fw);
		pw.write(97);			//this will write ASCII value of 97 in file.
//		pw.write("\nede")     // insted of this statement to get into new line .we can use bellow statement.
		pw.println("\njava");
		pw.print(100);  // this will store 100 not ASCII value.
		pw.println(false);
		pw.println(50.23);
		pw.println('X');
		pw.close();
		
		
	}

}
