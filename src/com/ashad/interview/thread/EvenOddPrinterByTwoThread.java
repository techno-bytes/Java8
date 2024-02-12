package com.ashad.interview.thread;

public class EvenOddPrinterByTwoThread implements Runnable {

    private static int counter = 1;
    private Object object;

    EvenOddPrinterByTwoThread(Object object) {
        this.object = object;
    }

    private void print() {
        System.out.println(Thread.currentThread().getName() + " : " + counter);
    }

    @Override
    public void run() {
        while (counter < 20) {
            if (counter % 2 == 0
                    && Thread.currentThread().getName().equalsIgnoreCase("even")) {
                synchronized (object) {
                    print();
                    counter++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else if (counter % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd")) {
                synchronized (object) {
                    print();
                    counter++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        Thread evenThread = new Thread(new EvenOddPrinterByTwoThread(object), "even");
        Thread oddThread = new Thread(new EvenOddPrinterByTwoThread(object), "odd");
        evenThread.start();
        oddThread.start();
    }
}
