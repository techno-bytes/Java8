package com.ashad.ocjp.mock2;

public class Q67 {

    public static void main(String [] args) {
        int a = 2;
        boolean res = false;
        res = a++ == 2 || --a == 2 && --a == 2;
//        System.out.println(a);
        System.out.println(recurssionFact(2));
        System.out.println(recurssionFact(3));
        System.out.println(recurssionFact(4));

        System.out.println("------------------------------");

     System.out.println(fact(2));
        System.out.println(fact(3));
        System.out.println(fact(4));


    }


     static int fact(int number){
        int result = 1;
        for(int i=1; i<=number; i++){
            result = result*i;
        }
        return result;
     }

    static int recurssionFact(int number){
        if(number == 0){
            return 1;
        }
        return number*recurssionFact(number -1);
    }
}