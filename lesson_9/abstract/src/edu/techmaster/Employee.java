package edu.techmaster;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {
    public int id;
    public String name;
    public LocalDate dob;
    public String address;
    public Byte gender;
    public String mobile;
    public String email;
    public int salary;

    public Employee(int id, String name,LocalDate  dob, String address, Byte gender, String mobile, String email, int salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.salary = salary;
    }

    public abstract int salary();

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
