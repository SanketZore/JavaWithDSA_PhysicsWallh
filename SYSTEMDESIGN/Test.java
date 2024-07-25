package SYSTEMDESIGN;

public class Test {

	public static void main(String[] args) {

//		Jalebi jalebi=new Jalebi();
		
		
		Jalebi jalebi1=Jalebi.getJalebi();
		System.out.println(jalebi1.hashCode());
		Jalebi jalebi2=Jalebi.getJalebi();
		System.out.println(jalebi2.hashCode());
		
		Samosa samosa=Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		Samosa samosa1=Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
	}

}
