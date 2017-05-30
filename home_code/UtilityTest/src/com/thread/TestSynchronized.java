package com.thread;

/**
 * Created by Administrator on 2016/12/17 0017.
 */
public class TestSynchronized {
    public static void main(String[] args) {
    	Thread th1 = new Thread(new CounterThread());
    	Thread th2 = new Thread(new CounterThread());
    	th1.start();
    	th2.start();
    	
    	System.out.println(CounterThread.idx);
    }
}

class CounterThread implements  Runnable {

	//public static Integer idx = 1;
	public  static int idx = 1;
	
	public synchronized static void inc(){  
		for (int i = 0; i < 900000 ; i++) {
			idx++; 
		}
		System.out.println(idx);
    }  
	
	@Override
	public void run() {
			

				inc();

			
			
		
		
		
	}
	
}
