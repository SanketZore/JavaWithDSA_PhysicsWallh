package API;


enum Result1{
	PASS,FAIL,NR;
	
}

public class EnumAndSwitchcase {

	public static void main(String[] args) {

		Result1 res=Result1.NR;
		
		switch(res) {
		case PASS:System.out.println("PASS");break;	
		case FAIL:System.out.println("FAIL ");break;
		case NR:System.out.println("NO RESULT");
		}
		
	}


}
