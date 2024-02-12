package com.ashad.ocjp.mock2;

import java.io.FileNotFoundException;
import java.io.IOException;


abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class Q30 {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
            s.m1();
        } catch(FileNotFoundException e) {
            System.out.print("B");
        } catch (IOException e) {
            System.out.print("A");
        } finally {
            System.out.print("C");
        }
    }
}
