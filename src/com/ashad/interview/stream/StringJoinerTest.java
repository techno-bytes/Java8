package com.ashad.interview.stream;

import java.util.StringJoiner;

public class StringJoinerTest {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("|", "*", "$$");

        stringJoiner.add("Annu");
        stringJoiner.add("PlayGroup");
        stringJoiner.add("GrowBig");

        System.out.println("stringJoiner => "+stringJoiner);

    }
}
