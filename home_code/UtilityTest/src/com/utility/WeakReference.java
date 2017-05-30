package com.utility;

public class WeakReference {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String testString = new String("abcde");
        
        java.lang.ref.WeakReference<String> wr 
            = new  java.lang.ref.WeakReference<String>(testString);
        
        System.out.println("运行gc前:"+wr.get());
        
        testString = null;
        System.gc();
        System.runFinalization();
        
        System.out.println("运行gc后:"+wr.get());
        
    }

}
