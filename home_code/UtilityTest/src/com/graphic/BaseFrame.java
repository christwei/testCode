package com.graphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class BaseFrame extends Frame {
	private final int LENGTH = 700;
	private final int WIDTH = 500;
	
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

    public Image getImg(String path) {
        //System.out.println(BaseFrame.class.getClassLoader().getResource(""));
        URL url = this.getClass().getClassLoader().getResource(path);
        BufferedImage bi = null;

        try {
            bi = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bi;
    }
    
    public void paint(Graphics g) {
    	 repaint();
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    }

	
	
	class PaintThread extends Thread {

        @Override
        public void run() {
            
        }
        
    }

}
