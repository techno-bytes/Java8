package com.ashad.ocjp.mock2;


import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));

        System.out.println(list);
    }
}