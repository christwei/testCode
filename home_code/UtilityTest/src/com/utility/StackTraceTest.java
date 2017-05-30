package com.utility;

import java.util.Scanner;

public class StackTraceTest {

	public static int factorial(int n) {
		System.out.println("阶乘："+n);
		Throwable t = new Throwable();
		StackTraceElement[] steArray=t.getStackTrace();
		for (StackTraceElement sTrElement : steArray) {
			System.out.println(sTrElement);
		}
		
		int r;
		if (n <= 1) {
			r=1;
		} else {
			r=n*factorial(n-1);
		}
		
		System.out.println("return "+r);
		return r;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        factorial(n);
	}

}
