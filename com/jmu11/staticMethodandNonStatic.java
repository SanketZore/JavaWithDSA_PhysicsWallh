package com.jmu11;

import java.util.Arrays;

class sam{
	static void disp1() {
		System.out.println("Static Method disp1");
	}
	void disp2() {
		System.out.println("Non Static Method disp2");
	}
}

public class staticMethodandNonStatic {

	public static void main(String[] args) {
		
		sam.disp1();
		sam d=new sam();
		d.disp2();
	
	}
}
