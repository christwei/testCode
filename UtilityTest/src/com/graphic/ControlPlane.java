package com.graphic;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ControlPlane extends BaseFrame {
    
    Image bg = BaseFrame.getImg("com/images/bg.jpg", this);
    
    Plane p = new Plane(50,50);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ControlPlane gf = new ControlPlane();
        gf.launchFrame();

        //GameFrame gf2 = new GameFrame();
        //gf2.launchFrame();
       

    }
    
    public void launchFrame() {
        super.launchFrame();
        
        addKeyListener(new KeyMonitor());
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(bg, 0,0,null);
        p.draw(g);
    }
    
    
    class KeyMonitor extends KeyAdapter {

        // 释放
        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
            case 37:
                p.left = false;
                break;
            case 38:
                p.up = false;
                break;

            case 39:
                p.right = false;
                break;
            case 40:
                p.down = false;
                break;
                
            case 17:
                p.shootFlg = false;
                break;
                
            default:
                break;
            }
        }

        // 按下
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            switch (e.getKeyCode()) {
            case 37:
                p.left = true;
                break;
            case 38:
                p.up = true;
                break;

            case 39:
                p.right = true;
                break;
            case 40:
                p.down = true;
                break;
                
            case 17:
                p.shootFlg = true;
                break;
            default:
                break;
            }
        }
        
    }
}
