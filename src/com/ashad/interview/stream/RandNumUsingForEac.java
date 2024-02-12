package com.ashad.interview.stream;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandNumUsingForEac {

    public static void main(String[] args) {

        Random random = new Random();

        random.ints(1, 10).limit(10).forEach(System.out::println);

//        Stream.iterate(0, r -> random.nextInt(1, 20)).forEach(System.out::println);

    // min
        Integer integer = Stream.of(1, 2, 3, 4, 5, 6, 798)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("integer ==> "+integer);

        Stream.of(1, 2, 3, 4, 5, 6, 798).max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        int[] sd = {1, 2, 3, 4, 5, 6, 798};
        IntStream stream = Arrays.stream(sd);
        int asInt = stream.min().getAsInt();
        System.out.println("asInt ==> "+asInt);
        IntStream stream2 = Arrays.stream(sd);
        int max = stream2.max().getAsInt();
        System.out.println("max ==> "+max);

        List<String> stringList = Arrays.asList("Hello","Interview","Questions","Answers","Ram","for");

        long count = stringList.stream().filter(str -> str.length() > 4).count();
        System.out.println("count= "+count);

        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 798);
        List<Integer> collect = num.stream().map(n -> n * 3).collect(Collectors.toList());
        System.out.println("collect= "+collect);

        // concat

        List<Integer> integerList1 = Arrays.asList(1,2,3,4);
        List<Integer> integerList2 = Arrays.asList(5,6,7);
        List<Integer> collect1 = Stream.concat(integerList1.stream(), integerList2.stream()).collect(Collectors.toList());
        System.out.println("collect1 => "+collect1);

        // duplicate element ion list
        List<Integer> integerList = Arrays.asList(1,2,6,4,1,2,3);
        Set<Integer> intSet = new HashSet<>();
        List<Integer> collect2 = integerList.stream().filter(x -> !intSet.add(x)).collect(Collectors.toList());
        System.out.println("duplicate == > "+collect2);

        //removing duplicate
        List<Integer> duplicateByDistinct = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("duplicateByDistinct =>"+duplicateByDistinct);

        List<Integer> duplicateByGroupBy = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().peek(s-> System.out.println("After Grouping => "+s)).filter(entry -> entry.getValue() > 1)
               .collect(Collectors.toList()).stream().map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("duplicateByGroupBy = > "+duplicateByGroupBy);

        // sum of all number

        List<Integer> integerList23 = Arrays.asList(4,5,6,7,1,2,3);

        int sum = integerList23.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum= "+sum);

        // cube of

        List<Integer> collect3 = integerList23.stream().map(x -> x * x * x)
                .filter(d -> d < 50).collect(Collectors.toList());

        System.out.println("collect3 => "+collect3);


    }
}
