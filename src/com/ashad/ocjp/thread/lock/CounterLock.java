package com.ashad.ocjp.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private long count =0;

    private Lock lock= new ReentrantLock();

    public void inc(){
        count++;
    }

   public long  getCount(){
        return count;
    }

}
