package com.graphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BaseFrame extends Frame {
    
    

    protected final int LENGTH = 700;
	protected final int WIDTH = 500;
	
	private Image offScreenImage = null;
	
	@Override
    public void update(Graphics g) {
        // 使用双缓冲技术避免闪烁
        //super.update(g);
        if (offScreenImage == null) {
            offScreenImage = this.createImage(LENGTH, WIDTH);
        }
        
        Graphics gOff = offScreenImage.getGraphics();
        
        paint(gOff);
        g.drawImage(offScreenImage, 0,0,null);
        
    }
	
	public void launchFrame() {
		setSize(LENGTH, WIDTH);
        setVisible(true);
        
        new PaintThread().start();
        
        addWindowListener(new WindowAdapter() {
            
         public void  windowClosing(WindowEvent e) {
             System.exit(0);
         }
        });
	}

    public static Image getImg(String path, Object obj) {
        //System.out.println(BaseFrame.class.getClassLoader().getResource(""));
        URL url = obj.getClass().getClassLoader().getResource(path);
        BufferedImage bi = null;

        try {
            bi = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bi;
    }

	
	
	class PaintThread extends Thread {

        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
    }

}
