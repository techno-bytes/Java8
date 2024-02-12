package com.ashad.ocjp.mock2;


public class Q48 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = "James" + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }
}
