package com.ashad.interview.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ChararcterCounts {

    public static void main(String[] args) {

        Map<String, Long> collect = Arrays.stream("ChararcterCounts".split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("collect => " + collect);
    }
    }

