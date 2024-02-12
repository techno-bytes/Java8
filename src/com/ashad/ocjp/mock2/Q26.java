package com.ashad.ocjp.mock2;

public class Q26 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
        sb.delete(0, 100);
        System.out.println(sb.length());
    }
}
