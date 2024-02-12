package com.ashad.ocjp.thread.executor;

import java.util.concurrent.*;

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new CallableTask("Annu"));
        System.out.println("new Callable Executed!!");
        String result = future.get();
        System.out.println(result);
        System.out.println("Main End!!");
    }
}

class CallableTask implements Callable<String> {

    String name;

    CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}
