package API;
import java.util.*;

enum Result1{
	PASS,FAIL,NR;
	
}

public class EnumAndSwitchcase {

	public static void main(String[] args) {

		Result1 res=Result1.FAIL;
		
		switch(res) {
		case PASS:System.out.println("PASS");break;	
		case FAIL:System.out.println("FAIL ");break;
		case NR:System.out.println("NO RESULT");
		}
		
	}


}
