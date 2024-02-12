package com.ashad.interview.coforge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInList {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,4,6,2,3,8,0,8);
        List<Integer> duplicateNumbers = numbers.stream().collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().
                filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("duplicateNumbers= "+duplicateNumbers);

        List<Integer> topThreeNumber = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println("topThreeNumber= "+topThreeNumber);

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 3, 9, 10);
        Set<Integer> unique = new HashSet<>();
        List<Integer> collect = num.stream().filter(n -> !unique.add(n)).collect(Collectors.toList());
        System.out.println("Duplicate= "+collect);

    }
}
