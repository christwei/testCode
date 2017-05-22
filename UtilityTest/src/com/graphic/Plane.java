package com.graphic;

import java.awt.Graphics;
import java.awt.Image;

public class Plane {
    Image planeImg = BaseFrame.getImg("com/images/plane.jpg", this);
    Image bulletImg = BaseFrame.getImg("com/images/blueball.jpg", this);
    double x,y;
    double bulletY;
    
    int speed = 10;
    boolean left,up,right,down;
    boolean shootFlg;
    
    public Plane(double x, double y) {
        this.x = x;
        this.y = y;
        this.bulletY = y;
    }
    
    public void draw(Graphics g) {
        g.drawImage(planeImg, (int)x, (int)y, null);
        // 移动
        move();
        
        
        // 发射
        shoot(g);
    }
    
    private void shoot(Graphics g) {
        if (shootFlg) {
            g.drawImage(bulletImg, (int)x, (int)bulletY, 10, 10, null);
            if (bulletY < 5) {
                bulletY = y;
            } else {
                bulletY = bulletY -60;
            }
        }
        
    }

    public void move() {
        if (left) {
            x -= speed;
        }
        
        if (right) {
            x += speed;
        }
        
        if (up) {
            y -= speed;
        }
        
        if (down) {
            y += speed;
        }
        
    }
}
