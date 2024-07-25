package com.jmu11;

import java.util.Scanner;    


public class StringCodeWithHarry {
    

    public static void main(String[] args){


/*
String Method are operate on java strings. They can be used to find the length of the string, convert to lowercase,etc

some of the commonly used Strings methods are: 

String name = "Sanket";

1) name.length() = Returns the  length of the string name (6 in this case)

2) name.tolowercase() = Returns the new string which has all the lowerCharacters from the string name.

3) name.toUpperCase() = Returns new string which has all the lowerCase characters form the string name.

 */


// String Name="Sanket";                 // 1st method of writing string in java
// String SurName=new String("Zore");    // 2nd method of writing string in java
// System.out.print(Name);
// System.out.print(SurName);


/////////////// name.length ///////////////

// String boy="Sanket";
// int Value = boy.length();
// System.out.print(Value);


////////////// name.toUpperCase //////////////

// String man=boy.toLowerCase();
// system.out.println(man);
// System.out.println(man.toUpperCase());


////////////// name.toLowerCase //////////////

// String Name=boy.toUpperCase();
// System.out.print(Name.toLowerCase());


////////////// 4) name.nonTrimmedString //////////////

/* Trim the BlankSpaces from left and right of the string */

 String nonTrimmedString ="    Sanket is a good boy.   ";
 System.out.println(nonTrimmedString);     // Spaces not removed
 String TrimmedString=nonTrimmedString.trim();
 System.out.println(TrimmedString);         // Spaces removed


//////////////  5) name.subString(starts_From[input int]) //////////////

/* 
String name="Harry";
Returns the substring which start from 3 to the end of the String.
retrns "ry"  
 */

// String Name= "sanket is a good boy";
// System.out.print(Name.substring(5)); // skip first four index_values and start from five.



//////////////  6) name.subString(starts_From[input int],ends_with[input int]) //////////////

/* 
String name="Harryis a good boy";
System.out.print(name.substring(2,5));
Returns the substring which starts from r[2] and end at 5[i].
retrns "rryi" .

Return a substring from start index to the end index. start index is included and end is excluded.
 */

// String name="Harryis a good boy";

// System.out.println(name.substring(2,10));
// System.out.print("Enter a string: ");
// Scanner game=new Scanner(System.in);
// System.out.println(game.next());         // only works in case of input



//////////////  7) name.replace(char'r',char'm') //////////////

/*
 Repalces a new string after replacing r with p. rohit is returned in this case.
 */

// String name="Rohit";
// String same="What is your name are you a student. What is your name?";
// System.out.println(name.replace('R','M'));        
// System.out.print(same.replace("is","Are"));        



//////////////  8) name.startsWith("san")  OR  9) name.endsWith("san") //////////////

/*
returns true if name starts with string 'san'. true in this case.
returns true if name ends with string "et" . true in this case.

 */

// String name="sanket";
// System.out.println(name.startsWith("san"));
// System.out.print(name.endsWith("et"));



///////////////// 10) name.charAt(4) /////////////////
/*
Returns character at the given index position 'e' in this case

 */

// String name="Sanket is smart";
// System.out.print(name.charAt(4));      


///////////////// 11) name.indexOf("e")  OR   12)  name.indexOf("e",input int())  /////////////////
/*
returns the index of the given string. for ex: name.indexOf("e") returns 4 which is the first occurance of 'e' in string "sanket", -1 OtherWise.

Returns the index of the given string starting from the index (int).   -1 is returned in this case.
 */

// System.out.println(name.indexOf("e"));
// System.out.print(name.indexOf("e" ,5));     // 'e'  Will be Start finding by skiping first 6 index_values.



///////////////// 13) name.lastIndexOf("e") OR 14) name.lastIndexOf("a",11) /////////////////

/*
Returns the last index of the given string. 12 in this case!

Return the last index of the given string before index 1.

finding of 'e' will get started finding from last of the string.

 */

// String name="sanket is smart";
// System.out.println(name.lastIndexOf("a"));
// System.out.print(name.lastIndexOf("a",11)); 



///////////////// 15) name.equals("Sanket")  OR 16) name.equalsIgnoreCase("sanket") /////////////////

/*
Returns true if the given string is equal to "is" false otherwise [case sensitive]
 */

// String name="Sanket";
// System.out.println(name.equals("Sanket"));
// System.out.print(name.equalsIgnoreCase("sanket"));


// 17) Escape Sequences

/* 

Sequence of characters after backslash '\'
 =Escape Sequences Characters

Escape sequence characters consist of more than one characters but represents one character when used within the string.

Example : \n  ,\t  ,\'  ,\\   , etc

 Google it --- java oracle sequence
 */


// String Greet="Good Morning sir,\n \t We Warmly, Welcome you to our factory. \nThanking You,";
// System.out.print(Greet);   






/********************************************** PRACTICE SET **********************************************/


/*
Question 1) Write a program to convert a string to lowercase.
 */

//  String name="Sanket zore";
// String name=name.toLowerCase();
//  System.out.println(name);
// String name=name.toUpperCase();
// System.out.print(name);


/*
Question 2) Write a program to replace spaces with underscore.
 */

// String man="   Sanket   zore   ";
// String man=man.replace(" ","_");
// System.out.print(man);


/*
Question 3) Write a program to fill in a letter template which looks like below:
Letter ="Dear <|name|>, thanks a lot"
Replace <|name|> with a string (some name)
 */


//  Scanner name=new Scanner(System.in);       // not works
// String name="sanket";                          // Works
// String letter="Dear <|name|>,\n \tThanks a Lot. ";
// String letter=letter.replace("<|name|>",name);
// System.out.print(letter);



/*
Question 4) Write a program to detect double and triple spaces in a string.
*/

// String Sentence="sanket  is a very very  smart    guy.";
// System.out.println(Sentence.indexOf("   "));
// System.out.print(Sentence.lastIndexOf("  "));


/*
Question 5) Write a program to format the following letter using escape Sequence charcters.
Letter =    Good Morning sir,
                 We Warmly, Welcome you to our factory.
            Thanking You;

*/

// String Greet="Good Morning sir,\n \t We Warmly, Welcome you to our factory. \nThanking You,";
// System.out.print(Greet);   





}
}


