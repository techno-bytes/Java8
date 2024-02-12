package com.ashad.interview.generic;

public class GenericMethodDemo {

    static <T, E> void printGeneric(T t, E e){
        System.out.println(t+""+e);
    }

    public static void main(String[] args) {
        printGeneric("Hello ", 123);
    }
}
