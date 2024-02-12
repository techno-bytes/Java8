package com.ashad.ocjp.thread.producerConsumer;

public class OddEvenRunner {

    private static final int N =10;
    private int count=0;
    private synchronized void printEvenNumber() throws InterruptedException {
        while(count<N) {
            if(count%2==1){
                wait();
            }
            System.out.print(count + " ");
            count++;
            notify();
        }
    }

    private synchronized void printOddNumber() throws InterruptedException {
        while(count<N) {
            if(count%2==0){
                wait();
            }
            System.out.print(count + " ");
            count++;
            notify();
        }
    }

    public static void main(String[] args) {
        OddEvenRunner oddEvenRunner = new OddEvenRunner();
        new Thread(()-> {
            try {
                oddEvenRunner.printEvenNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()-> {
            try {
                oddEvenRunner.printOddNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
