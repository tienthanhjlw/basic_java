package edu.techmaster;

import java.util.Arrays;

public class Exercise4 {
    public static void exercise() {
        exerciseA();
        exerciseB();
     }

    public static void exerciseA() {
        int number = 0;
        int[] primeNumberArray = {};
        do {
            boolean check = Libary.isPrimeNumber(number);
            if (check) {
                primeNumberArray = Arrays.copyOf(primeNumberArray, primeNumberArray.length + 1);
                primeNumberArray[primeNumberArray.length - 1] = number;
            }
            ++number;
        } while (primeNumberArray.length < 10);
        System.out.println("The first 10 primes are: " + Arrays.toString(primeNumberArray));
    }

    public static void exerciseB() {
        int[] primeNumberArray = {};
        int number = 9;

        do {
            boolean check = Libary.isPrimeNumber(number);
            if (check) {
                primeNumberArray = Arrays.copyOf(primeNumberArray, primeNumberArray.length + 1);
                primeNumberArray[primeNumberArray.length - 1] = number;
            }
            --number;
        } while (number > 0);
        System.out.println("Prime numbers less than 10 are: " + Arrays.toString(primeNumberArray));

    }
}
