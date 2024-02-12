package com.ashad.interview.coforge;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {

    private String name;
    private int id;
    private String gender;

    public Person(String name, int id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Person() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String)in.readObject();
        id = in.readInt();
        System.out.println("Person id= "+id+" and name= "+name);
    }
}
