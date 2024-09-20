package Symentics;

public class ReverseArray {

	public static void main(String[] args) {


		int[] arr= {5,4,7,8};
		int[] arr1reverse=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
			arr1reverse[i]=arr[arr.length-1-i];
		}
		
		for(int a:arr1reverse) {
			System.out.println(a);
		}
		
		
	}

}
