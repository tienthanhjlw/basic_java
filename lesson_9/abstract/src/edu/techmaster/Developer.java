package edu.techmaster;

import java.time.LocalDate;


public class Developer extends Employee {
    public int ot;

    public Developer(int id, String name, LocalDate dob, String address, Byte gender, String mobile, String email, int salary, int ot) {
        super(id, name, dob, address, gender, mobile, email, salary);
        this.ot = ot;
    }

    @Override
    public int salary() {
        return 0;
    }
}
