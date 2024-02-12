package com.ashad.poc.core.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String11NewFeature {
    public static void main(String[] args) {
        String msg = "This is line delimited String \n String  Lines method lines \n Hey Anu!!";
        Stream<String> lines = msg.lines();
        List<String> list = lines.filter(line -> !line.isBlank()).map(String::strip).collect(Collectors.toList());
        System.out.print("list >> "+list);
    }
}
