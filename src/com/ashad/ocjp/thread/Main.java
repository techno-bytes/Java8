package com.ashad.ocjp.thread;

public class Main {

    public static void main(String[] args) {

       Thread thread = new Thread(()-> {
           for (int index=1 ; index< 10; index++) {
               System.out.println("Thread1");
               try {
                   Thread.sleep(1000L);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }

       });
        Thread thread1 = new Thread(()->{
            for (int index=1 ; index< 10; index++) {
                System.out.print(" Thread2");
            }
        });
        if(!thread1.isDaemon()){
            thread1.setDaemon(true);
            thread1.setPriority(Thread.MIN_PRIORITY);
        }
       thread.start();
        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }



}
