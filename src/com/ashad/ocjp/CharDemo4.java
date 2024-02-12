package com.ashad.ocjp;

import java.sql.SQLOutput;

public class CharDemo4 {

    int x= 0;
    public static void main(String[] args) {

        int x = 5;
        int x1 =23;
        {
            int x12 = 16;
            {
                int x13 =23;
                {
                    int x14 =23;
                }
            }
        }
        char char1 = 'A';
        char CharNum = '1';

        System.out.println("IS digit= "+Character.isDigit(CharNum));
        System.out.println("IS Character= "+Character.isLetter(char1));

        char ds = 65;

        int int1 = ds+3;

        char myChar = (char)int1;

        System.out.println("Char = "+ds);
        System.out.println("int1 = "+int1);
        System.out.println("myChar = "+myChar);
    }
}
