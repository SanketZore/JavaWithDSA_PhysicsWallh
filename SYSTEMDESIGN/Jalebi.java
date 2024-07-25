package SYSTEMDESIGN;

public class Jalebi {

	//Constructor used to create object.
	private static Jalebi jalebi;
	private Jalebi() {   // if keep public then many objects can be created. if keep private no object can be created.
		//constructor.
	}
	// Lazy way of creating singleton object.
	// In lazy way object is created on request.
	public static Jalebi getJalebi() {  // synchronized= one thread at a time.
		synchronized (Jalebi.class) { //one thread at a time.
			if(jalebi==null) { // will execute only first time
				jalebi=new Jalebi();			
			}
		}
		return jalebi;
	}

	//only one jalebi will be created not simultaneously.
}
