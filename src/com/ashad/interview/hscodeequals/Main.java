package com.ashad.interview.hscodeequals;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(2);
        e1.setName("john");

        e2.setId(2);
        e2.setName("john");

        System.out.println("shallow compare = "+(e1==e2));
        System.out.println("deap compare = "+ e1.equals(e2));

//        Exception e = new Exception("DDD0");
//        e.initCause("Cause of issue", null);
    }
}
