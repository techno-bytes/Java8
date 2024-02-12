package com.ashad.ocjp.mock2;


import java.util.ArrayList;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null));
        System.out.println(list);
    }
}