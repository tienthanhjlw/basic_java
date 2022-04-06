package edu.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void exercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter row number: ");
        int row = sc.nextInt();
        System.out.println("Please enter column number: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        int[][] matrixB = new int[row][column];
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                System.out.println("Please enter element have position [" + x + "][" + y + "]: ");
                matrix[x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < row; x++) {
            System.out.println("");
            for (int y = 0; y < column; y++) {
                if (x == y) {
                    System.out.print(" [ " + matrix[x][y] + " ] ");
                } else {
                    System.out.print(" | " + matrix[x][y] + " | ");
                }
            }
        }
        int min = Math.min(row, column);
        int[] elements = new int[min];
        for (int i = 0; i < min; i++) {
            elements[i] = matrix[i][i];
        }
        System.out.println("");
        System.out.println("The elements on the main diagonal are: " + Arrays.toString(elements));
        System.out.println("Enter element to an other matrix");
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                System.out.println("Please enter element have position [" + x + "][" + y + "]: ");
                matrixB[x][y] = sc.nextInt();
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (int x = 0; x < row; x++) {
            System.out.println("");
            for (int y = 0; y < column; y++) {
                if (x == y) {
                    System.out.print(" [ " + (matrix[x][y] + matrixB[x][y]) + " ] ");
                } else {
                    System.out.print(" | " + (matrix[x][y] + matrixB[x][y]) + " | ");
                }
            }
        }
        System.out.println("");
    }
}
