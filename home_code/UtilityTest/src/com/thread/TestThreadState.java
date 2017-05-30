package com.thread;

/**
 * Created by Administrator on 2016/11/20 0020.
 */
public class TestThreadState {

    public static void main(String[] args) throws InterruptedException {
        ThreadState state = new ThreadState();
        Thread thread = new Thread(state);
        System.out.println("新建线程：" + thread.getState());
        thread.start();
        Thread.sleep(100);
        System.out.println("计时等待：" + thread.getState());
        Thread.sleep(10000);
        System.out.println("等待线程：" + thread.getState());
        state.notifyNow();
        System.out.println("唤醒线程：" + thread.getState());
        Thread.sleep(200);
        System.out.println("终止线程：" + thread.getState());
    }

}

class ThreadState implements  Runnable {
    public synchronized  void waitForSecond() throws InterruptedException {
        System.out.println("waitForSecond start!");
        wait(5000);
        System.out.println("waitForSecond end!");
    }

    public synchronized  void waitForYears() throws InterruptedException {
        System.out.println("waitForYears begin!");
        wait();
        System.out.println("waitForYears end!");
    }

    public synchronized  void notifyNow() throws InterruptedException {
        notify();
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        try {
            waitForSecond();
            waitForYears();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
