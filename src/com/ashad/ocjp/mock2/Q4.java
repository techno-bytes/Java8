package com.ashad.ocjp.mock2;


import java.util.function.Predicate;

public class Q4 {
    public static void main(String[] args) {
        String [] arr = {"*", "**", "***", "****", "*****"};
//       Predicate pr1 = s -> s.length() < 4; // compilation error
//        print(arr, pr1);
    }

    private static void print(String [] arr, Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}
