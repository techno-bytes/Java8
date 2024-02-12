package com.ashad.interview.generic;

public interface GenericInterface<T1, T2> {

    T1 doSomeOperation(T1 t1);
    T2 doReverseOperation(T2 t1);
}

class GenericImTest implements GenericInterface<String, Integer>{

    public static void main(String[] args) {

    }

    @Override
    public String doSomeOperation(String o) {
        return "Generic test";
    }

    @Override
    public Integer doReverseOperation(Integer t1) {
        return 123;
    }

}
