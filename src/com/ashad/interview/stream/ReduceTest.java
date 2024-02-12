package com.ashad.interview.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);

        System.out.println("result => "+result);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum= "+sum);
        Integer collectSum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("collect sum => "+collectSum);

        Integer reduce = numbers.stream().reduce(0, (s, next) -> s + next);
        System.out.println("reduce sum => "+reduce);

        // sum from String
        String string = "Item1 10 Item2 25 Item3 30 Item4 45";

        Integer sumFromString = Arrays.stream(string.split(" "))
                .filter((s) -> s.matches("\\d+"))
                .peek(d-> System.out.println("filtered value "+d))
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("sumFromString = "+sumFromString);
    }
}
