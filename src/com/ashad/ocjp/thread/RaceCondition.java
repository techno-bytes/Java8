package com.ashad.ocjp.thread;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        thread.start();
        thread2.start();
        thread2.join();
        System.out.println("finish main thread");
    }
}

class MyRunnable implements Runnable {

    private int count;

    @Override
    public void run() {
        for (int i =0; i< 1_00_000; i++) {
            synchronized (this){
                count++;
            }
        }
        System.out.println("Count= "+count);
        System.out.println(Thread.currentThread()+" "+this.hashCode());
    }
}
