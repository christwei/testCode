package com.utility;

public class TestLoop {

    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i,j;
        for(i = 0; i < 9; i++) {
            for(j=7; j >4; j--) {
                System.out.println(i+":"+j);
                if (i==j) {
                  System.out.println(":"+j);
                }
            }
        }
    }

}
