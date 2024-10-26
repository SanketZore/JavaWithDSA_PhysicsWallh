package Systenics;

public class StarDiamondPattern {

	public static void main(String[] args) {

		int n=7;
		
		
//		*
//	   * *	 5
//	  *   *	
//	 *     *
//	  *   *
//	   * *
//	    *

        for (int i = 0; i < n; i++) {
            
        	for(int j=1;j<=n;j++) {
        	
        		if(j==n || i==n/2 ||(j==1 && i!=0) || (j==n && i!=0)) {
        			System.out.print("*");        			
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }

//        (i==0 && (j!=1 || j!=n)) 
	}

}
