package com.ashad.interview.coforge;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public final  class EmployeeImmutable {

    private final String empName;
    private final String empId;
    private final Date dob;

    private List<Address> address;

    public List<Address> getAddress() {
        return address;
    }

    public EmployeeImmutable(String empName, String empId, Date dob, List<Address> address ) {
        this.empName = empName;
        this.empId = empId;
        this.dob = dob;
        this.address=address;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public Date getDob() {
        return (Date)dob.clone();
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "empName='" + empName + '\'' +
                ", empId='" + empId + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                '}';
    }
}

