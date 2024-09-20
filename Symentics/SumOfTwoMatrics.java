package Symentics;

public class SumOfTwoMatrics {

	public static void main(String[] args) {

		
		
		int[][] arr1={{2,3,5,6},{5,2,8,6}};
		int[][] arr2={{7,9,0,8},{5,2,9,7}};
		int row=arr1.length,col=arr2[0].length;
		
		int[][] sum=new int[row][col] ;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<row;i++) {
			System.out.print("[ ");
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.print(']');
			System.out.println();
		}
		

		
	
		
		
	}

}
