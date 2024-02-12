package com.ashad.interview.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NthHighestSalary {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();

        map.put("A", 10200);
        map.put("B", 12000);
        map.put("C", 21000);
        map.put("D", 10003);
        map.put("E", 10200);
        map.put("F", 10400);

        Map.Entry<String, Integer> stringIntegerEntry = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toList()).get(1);
//        System.out.println("limit ==> "+limit.f);
        System.out.println(stringIntegerEntry);
    }
}
