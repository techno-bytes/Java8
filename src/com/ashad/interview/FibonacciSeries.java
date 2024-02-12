package com.ashad.interview;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num1=0, num2=1, feb;

        System.out.println(num1+" "+num2);

        int count =10;

        while(count > 0 ){
            feb=num1+num2;
            System.out.print(num1+num2+" ");
            num1=num2;
            num2=feb;
            count--;
        }

    }
}
