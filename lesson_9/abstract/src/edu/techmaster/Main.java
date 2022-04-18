package edu.techmaster;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    private String name;
    public static final double PI = 3.14;
    public enum SIZE {
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        byte a1 = 2;
        byte a2 = 127;
        Company company = new Company();
        ArrayList<Employee> developers = company.getAllEmployee();
        for (Employee employee : developers) {
            System.out.println(employee);
        }
        System.out.println(Integer.valueOf(a1&a2));
        char[] chars = {'H', 'e', 'l', 'l', '0'};
        String string = new String(chars);
        System.out.println(string);
        String name = "Nguyen Tien Thanh";
        System.out.println(name);
        System.out.println(name.chars());
        System.out.println(name.concat(string));
        System.out.println(name.hashCode());
        System.out.println(name.indent(3));
        System.out.println(name.repeat(3));
        System.out.println("Nguyen Tien Thanh".equals(name));
        System.out.println(PI);
        SIZE size = SIZE.MEDIUM;
        switch (size) {
            case SMALL:
                System.out.println("Is small");
                break;
            case MEDIUM:
                System.out.println("Is medium");
                break;
            case LARGE:
                System.out.println("Is large");
                break;
        }
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);
        LocalDate dob = LocalDate.of(1992, Month.FEBRUARY, 17);
        System.out.println(dob);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dob.format(dateFormat));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
