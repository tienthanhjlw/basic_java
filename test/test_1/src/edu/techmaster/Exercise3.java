package edu.techmaster;

import java.util.Random;

public class Exercise3 {
    public static void exercise() {
        Random rand = new Random();
        int number = rand.nextInt(101);
        boolean isPrime = Libary.isPrimeNumber(number);
        if (isPrime) {
            System.out.println(number + " is a prime number!");
        } else {
            System.out.println(number + " isn't a prime number!");
        }
    }
}
