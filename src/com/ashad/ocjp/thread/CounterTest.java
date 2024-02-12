package com.ashad.ocjp.thread;

public class CounterTest {

    int counter =0;
    public static void main(String[] args) {

        CounterTest counterTest = new CounterTest();
        Thread thread = new Thread(counterTest.runnable);
        thread.start();
        System.out.println("Counter value= "+counterTest.counter);
    }


    Runnable runnable = () -> {
        changeCount();
        System.out.println("Counter value in thread= "+counter);
    };

    synchronized void changeCount(){
        counter++;
    }


}
