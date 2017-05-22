package com.loop;

public class LoopTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        testLoop ();
    }
    
    /**
     * 循环测试.
     */
    public static void testLoop () {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"X" + j + "="+i*j);
            }
        }

        System.out.println("");
        System.out.println("------------------------九九乘法-----------------------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = i; j<=9; j++) {
                
                /*if (j == 6) {
                    break;
                }*/
                System.out.println(i+"X" + j + "="+i*j);
            }
        }
    }

}
