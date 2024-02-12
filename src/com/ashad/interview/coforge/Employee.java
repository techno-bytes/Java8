package com.ashad.interview.coforge;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable, Cloneable
{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String name;
    private String id;
    private static String salary;

    private static Date dob;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee(String name, String id, String salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


}
