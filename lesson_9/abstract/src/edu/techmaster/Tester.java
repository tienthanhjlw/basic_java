package edu.techmaster;

import java.time.LocalDate;

public class Tester extends Employee {
    public int bug;
    public Tester(int id, String name, LocalDate dob, String address, Byte gender, String mobile, String email, int salary, int bug) {
        super(id, name, dob, address, gender, mobile, email, salary);
        this.bug = bug;
    }

    @Override
    public int salary() {
        return 0;
    }
}
