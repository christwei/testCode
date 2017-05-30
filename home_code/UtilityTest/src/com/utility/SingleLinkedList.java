package com.utility;


public class SingleLinkedList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Runnable r = new Runnable() { 
            public void run() {
                System.out.println("匿名类直接产生对象!!");
            }
        };
        
        new Thread( new Runnable() { 
            public void run() {
                System.out.println("start!!");
            }
        }).start();
        
        
    }

}
