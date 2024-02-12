package com.ashad.interview.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingInStream {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20, 0);
//        integers.forEach(i -> {
//            try {
//                System.out.println(50 / i);
//            } catch (ArithmeticException e) {
//                System.err.println(
//                        "Arithmetic Exception occured : " + e.getMessage());
//            }
//        });

        integers.stream().forEach(lambdaWrapper(i-> System.out.println(5/i), ArithmeticException.class));
    }

    static <T, E extends Exception> Consumer<T> lambdaWrapper(Consumer<T> consumer, Class<E> clazz) {
        return i -> {
            try {

                consumer.accept(i);
            } catch (Exception  e) {
                E cast = clazz.cast(e);
                System.err.println(
                        "Arithmetic Exception occured : " + cast.getMessage());
            }
        };
    }
}
