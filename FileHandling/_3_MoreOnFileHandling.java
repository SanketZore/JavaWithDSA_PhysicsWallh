package FileHandling;

import java.io.File;
import java.io.IOException;

public class _3_MoreOnFileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File dir=new File("PWJAVA");
////		System.out.println(dir.isDirectory());
//		dir.mkdir();
//		System.out.println(" dir is refering to directory PWJAVA:"+dir.isDirectory());
//		
//		
//		File file=new File(dir,"pwskill.txt");  // creating file inside directory.
//		file.createNewFile();
//		System.out.println("file is refering to pwskill.txt: "+ file.isFile());
//		
		
		int count=0;
		File f=new File("PWJAVA");
//		File f=new File("D://VPP COE/DSA with JAVA/JAVA PROGRAMS/stack/");
		String[] str= f.list();
		for(String name:str) {           // list names of files in Directory.
			System.out.println(name);
			count++;
		}
		System.out.println("Number of Files in PWJAVA Directory: "+count);
		
		
	}

}
