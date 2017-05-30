package com.designPattern;

public class HungrySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton a = EagerSingleton.getSingleInstance();
		EagerSingleton b = EagerSingleton.getSingleInstance();
		
		
		System.out.println(a==b);
		
		LazySingleton c = LazySingleton.getSingleInstance();
		LazySingleton d = LazySingleton.getSingleInstance();
		

		System.out.println(c==d);
	}
	
	

}

// 虽然仅存在一个实例，但每次类加载时会实例化，消耗资源
class EagerSingleton  
{  
    private static EagerSingleton singObj = new EagerSingleton();  
  
    private EagerSingleton()  
    {  
    }  
  
    public static EagerSingleton getSingleInstance()  
    {  
        return singObj;  
    }  
}

// 不用每次都进行生成对象，只是第一次使用时生成实例，提高了效率！

class LazySingleton
{  
    private static LazySingleton singObj = null;  
  
    private LazySingleton()  
    {  
    }  
  
    public static synchronized LazySingleton getSingleInstance()  
    {  
        if (singObj == null)  
        {  
            singObj = new LazySingleton();  
        }  
        return singObj;  
    }
}