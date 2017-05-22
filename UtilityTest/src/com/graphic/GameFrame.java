package com.graphic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame  extends BaseFrame{

	private int x = 50;
	private int y = 50;
    private static int idx = 0;
    private double  degree = Math.PI/3;

    // 加载图片
    private Image img = getImg("com/images/blueball.jpg",this);
    private int key = 3;
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
        switch (key ) {
        case 1:
            // 画正方形
            g.draw3DRect(x, y, 30, 30, true);
            break;

        case 2:
            // 小球运动
            g.drawImage(img, x,  y,  30, 30, null);
            x = x + 2;
            y = y + 5;
            break;
        case 3:
            // 台球运动
            g.drawImage(img, x, y, 30, 30, null);
            
            x += 6*Math.cos(degree);
            y += 6*Math.sin(degree);
            
            if (y > WIDTH-30) {
                degree = -degree;
            }
            
            if (y < 30) {
                degree = -degree;
            }
            
            if (x < 0) {
                degree = Math.PI - degree;
            }
            
            if (x > LENGTH -30) {
                degree = Math.PI - degree;
            }
            
            break;
        default:
            break;
        }
        
    
    System.out.println("x:"+x+"---y:"+y);
}
    
     
    
    

}
