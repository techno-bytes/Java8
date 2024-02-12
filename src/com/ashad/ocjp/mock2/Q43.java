package com.ashad.ocjp.mock2;

class Student {
    String name;
    int age;

    Student() {
//        Student("James", 25); // compilation error can't call constructor as method
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Q43 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}