package com.utility;

import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in =new Scanner(System.in);
        
        System.out.println("Enter a size:");
        
        String input = in.next().toUpperCase();
        
        Size sz = Enum.valueOf(Size.class, input);
        
        System.out.println("size=:"+sz);
        
        System.out.println("abbreviation:"+sz.getAbbreviation());
	}

}

enum Size
{
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private String abbreviation;
	private Size(String abb){this.abbreviation = abb;}
	
	public String getAbbreviation() {
		return abbreviation;
	}
}