package edu.techmaster;

import java.util.ArrayList;

public class StreamAPISample {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.println(i));
        list.stream().filter(item -> item % 2 == 0).forEach(item -> System.out.print(item));
        long count = list.stream().filter(item -> item % 3 == 0).count();
        System.out.println("Total device for 3: " + count);

    }
}
