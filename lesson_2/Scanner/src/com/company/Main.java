package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down your name:");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Write down your age:");
        int ages = Integer.parseInt(scanner.nextLine());
        System.out.println("Your age is " + ages);
        System.out.println("Write down your address");
        String address = scanner.nextLine();
        System.out.println("Your address is " + address);


    }
}
