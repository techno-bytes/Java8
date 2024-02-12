package com.ashad.ocjp.mock2;


import java.util.ArrayList;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);

        int[] inS = new int[]{};

        List list1 = new ArrayList<String>(); //Line 5
        List<String> list2 = new ArrayList(); //Line 6
//        List<> list3 = new ArrayList<String>(); //Line 7
        List<String> list4 = new ArrayList<String>(); //Line 8
        List<String> list5 = new ArrayList<>(); //Line 9
    }
}