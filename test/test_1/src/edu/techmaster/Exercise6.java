package edu.techmaster;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6 {
    public static void exercise() {
        Scanner sc = new Scanner(System.in);
        boolean checkEmail = false;
        boolean checkTel = false;
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String PHONE_PATTERN = "^[0-9]{9,11}$";
        do {
            System.out.println("Please enter your email: ");
            String email = sc.nextLine();
            checkEmail = Pattern.matches(EMAIL_PATTERN, email.trim());
            if (!checkEmail) {
                System.out.println("Your email is not valid");
            } else {
                System.out.println("Your email is valid");
            }
        } while (!checkEmail);
        do {
            System.out.println("Please enter your phone: ");
            String phone = sc.nextLine();
            checkEmail = Pattern.matches(PHONE_PATTERN, phone.trim());
            if (!checkEmail) {
                System.out.println("Your phone is not valid");
            } else {
                System.out.println("Your phone is valid");
            }
        } while (!checkEmail);

    }
}
