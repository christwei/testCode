package com.calendar;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.CHINA);
		
        GregorianCalendar date = new GregorianCalendar();
        
        int today = date.get(Calendar.DAY_OF_MONTH);
        
        int month = new Scanner(System.in).nextInt();
        
        caculate(date, today, month);
	}
	
    private static void caculate(GregorianCalendar date, int today, int mon) {
    	date.set(Calendar.MONTH,mon-1);
    	int thisMonth = date.get(Calendar.MONTH);
    	
    	// 设置日期为当月1日
        date.set(Calendar.DAY_OF_MONTH,1);
        
        // 当日为周几
        int weekday =date.get(Calendar.DAY_OF_WEEK);
        
        // 本周第一天的index
        int firstDayOfWeek = date.getFirstDayOfWeek();
        
        int indent = 0;
        
        while (weekday!=firstDayOfWeek) {
        	indent++;
        	date.add(Calendar.DAY_OF_WEEK, -1);
        	weekday =date.get(Calendar.DAY_OF_WEEK);
        	
        }
        System.out.println(thisMonth+1+"月分");
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do 
        {
        	System.out.printf("%4s", weekdayNames[weekday]);
        	System.out.print("\t");
        	date.add(Calendar.DAY_OF_WEEK, 1);
        	weekday =date.get(Calendar.DAY_OF_WEEK);
        } while(weekday!=firstDayOfWeek);
        
        System.out.println();

        for (int i=1; i <= indent; i++) {
        	System.out.print("\t");
        }
        
        date.set(Calendar.DAY_OF_MONTH, 1);
        
        do {
        	int day = date.get(Calendar.DAY_OF_MONTH);
        	System.out.printf("%3d",day);
        	
        	if (day==today) {
        		System.out.print("*\t");
        	}else {
        		System.out.print("\t");
        	}
        	date.add(Calendar.DAY_OF_MONTH, 1);
        	weekday =date.get(Calendar.DAY_OF_WEEK);
        	
        	if (weekday==firstDayOfWeek) System.out.println();
        	
        } while (date.get(Calendar.MONTH)==thisMonth);
    }

}
