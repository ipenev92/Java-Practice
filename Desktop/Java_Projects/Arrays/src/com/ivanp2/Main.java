package com.ivanp2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getUserIntegers(5);

        System.out.println("Sorting:");
        sortIntegers(array);
    }


    public static int[] getUserIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i <array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static void sortIntegers(int[] array) {
        Arrays.sort(array);

        for (int number : array) {
            System.out.println(number);
        }
    }
}
