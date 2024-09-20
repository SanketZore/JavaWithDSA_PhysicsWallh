package API;

import java.util.ArrayList;

import java.time.*;

//import java.util.Date;



public class DateAndTimeAPI {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		Date in java is consist in --> util package
			 					   --> sql package
		 */
		
		
//		java.util.Date dt=new java.util.Date();  //Date Class in util package is zero parameterized.
//		// gives (day month date and time).
//		// To get all Methods of util.java.Date package use (javap java.util.Date) in terminal.
//		System.out.println(dt);
//		
//		long timeInMs= dt.getTime();  
//		
//		java.util.Date dt1=new java.sql.Date(timeInMs); // Date in sql package is parameterized.
//		
//		System.out.println(dt1);   // only date is given by date in sql.
//		
////		java.util.ArrayList eList=new java.util.ArrayList<>();  // this is also a Valid Syntex.

		
		/*
		 -Joda.organization java proposed that to manage date and time efficiently use (joda time API) from java 8.
		
		-to manage Date and Time Efficiently in java then use Joda Time API( or Joda API).
		
		- The API developed by joda.org and available in java in the form of "java.time" package. 
		
		*/
		
		/*
		 There is no constructor in java.time.LocalDate 
		 so we have to use "now()" keyword, now method return type is "java.time.LocalDate", we directly call [LocalDate now() method]
		 */
		
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.println(day+"/"+month+"/"+year);
		
		LocalTime time=LocalTime.now();
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		int nanoSec=time.getNano();
		System.out.println(hour+"."+minute+"."+second+"."+nanoSec);
		
		
	}

}
