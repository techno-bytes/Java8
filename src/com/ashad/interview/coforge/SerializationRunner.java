package com.ashad.interview.coforge;

import java.io.IOException;

public class SerializationRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        Employee employee = new Employee("Annu", "123", "12321");
        SerializationUtils.serializeObject(employee, "employee.ser");
        System.out.println("--------------------------------Object has been serialized -----");

        Employee employee1 = SerializationUtils.deserializeObject("employee.ser");
        System.out.println("deserialized object= "+employee1);

        System.out.println("Before cloned= "+System.identityHashCode(employee1));

        System.out.println("After cloned= "+System.identityHashCode(employee1.clone()));
    }
}
