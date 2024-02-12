package com.ashad.interview.thread;

public class ThreadJoining {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main start");
        Thread thread1 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
        }, "one");
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(new MyThread(thread1), "Two");
        thread2.start();
        Thread thread3 = new Thread(new MyThread(thread2), "Three");
        thread3.start();
        thread3.join();
        System.out.println("Main thread completed");

    }


}

class MyThread implements Runnable {

    MyThread(Thread thread) throws InterruptedException {
        thread.join();
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
}
