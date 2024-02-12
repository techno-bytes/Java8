package com.ashad.ocjp.thread.executor;

public class Task implements Runnable{
    int number;
    Task(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("Task "+number+" Started...");
        for (int i = number*100 ; i < number*100+99; i++) {
            System.out.println("Task : "+number+ "--> "+Thread.currentThread().getName());
        }
        System.out.println("Task"+number+" Done...");
    }
}
