package com.ivanp;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getUserIntegers(7);
        for (int i=0; i <array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }

//        for (int number : array) {
//            System.out.println(number);
//        }

        System.out.println("The average is " + getAverage(array));
    }

    public static int[] getUserIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i <array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
