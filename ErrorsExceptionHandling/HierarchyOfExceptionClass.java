package ErrorsExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Unchecked exception and Checked exception.

public class HierarchyOfExceptionClass {

	public static void main(String[] args) {
		
		int result=7/0;			//Unchecked or Runtime exception.
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();  //checked exception.
		} catch (IOException e) {
			e.printStackTrace();
		}      
	}

}
