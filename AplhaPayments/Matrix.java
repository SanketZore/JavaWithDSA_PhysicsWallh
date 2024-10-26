package AplhaPayments;

public class Matrix {
	
	public void lowerMatrix(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(j<=i) {
					continue;
				}else {
					arr[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	

	public static void main(String[] args) {

		   int[][] arr = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		
		Matrix matrix=new Matrix();
		matrix.lowerMatrix(arr);

	}

}
