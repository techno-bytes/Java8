package com.ashad.interview.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Annu", "computer", "F"));
        list.add(new Employee("Aatif", "mech", "M"));
        list.add(new Employee("iqra", "computer", "F"));
        list.add(new Employee("aamir", "electronics", "F"));

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDepart));
        System.out.println("collect >> "+collect);



    }
}
