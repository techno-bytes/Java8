package com.ashad.interview.generic;

class GenericClass<T> {

    private T things;

    public T getThings() {
        return things;
    }

    public void setThings(T things) {
        this.things = things;
    }
}

class GenericTest{
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setThings("Apple");
        System.out.println(genericClass.getThings());

        GenericClass<Integer> intG = new GenericClass<>();
        intG.setThings(123);
        System.out.println(intG.getThings());
    }
}

