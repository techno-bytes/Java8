package com.ashad.ocjp.thread;

public class StopThread {

    public static void main(String[] args) throws InterruptedException {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable);
        thread.start();
        thread.sleep(5000);
        System.out.println("Stop requested..");
        stoppableRunnable.stopRequested();
        System.out.println("Stopped..");
        System.out.println("Main Thread finished..");
    }
}

class StoppableRunnable  implements Runnable  {

    boolean isStop = false;

     void stopRequested(){
        isStop = true;
    }

     boolean isStopRequested(){
        return isStop;
    }

    @Override
    public void run() {
        System.out.println("StoppableRunnable is running...");
        while (!isStopRequested()) {
            try {
                Thread.sleep(1000L);
                System.out.println("...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("StoppableRunnable is stopped");
    }
}
