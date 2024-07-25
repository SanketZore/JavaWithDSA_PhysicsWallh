package com.jmu11;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysCodeWithHarry {

    public void add(int num) {
        int sum = num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Classroom of 500 students - you have to store marks of these 500 students
         * You have 2 Options:
         * 1. Create 500 variables
         * 2. Use Arrays (Recommended)
         * 
         * Array is a collection of similar types of data
         * 
         * Use Case: Storing Marks of 5 students
         * 
         * int[]marks=new int[5] --> [DataType[] ArrayName;]
         ** 
         * Accesing Array Elements**
         * Array elements can be accessed as Follows
         * marks[0]=100
         * marks[1]=70
         * .
         * .
         * .
         * 
         */

        // DECLERATION AND THEN MEMORY ALLOCATION
        // int [] marks;
        // marks=new int[6];
        // INITIALIZATION
        // marks[0]=54;
        // marks[1]=94;
        // marks[2]=64;
        // System.out.print(marks[2]);

        // int [] marks=new int[5];
        // marks[0]=70;
        // marks[1]=100;
        // marks[2]=80;
        // marks[3]=60;
        // marks[4]=90;
        // marks[4]=40; // overriten value of fourth palace in arrays.
        // marks[5]=90; // If you put more values than declared input then it will throw
        // an error(Index 5 out of bounds for length 5).
        // System.out.print(marks[4]);

        // DECLERATION, MEMORY ALLOCATION AND INITIALIZATION TOGETHER
        // int[] marks={45,60,75,96,52};
        // System.out.print(marks[3]);

        /*
         * 1. int marks; ---> Decleration!
         * marks=new int[5]; ---> Memory Allocation!
         * marks[0]=70; ---> Initialize!
         * 
         * 
         * 2. int [] marks= new int[5]; ---> Decleration + Memory Allocation!
         * marks[0]=70; ---> Initialize!
         * 
         * 
         * 3. int[] marks={45, 78, 98, 63, 30} ---> Declare + Initialize!
         * 
         * Array indices starts form 0 and goes till (n-1) where n is the size of the
         * array.
         * 
         */

        /*
         * ------ ARRAY LENGTH -------
         * Arrays have a length property which gives the length of the array.
         * 
         * marks.length ---> gives 5 if marks is a reference to array with 5 elements
         */

        // String[]
        // names={"Sanket","Rohit","sam","Himanshu","Shubham","Rahul","Viart","Sahil","Om","Ayush"};
        // float[] marks={45.5f,62.35f,87.2f,5.1f,44.1f,29.1f,99.7f,54.4f,100,69.6f};
        // int[] RollNo={1,2,3,4,5,6,7,8,9,10};
        // System.out.println(RollNo.length);
        // System.out.println(marks.length);
        // System.out.println(names.length);

        // System.out.print("Enter RollNo of Student: ");
        // int n=sc.nextInt();
        // System.out.print(RollNo[(n-1)]+" "+names[(n-1)]+" "+marks[(n-1)]);

        /*
         * DISPLAYING THE ARRAY (NAIVE WAY)
         * 
         * float[] marks={45.5f,62.35f,87.2f,5.1f,44.1f,29.1f,99.7f,54.4f,100,69.6f};
         * System.out.print(marks[0]);
         * System.out.print(marks[1]);
         * System.out.print(marks[2]);
         * .
         * .
         * .
         * System.out.print(marks[9]);
         * 
         * 
         * An Array can be displayed using a for loop:
         * for(int i=0;i<marks.length;i++){
         * Sout(marks[i]); ---> Array Traversal
         * }
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

        // String[]
        // names={"Sanket","Rohit","sam","Himanshu","Shubham","Rahul","Viart","Sahil","Om","Ayush"};
        // float[] marks={45.5f,62.35f,87.2f,5.1f,44.1f,29.1f,99.7f,54.4f,100,69.6f};
        // for(int i=0;i<(marks.length);i++){
        // System.out.print(names[i]+" = "+marks[i]+"\n");
        // }

        /*
         * Quick Quiz: Write a java program to print the elements of an array in reverse
         * order.
         */

        // String[]
        // names={"Sanket","Rohit","sam","Himanshu","Shubham","Rahul","Viart","Sahil","Om","Ayush"};
        // for(int i=names.length-1;i>=0;i--){
        // System.out.println(names[i]);
        // }

        /*
         * FOR-EACH-LOOP IN JAVA
         * Array elements can also be traversed as follows:
         * for(int element:arrName){
         * System.out.print(element); ---> Print All Elements in Array
         * }
         * 
         */

        // String[]
        // names={"Sanket","Rohit","sam","Himanshu","Shubham","Rahul","Viart","Sahil","Om","Ayush"};
        // for(String element:names){
        // System.out.println(element);
        // }

        /*
         * MULTIDIMENSIONAL ARRAYS
         * Multidimensional arrays are array of arrays Each Element of a M-D array is an
         * array itself marks in the previous example was a 1-D array.
         * 
         * MultiDimensional 2-D Array
         * A 2-D array can be created as follows:
         * 
         * int [][] flats=new int[2][3] ---> A 2-D array of 2 rows + 3 columns
         * 
         * we can add elements to this array as follows
         * flats[0][0]=101;
         * flats[0][1]=102;
         * flats[0][2]=103;
         * .
         * .
         * .
         * & so on!
         * 
         * This array can be Visualisd as follows:
         * [0] [1] [2]
         * col1 col2 col3
         * [0] Row1 (0,0) (0,1) (0,2)
         * [1] Row1 (1,0) (1,1) (1,2)
         * 
         * 
         * Similarly a 3-D array can be created as follows:
         * 
         * String [][][] arr=new String [2][3][4];
         * 
         * 
         * 
         */

        // int[] marks; // A 1-D Array
        // int[][] flats; // A 2-D Array
        // flats=new int[2][3];
        // flats[0][0]=101;
        // flats[0][1]=102;
        // flats[0][2]=103;
        // flats[1][0]=201;
        // flats[1][1]=202;
        // flats[1][2]=203;

        // System.out.println(flats[0][2]);
        // System.out.println(flats.length);

        // Displaying 2-D Array (for loop)

        // for(int i=0;i<flats.length;i++){
        // for(int j=0;j<flats[i].length;j++){
        // System.out.print(flats[i][j]+" ");
        // }System.out.println("");
        // }

        /************************** PRACTICE SET **************************/

        /*
         * 1. Create an array of 5 floats and calculate their sum.
         */

        // float[] arr={4.5f,2.3f,8.6f,9.4f,8.6f};
        // float sum=0;
        // for(int i=0;i<arr.length;i++){
        // sum=sum+arr[i];
        // }System.out.println("The sum of all elements in array is "+ sum);

        /*
         * 2. Write a program to find out whether a given integer is present in an array
         * or not.
         */

        // System.out.print("Enter Number To Match in Array: ");
        // int num=sc.nextInt();
        // int[] RollNo={12,28,34,94,75,66,17,38,69,10};
        // for(int i=0;i<RollNo.length;i++){
        // if(num==RollNo[i]){
        // System.out.println(num+" match with the element at Index-Value "+i+" in the
        // array.");
        // }
        // }

        /*
         * 3. Calculate the Average marks from an array containing marks of all students
         * in physics using for loop.
         */

        // float sum=0.0f;
        // int[] physics={2,4,4};
        // for(int element:physics){
        // sum=sum+element;
        // }float avg=sum/physics.length;
        // System.out.print("Average of All marks of Physics is "+avg);

        // System.out.print("Enter Number: ");
        // int n=sc.nextInt();
        // ---- Method Invocation using Object Creation. -----
        // _9_Methods obj=new _9_Methods(); // Method Called from file "_9_Methods"
        // int fact=obj.factorial(n);
        // System.out.println(fact);

        // -----------------Hacker Rank Questions on Arrays
        // --------------------------------------------------

    }
}
