package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String name = "Nguyen Tien Thanh";
        System.out.println(name);
        String fullName = new String("Nguyen Tien Thanh");
        System.out.println(fullName);

        Season winter = Season.WINTER;
        System.out.println(winter);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate customsDate = LocalDate.of(2022, 2, 17);
        System.out.println(customsDate);
        System.out.println(customsDate.getMonthValue());
        LocalDateTime customsDateTime = LocalDateTime.now();
        System.out.println(customsDateTime);
        LocalDateTime begin = LocalDateTime.of(0, 1, 1, 0, 0,0);
        System.out.println(begin);
        String format = "dd/MM/yyyy, HH:mm";
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern(format);
        String formatToday = customsDateTime.format(myFormat);
        System.out.println(formatToday);
        DateTimeFormatter formatDay = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("-------------------------------");
        String birthDay = LocalDate.of(1992, 2, 17).format(formatDay);
        System.out.println("I am Thanh, my birth day is " + birthDay);

    }
}
