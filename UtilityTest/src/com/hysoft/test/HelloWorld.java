package com.hysoft.test;

import java.util.Scanner;

/**
 * Created by tangw on 2017/04/13.
 */
public class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "nothing" ;

        name = scanner.nextLine();
        
        System.out.println("hello!" + name);
    }
}
