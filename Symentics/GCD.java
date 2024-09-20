package Symentics;
import org.w3c.dom.css.CSSImportRule;
import java.util.*; 
public class GCD {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int n2=sc.nextInt();
		
		int gcd=(n1>n2)?n1:n2;
		
		int temp=1;
		for(int i=1;i<=gcd;i++) {
			if(n1%i==0 && n2%i==0) {
					temp=i;				
			}
		}
		System.out.println(temp);
		
	}

}
