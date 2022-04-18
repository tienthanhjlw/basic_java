package edu.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise 1");
        System.out.println("Please write down your full name: ");
        String fullName = sc.nextLine();
        System.out.println("After formatted:");
        System.out.println(formatFullName(fullName));
        System.out.println("Exercise 2");
        int[] array = insertArray();
        formatArray(array);
    }

    public static String formatFullName(String fullName) {
        if (fullName.length() > 0) {
            fullName = fullName.toLowerCase();
            fullName = fullName.replaceAll("\\s", " ");
            String[] words = fullName.split(" ");
            String formattedFullName = "";
            for (int i = 0; i < words.length; i++) {
                formattedFullName += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1) + " ";
            }
            return  formattedFullName;
        } else {
            return "";
        }
    }

    public static int[] insertArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your array size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Write down item " + (i+1));
            array[i] = Integer.parseInt(sc.nextLine());
        }
        return array;
    }

    public static void formatArray(int[] array) {
        System.out.print("[");
        for (int number:
             array) {
            System.out.print(number + ", ");
        }
        System.out.println("]");
        System.out.println("After formatted: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                array[i] = array[i] + 1;
            }
        }
        System.out.print("[");
        for (int number:
                array) {
            System.out.print(number + ", ");
        }
    }
}
