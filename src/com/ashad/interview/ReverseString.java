package com.ashad.interview;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("ANUM ASHAD"));
    }

    static public String reverse(String input){

        char[] chars = input.toCharArray();
        String str = "";
        for(int i= chars.length -1 ; i>=0; i--){
            str += chars[i];
        }

        return str;
    }
}
