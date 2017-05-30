package com.utility;

public class LoopTest {

	public static void main(String[] args) {
		
		System.out.println("九九乘法三角---------");
		// TODO Auto-generated method stub
		int y =1;
		int x = 1;
		
		for (y = 1; y <= 9; y++) {
			for (x = 1; x <= y; x++){
				System.out.print(x*y);
				System.out.print("\t");
			}
			System.out.print("\r\n");
		}
	}

}


