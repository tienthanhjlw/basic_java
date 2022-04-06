package edu.techmaster;

import java.util.Arrays;

public class Exercise2 {
    public static void exercise() {
        String text = "You only live once, but if you do it right, once is enough";
        System.out.println("Lengths of text are " + text.length() + " characters.");
        String[] textArray = text.split("");
        int totalO = 0;
        int[] index = {};
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals("o")) {
                totalO += 1;
                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }
        System.out.println("Text have " + totalO + " characters. And index of the characters 'o' are: " + Arrays.toString(index));
    }
}
