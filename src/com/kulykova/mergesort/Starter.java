package com.kulykova.mergesort;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers without order through Enter");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Now you have unordered array of numbers");
        System.out.println(Arrays.toString(numbers));

        Array array = new Array();
        array.mergeSort(numbers);

        System.out.println("And now you have ordered array of numbers");
        System.out.println(Arrays.toString(numbers));
    }
}
