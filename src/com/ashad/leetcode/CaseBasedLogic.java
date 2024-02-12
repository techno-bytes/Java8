package com.ashad.leetcode;

import java.util.Scanner;

public class CaseBasedLogic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            String result = "";
            switch (firstNumber) {
                case 1:
                    result = isOdd(secondNumber) ? "Even" : "Odd";
                    break;
                case 2:
                    result = isPrime(secondNumber) ? "PRIME" : "COMPOSITE";
                    break;
                case 3:
                    result = isPelindrome(secondNumber) ? "Even" : "Odd";
                    break;
            }

        }
    }

    private static boolean isPrime(int secondNumber) {
        boolean isPrime = false;
            for(int i=1;  i< secondNumber/2; i++) {
                if(secondNumber % i != 0) {
                    isPrime = true;
                    break;
                }
            }
            return isPrime;
    }

    private static boolean isPelindrome(int secondNumber) {

        return false;
    }

    private static boolean isOdd(int secondNumber) {
        return secondNumber%2 == 0;
    }
}
