package com.ashad.interview.coforge;

import java.io.*;

public class SerializationUtils {

    public static Employee deserializeObject(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee = (Employee)objectInputStream.readObject();
        return employee;
    }

    public static void serializeObject(Employee employee, String fileName) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
        objectInputStream.writeObject(employee);
        System.out.println("Object has been written in file= "+fileName);
    }
}
