package com.ashad.interview.stream;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        String input = "Java articles are Awesome";
// first non repeated
//        input.chars().mapToObj(c -> Character.valueOf((char) c))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() == 1)
//                .map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

        // first repeated

        input.chars().mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()  > 1)
                .map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);

    }
}
