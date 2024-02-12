package com.ashad.interview.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileAndDropWhile {

    public static void main(String[] args) {
        List<String> takeWhile = Stream.iterate("", s -> s + "s")
                .takeWhile(s -> s.length() < 10).collect(Collectors.toList());

        System.out.println("takeWhile => "+takeWhile);

//        List<String> dropWhile = Stream.iterate("", s -> s + "s")
//                .dropWhile(s -> s.length() > 10).collect(Collectors.toList());

        // updated iterator in java 9
        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .dropWhile(x  -> x < 5).forEach(System.out::println);

        // updated iterator in java 9
        Stream.iterate(2, i-> i<20, i-> i+2  ).forEach(System.out::println);

    }
}
