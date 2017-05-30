package com.utility;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    String string;
	    
	    //if (string == null) {
        //return;
	    //}
		String wordString = "abcdefg";
		
		for (int i = 0; i< wordString.length(); i++) {
			
		    String shortWord = wordString.substring(0, i) + wordString.substring(i+1);
    	    System.out.println(shortWord);
		}
	}

}