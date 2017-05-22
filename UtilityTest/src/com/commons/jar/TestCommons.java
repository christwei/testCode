package com.commons.jar;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.Fraction;

public class TestCommons {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1,5,9};
        int[] newArray = ArrayUtils.add(array , 8);
        
        Fraction f1 = Fraction.getFraction(1, 3);
        Fraction f2 = Fraction.getFraction(1, 5);
        
        System.out.println(f1.add(f2));
        System.out.println(f1.pow(2));

    }

}
