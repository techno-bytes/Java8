package com.ashad.interview.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekTest {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("one", "two", "three", "four");

        stream.filter(n-> n.length() > 3).peek(p-> System.out.println("Filter value =>> "+p)).
                map(String::toUpperCase).peek(p-> System.out.println("Mapped Value == > "+p))
                .collect(Collectors.toList());

    }
}
