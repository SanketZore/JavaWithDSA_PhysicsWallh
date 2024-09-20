package API;

import java.lang.annotation.*;
import java.lang.annotation.Target;
import java.lang.classfile.instruction.NewMultiArrayInstruction;

import Interface.interfaces;

//@Target({ElementType.TYPE})     // annotation for class.
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD}) // annotation for Multiple fields. // We are passing enum values.
@Retention(RetentionPolicy.RUNTIME)  // Power of this annotation will be till JVM.
@interface CricketPlayer{    // custom annotation.
	
	String country() default "India";    // we can pass dafault value in annotation.
	int age() default 34;
}


@CricketPlayer(country = "India")
class Virat{
	
//	@CricketPlayer
	@CricketPlayer(country = "India")
	private int innings;
	private int runs;
	
//	@CricketPlayer
	@CricketPlayer(age=45)
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
}




public class CustomAnnotationAndRetrievingValueUsingReflectionAPI {

	
	public static void main(String[] args) {

/*
- In java, an annotation is a type of metadata that can be added to a class,method, field, parameter, or other program element to provide additional information about the element.

- Annotation are used by the compiler, runtime, and other tools to generate code, perform  runtime checks. and provide documentation and other information.

- Annotations are represented using the "@" symbol followed by the name of the annotation, and they can take parameters that provide additional information.
 
- Inbuild annotation - Java.lang.annotation.Annotation

 */
		
		Virat virat=new Virat();
		virat.setInnings(200);
		virat.setRuns(6500);
		System.out.println(virat.getRuns());
		System.out.println(virat.getInnings());
		
		Class c =virat.getClass();
	    Annotation  a=c.getAnnotation(CricketPlayer.class);
	    CricketPlayer cp= (CricketPlayer)a;
	    
	    String country =cp.country();
	    System.out.println(country);
	    int age=cp.age();
	    System.out.println(age);
		
	}

}
