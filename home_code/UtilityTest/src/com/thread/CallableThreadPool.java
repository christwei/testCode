package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadPool {

    /**
     * @param args
     * @throws ExecutionException 
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 创建线程池
       ExecutorService service = Executors.newFixedThreadPool(2);
       
       Race tortoise = new Race("乌龟", 1000);
       Race rabbit = new Race("兔子", 500);
       
       Future<Integer> result1 = service.submit(tortoise);
       Future<Integer> result2 = service.submit(rabbit);
       
       Future<Integer> result3 = service.submit(new Counter());
       
       // 当前线程休眠，等待线程池中执行完
       Thread.sleep(1000);
       
       tortoise.setFlag(false);
       rabbit.setFlag(false);
       
       int num1= result1.get();
       int num2= result2.get();
       
       System.out.println("乌龟跑了===>"+num1);
       System.out.println("兔子跑了===>"+num2);
       
       System.out.println(result3.get());
       
       
    }

}

class Race implements Callable<Integer> {

    private boolean flag = true;
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private long time;
    private int step=0;
    private String name;
    public Race(String name,long time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public Integer call() throws Exception {
        while (flag) {
              
            Thread.sleep(time);
            step++;
        }
        return step;
    }
    
}

class Counter implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		Integer cnt = 0;
		for (Integer i = 0; i < 1000000000; i++) {
			cnt = cnt + 2;
		}
		return cnt;
	}
	
}
