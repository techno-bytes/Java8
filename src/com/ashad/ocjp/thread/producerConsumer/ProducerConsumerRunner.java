package com.ashad.ocjp.thread.producerConsumer;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerRunner {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);
        System.out.println("Main method Started");
        Thread producer = new Thread(new Prodeucer(blockingQueue));
        producer.start();
        Thread consumer = new Thread(new Consumer(blockingQueue));
        consumer.start();
        consumer.join();
        System.out.println("Main method Ended");
    }
}
