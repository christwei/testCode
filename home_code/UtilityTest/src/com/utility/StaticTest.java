package com.utility;

public class StaticTest {
    
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StaticVariable sv1 = new StaticVariable();
        System.out.println(sv1.getNum());
        StaticVariable sv2 = new StaticVariable();
        System.out.println(sv2.getNum());
    }

}

class StaticVariable {
    public static int num=0;
    
    public int getNum() {
        num=num+1;
        
        return num;
    }
}
