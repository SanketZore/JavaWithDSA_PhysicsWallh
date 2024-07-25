package SYSTEMDESIGN;

import com.jmu11.staticMethodandNonStatic;

public class Samosa {

	private static Samosa samosa=new Samosa(); //object is kept ready first only.
	//Eager way of creating singleton object.
	// In Eager way object is made first then serve.
	//If object is not created then resource gets waste(memory waste).
	public static Samosa getSamosa() {
		return samosa;
	}
	
}
