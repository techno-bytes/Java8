package com.ashad.ocjp.thread.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Prodeucer extends Thread {
    private final BlockingQueue blockingQueue;

    Prodeucer(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                int randNumber = random.nextInt(10011);
                blockingQueue.put(randNumber);
                System.out.println("Produced : " + randNumber);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
