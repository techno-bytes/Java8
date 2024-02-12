package com.ashad.ocjp.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        System.out.println("End main thread!!");
//

        Future<String> submit = executorService.submit(() -> System.out.println("Fom Executor Callable"), "Pass");
        System.out.println("Result= "+submit.get());
        executorService.shutdown();
    }
}
