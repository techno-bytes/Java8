package com.ashad.ocjp.mock2;

public class Q10 {
    private static boolean flag = !true;

    public static void main(String [] args) {
        System.out.println(!flag ? args[0] : args[1]);

        String s1 = "OcA";
        String s2 = "oCa";
        System.out.println(s1.equals(s2));
    }
}
