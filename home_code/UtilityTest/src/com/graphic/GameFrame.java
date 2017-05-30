package com.graphic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame  extends BaseFrame{

	private int x = 20;
	private int y = 20;
    private static int idx = 0;

    private Image img = getImg("com/images/plane.jpg");
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GameFrame gf1 = new GameFrame();
        gf1.launchFrame();

        //GameFrame gf2 = new GameFrame();
        //gf2.launchFrame();

    }
    
    @Override
    public void paint(Graphics g) {
        idx  = idx + 1;
        // TODO Auto-generated method stub
    //g.draw3DRect(x, y, 30, 30, true);
        g.drawImage(img, x, y, 30, 30, null);
    x = x + 2;
    y = y + 5;
    System.out.println("idx:"+idx);
    
    //while (true) {
       
    //}
    
    super.paint(g);
}
    
    
    
    

}
