package Systenics;

import com.jmu11.staticMethodandNonStatic;

public class sorting {

	public static void towerOfHannoi(int topN,char from, char inter,char to) {
		
		if(topN==1) {
			System.out.println("Disk from "+from+" to "+to);
		}else {
			towerOfHannoi(topN-1, from, to, inter);
			System.out.println("Disk from "+from+" to "+to);
			towerOfHannoi(topN-1,inter,from, to);
		}
	}
	
	public static void main(String[] args) {

		
		int nDisk=3;
		towerOfHannoi(nDisk,'A','B','C');
		
		
	}

}
