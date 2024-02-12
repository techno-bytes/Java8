package com.ashad.ocjp.thread.lock;

public class MainClass {

    public static void main(String[] args) {

        CounterLock counterLock = new CounterLock();
        System.out.println("Initial value= "+counterLock.getCount());
        Thread thread1 = new Thread(()-> {
            for (int i=1; i<10; i++){
                counterLock.inc();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("thread1 counterLock.getCount()= "+counterLock.getCount());
        }) ;
        Thread thread2 = new Thread(()-> {
            System.out.println(" thread2 counterLock.getCount()= "+counterLock.getCount());;
        }) ;

        thread1.start();
        thread2.start();
        System.out.println("Main Done");
    }
}
