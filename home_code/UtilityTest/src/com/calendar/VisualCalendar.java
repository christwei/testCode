package com.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VisualCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caculate(6);
	}

	private static void caculate(int month) {
		
		System.out.println(6+"月分");
		
		// TODO Auto-generated method stub
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		Calendar c = new GregorianCalendar();
		
		int today = 0;
		
		if (c.get(Calendar.MONTH) == month -1) {
			today = c.get(Calendar.DAY_OF_MONTH);
		}
		
		c.set(Calendar.MONTH,6-1);
		
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		
		
		//System.out.println(c.getTime());
		
		//System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i = 1; i < c.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.print(i);
			if (c.get(Calendar.DAY_OF_MONTH) == today) {
				System.out.print("*");
			}
			System.out.print("\t");
			
			int w = c.get(Calendar.DAY_OF_WEEK);
			if (w == Calendar.SATURDAY) {
				System.out.print("\n");
			}
			
			c.add(Calendar.DATE, 1);
		}
		
		
	}

}
