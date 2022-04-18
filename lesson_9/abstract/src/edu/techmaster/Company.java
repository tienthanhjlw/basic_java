package edu.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Company {
    public ArrayList<Employee> getAllEmployee() {
        return this.generateEmployee();
    }

    public ArrayList<Employee> generateEmployee() {
        String[] names = {"Thanh", "Nguyen", "Hai", "Viet", "Manh", "Anh"};
        String[] address = {"Hanoi", "Hai Phong", "Lao Cai", "Da Nang", "Binh Phuoc", "Dong Nai"};
        ArrayList<Employee> allEmployee = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            LocalDate dob = LocalDate.now().plusDays(random.nextInt(100));
            Developer dev = new Developer(
                    i*3+2,
                    names[random.nextInt(6)],
                    dob,
                    address[random.nextInt(6)],
                    (byte) random.nextInt(2),
                    "0912342615",
                    "tienthanh.jlw@gmail.com",
                    11000000,
                    10
            );
            allEmployee.add(dev);
        }
        return allEmployee;
    }
}
