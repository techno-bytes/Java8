package com.ashad.ocjp.thread.executor;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> callableTaskList = List.of(new CallableTask("Annu"),
                new CallableTask("Afsha"),
                new CallableTask("Aatif"),
                new CallableTask("Enaya"),
                new CallableTask("Iqra"));
        List<Future<String>> futureList = executorService.invokeAll(callableTaskList);
        for(Future<String> future : futureList){
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
