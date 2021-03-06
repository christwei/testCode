package com.designPattern;


public class Adapter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Translater center = new Translater("姚明");
        center.shoot();
    }

}


abstract class player {
    public String name = null;
    
    public player(String name) {
        this.name = name;
    }
    
    abstract void shoot ();
    abstract void defence();
}

/**
 * @author Administrator
 *
 */
class Forward extends player {

    public Forward(String name) {
        super(name);

    }

    @Override
    void shoot() {
        System.out.println(name+" shoot!");
    }

    @Override
    void defence() {
        
    }
    
}

/**
 * @author Administrator
 *
 */
class Center {

    public String name = null;
    
    public Center(String name) {
        this.name = name;
    }
    
    void hookShoot() {
        // TODO Auto-generated method stub
        System.out.println(name+"  hook shoot!");
    }

    void defence() {
        // TODO Auto-generated method stub
        
    }
}

class Translater extends player {

    private Center cn;
    public Translater(String name) {
        super(name);
        cn=new Center(name);
    }

    @Override
    void shoot() {
        // TODO Auto-generated method stub
        cn.hookShoot();
    }

    @Override
    void defence() {
        // TODO Auto-generated method stub
        
    }
}
