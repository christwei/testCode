package com.hysoft.test;

/**
 * Created by tangw on 2017/03/27.
 */
public class testJava {
    private static int a = 0;

    enum Constants{
        Constants_A(11),
        Constants_B(22);

        Constants(int i) {
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world!");

        testLoop();
        testEnum ();
    }

    /**
     * 循环测试.
     */
    public static void testLoop () {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("iXj=="+i*j);
            }
        }

        System.out.println("九九乘法-----------------------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = i; j<=9; j++) {
                System.out.println(i*j);
            }
        }
    }

    public static void testEnum () {

        for (int i = 0; i < Constants.values().length; i++) {
            System.out.println(Constants.values()[i]);
        }
    }

    public void test() {
        int c = a;
    }

}
