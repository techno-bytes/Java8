package com.ashad.interview.coforge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("New Delhi", "Delhi"));
        addresses.add(new Address("Allahabad", "UP"));
        EmployeeImmutable immutableEmp = new EmployeeImmutable("Annu", "12334",
                new Date(2014,07,14), addresses);

        System.out.println("Before Update= "+immutableEmp);
        List<Address> addressList = immutableEmp.getAddress();
        Address address = addressList.get(0);
        address.setCity("Mumbai");
        System.out.println("After update= "+immutableEmp);

    }
}
