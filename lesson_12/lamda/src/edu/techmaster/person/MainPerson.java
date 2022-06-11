package edu.techmaster.person;

import java.util.ArrayList;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Thanh", 2));
        people.add(new Person("Nguyen", 7));
        people.add(new Person("Thanh", 5));
        people.add(new Person("Thanh", 10));


        people.stream()
                .sorted((item1, item2) -> item1.getAge() > item2.getAge() ? 1 : 0)
                .forEach(
                System.out::println
                );
    }
}
