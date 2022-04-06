package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Hi " + arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Write down length of array: ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Write down item %d: ", i+1);
            numbers[i] = sc.nextDouble();
        }
        System.out.println("Your result is:");
        for (int i = 0; i< n; i++) {
            System.out.print(" " + numbers[i] + ", ");
        }
        System.out.println("Thanks");
        System.out.println("");
        System.out.println("Hello Awesome Function");
        System.out.println("Write down your array lengths: ");
        int sizes = sc.nextInt();
        int[] numberArr = new int[sizes];
        for (int i = 0; i < sizes; i++) {
            System.out.println("Write down item " + i+1 + ":");
            numberArr[i] = sc.nextInt();
        }
        String myText = "Hello Everyone, I am Thanh";
        String[] arrText = myText.split(" ");
        for (String t : arrText) {
            System.out.println(t);
        }
        System.out.println(arrText.toString());
    }
}
