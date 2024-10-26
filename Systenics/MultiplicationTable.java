package Systenics;

public class MultiplicationTable {

	public static void table(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	
	public static void main(String[] args) {

		for(int i=1;i<=100;i++) {
			table(i);
			System.out.println();
		}
	}

}
