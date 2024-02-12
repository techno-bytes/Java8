package com.ashad.interview.stream;

public class Employee {

    private String name;
    private String depart;
    private String gender;

    public Employee(String name, String depart, String gender, double salary) {
        this.name = name;
        this.depart = depart;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private  double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", depart='" + depart + '\'' +
                ", gender='" + gender + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee(String name, String depart, String gender) {
        this.name = name;
        this.depart = depart;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getDepart() {
        return depart;
    }

    public String getGender() {
        return gender;
    }
}
