package com.ashad.interview.thread;

public class EvenOddPrinter {

    public static void main(String[] args) {
       Thread evenThread = new Thread(new EvenOddTask(),"even");
       Thread oddThread = new Thread(new EvenOddTask(),"odd");
       evenThread.start();
       oddThread.start();
    }
}

class EvenOdd {
    static int number = 1;
    synchronized static void printEvenNumber() {
        System.out.println(Thread.currentThread().getName()+" : "+ number);
    }
    synchronized static void printOddNumber(){
        System.out.println(Thread.currentThread().getName()+" : "+ number);
    }
}

class EvenOddTask implements Runnable {

    @Override
    public void run() {
         while(true && EvenOdd.number <20){
            if(Thread.currentThread().getName().equalsIgnoreCase("even")
                    && EvenOdd.number % 2 ==0){
                EvenOdd.printEvenNumber();
            } else if(Thread.currentThread().getName().equalsIgnoreCase("odd")){
                EvenOdd.printOddNumber();
            }
             EvenOdd.number++;
         }
    }
}
