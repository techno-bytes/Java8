package com.ashad.interview.top20;

import java.util.Scanner;

public class g {

        public static void main (String[]args)
        {
            System.out.println("Java program to check given character is digit or not");
            Scanner sc = new Scanner (System.in);
            System.out.println ("Please enter a character");
            char ch = sc.next ().charAt (0);
            if(ch>='0' && ch<='9')
            {
                System.out.println("Given Character is Digit.");
            }
            else
            {
                System.out.println("Given Character is Not Digit.");
            }

        }

}
