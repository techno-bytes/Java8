package com.ashad.ocjp.thread;

public class WithoutSyncronization {

    public static void main(String[] args) throws InterruptedException {

        TickTock tickTock = new TickTock();

        Thread thread = new Thread(()-> {
            tickTock.increment();
        });
        thread.start();
//        Thread.sleep(1000L);

        System.out.println("count= "+tickTock.count);
    }
}

class TickTock {
    int count;

    void increment(){
        count++;
    }

}
