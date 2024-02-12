package com.ashad.interview.coforge;

import java.io.*;

public class ExternalizationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p1 = new Person("Aum", 123, "F");
        FileOutputStream fio = new FileOutputStream("Person.ser");
        ObjectOutputStream objOStream = new ObjectOutputStream(fio);
        objOStream.writeObject(p1);
        System.out.println("-------------Serialization  Completed  ------");
        
        FileInputStream fileInputStream = new FileInputStream("Person.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person obj = (Person)objectInputStream.readObject();
        System.out.println("Deserialized Person= "+obj);

    }
}
