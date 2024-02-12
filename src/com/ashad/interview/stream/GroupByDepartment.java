package com.ashad.interview.stream;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDepartment {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("Alice", "HR", "F", 50000));
            employeeList.add(new Employee("Bob", "IT", "F", 60000));
            employeeList.add(new Employee("Charlie", "Finance", "F", 55000));
            employeeList.add(new Employee("David", "IT", "F", 70000));
            employeeList.add(new Employee("Eva", "HR", "F", 45000));
            employeeList.add(new Employee("Frank", "Finance", "F", 58000));

        Map<String, Optional<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepart, Collectors.maxBy(
                Comparator.comparingDouble(Employee::getSalary))));

        System.out.println("collect  => "+collect);
    }
    }

