package com.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by tangw on 2017/04/13.
 */
public class testMutiThread {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {

            @Override
            public void run() {
                Integer temp = 90000;
                for (int i = 1; i < 1000000000; i++) {
                    temp = temp+i*2;
                }
                System.out.println(String.valueOf(temp));
            }
        });

        Thread b = new NewThread();

        //a.start();
        //b.start();


        SleepMethodTest st = new SleepMethodTest();
    }


    static  class NewThread extends Thread {

        @Override
        public void run() {
            System.out.println("another Thread begin!");
        }
    }

}

class SleepMethodTest extends JFrame {
    private Thread t1;
    private Thread t2;

    private static Color[] color = new Color[]{Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.orange, Color.yellow, Color.red, Color.pink, Color.LIGHT_GRAY};

    private static Color getC() {
        return color[new Random().nextInt(color.length)];
    }

    public SleepMethodTest () {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);


        t1 = new DrawThread(30, 50);
        t1.start();

        t2 = new DrawThread(230, 50);
        t2.start();

    }

    class DrawThread extends Thread {

        private int innerX =0;
        private int innerY =0;

        public DrawThread(int x, int y) {
            this.innerX = x;
            this.innerY = y;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Graphics g = getGraphics();

                g.setColor(getC());

                g.drawLine(innerX, innerY,innerX+100, innerY++);

                if ( innerY >= 80) {
                    innerY =50;
                }
            }
        }
    }



}
