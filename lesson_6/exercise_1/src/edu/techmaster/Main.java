package edu.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person();
        person1.name = "Thanh";
        person1.age = 20;
        person1.address = "Ha Noi";
        System.out.println(person1);
        Person person2 = new Person();
        person2.name = "An";
        person2.age = 8;
        person2.address = "Ha Noi";
        Dog puddle = new Dog();
        puddle.breed = "Puddle";
        puddle.age = 3;
        puddle.color = "Yellow";
        puddle.size = "small";
        puddle.eat();
        Dog grass = new Dog("Co", 2, "Yellow");
        System.out.println(grass.breed + " " + grass.age + " " + grass.color);
    }
}
