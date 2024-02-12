package com.ashad.ocjp.thread.producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

    private final BlockingQueue blockingQueue;

    Consumer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random(100);
            try {
                Integer randNumber = (Integer) blockingQueue.take();
                System.out.println("Consumed : "+randNumber);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
