package com.ashad.interview.thread;

import java.util.concurrent.Exchanger;

public class ExchangeTest {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger<>();

       Thread producer = new Thread(()->{
           try {
               String data = "Hello from producer thread";
               System.out.println("Producer thread is sending: " + data);
               String receivedData = exchanger.exchange(data);
               System.out.println("Producer thread received: " + receivedData);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       });

        Thread consumer = new Thread(()->{
            String consumeData = "Consuming data";
            System.out.println("Consumer Thread receiving data -- ");
            try {
                String data = "Hello from consumer thread";
                System.out.println("Consumer thread is sending: " + data);
                String receivedData = exchanger.exchange(data);
                System.out.println("Consumer thread received: " + receivedData);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
    }
}
