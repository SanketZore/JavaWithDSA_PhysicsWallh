package stack;
import java.util.*;
public class LargestRectangleInHistogram {
	
	public static int[] prevSmaller(int[] height) {
		int[] prevSmaller =new int[height.length];
		prevSmaller[0]=-1;
		for(int curr=1;curr<height.length;curr++ ) {
			for(int prev=0;prev<curr;prev++) {
				if(height[prev]<height[curr]) {
					prevSmaller[curr]=prev;
				}else {
                    if(prevSmaller[prev]!=-1){
                        continue;
                    }else{
                        prevSmaller[curr]=-1;
                    }
				}
			}
		}
		return prevSmaller;
	}
	
	public static int[] nextSmaller(int[] height) {
		int[] nextSmaller =new int[height.length];
		nextSmaller[height.length-1]=height.length;
		for(int curr=0;curr<height.length-1;curr++ ) {
			for(int next=curr+1;next<height.length;next++) {
				if(height[next]<height[curr]) {
					nextSmaller[curr]=next;
					break;
				}else {
		                nextSmaller[curr]=9;
				}
			}
		}
		return nextSmaller;
	}
	
	static int LargestRectangle(int[]height ,int[]previousSmaller,int[]nextSmaller) {
		

		int[] width=new int[height.length];
		int[] Area=new int[height.length];
		for(int i=0;i<height.length;i++) {
			width[i]=nextSmaller[i]-previousSmaller[i]-1;
		}
		for(int i=0;i<height.length;i++) {
			Area[i]=height[i]*width[i];
//			System.out.println(Area[i]);
		}
		int max=Area[0];
		for(int j=0;j<height.length;j++) {
			 if(Area[j]>max) {
				 max=Area[j];
			 }
		}
		return max;
	}

	public static void main(String[] args) {

//		int[] height= {3,2,6,5,1,2};
		int[] height= {2,4,2,3,6,5,1,2,4};
		
		int[] newHeight = new int[height.length]; 
        int j = height.length; 
        for (int i = 0; i < height.length; i++) { 
            newHeight[j - 1] = height[i]; 
            j = j - 1; 
        } 
        
		int[] previousSmaller= prevSmaller(newHeight);
		int[] nextSmaller= nextSmaller(newHeight);
		
		System.out.println(LargestRectangle(newHeight,previousSmaller,nextSmaller));
		
		
		
//			width_formula=nextSmaller-PrevSmaller-1
//previousSmaller	-1 -1 -1 2 3 2 2 6 2
//nextSmaller	1 2 9 5 5 6 9 8 9
		
		
		
		
		
	}

}
