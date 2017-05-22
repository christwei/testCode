package com.reflector;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

public class ClassReflecting {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Class<Mobile> mob = null;

       // mob = (Class<Mobile>) Class.forName("Mobile");
        
        Class<?> mob = null;
        
        try {
            // 类加载形成class
            mob = Class.forName("com.reflector.Mobile");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }
        
        try {
            // 对象实例化
            Mobile mb = (Mobile) mob.newInstance();
            mb.setName("tang");
            Yu<Mobile> yu = new Yu<Mobile>(mb);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }

}

class Mobile {
    
    static {
        System.out.println("Mobile类开始加载！");
    }
    
    public Mobile() {
        System.out.println("Mobile对象开始实例化！");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Yu<T>  {
    private T t;
    
    public Yu(T t){
        System.out.println(this.getClass());
        this.t = t;
        //ParameterizedType tp = (ParameterizedType)this.getClass().getGenericSuperclass();
        //clazz = (Class)tp.getActualTypeArguments()[0];
        System.out.println(this.t.getClass());
    }
}
