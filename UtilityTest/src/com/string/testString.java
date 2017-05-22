package com.string;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Date;

public class testString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String regx = "[1-9]\\d{3}(0[1-9]|10|11|12)";
        String yearMon = "199915";
        System.out.println(yearMon.matches(regx)?"匹配":"不匹配");
        
        String regxTel = "1(30|33|35|37|38|50|57|80|89)\\d{8}";
        
        
        System.out.println("13723322288".matches(regxTel));
        
       
    }
    
    
    

}
