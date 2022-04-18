package edu.techmaster;

public class Dog {
    public String breed;
    public int age;
    public String color;
    public String size;

    public Dog() {
        System.out.println("CONSTRUCTOR DEFAULT");
    }

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }





    public void eat() {
        System.out.println("EAT");
    }

    public void run() {
        System.out.println("RUN");
    }

    public void sleep() {
        System.out.println("SLEEP");
    }
}
