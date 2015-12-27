package com.kulykova.mergesort;

public class Array {
    int[] numbers;
    int[] temp;

    public void mergeSort(int[] numbers) {
        this.numbers = numbers;
        temp = new int[numbers.length];
        divide(0, numbers.length - 1);
    }

    private void divide(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            divide(low, mid);
            divide(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        System.arraycopy(numbers, low, temp, low, high - low + 1);

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                numbers[k] = temp[i];
                i++;
            } else {
                numbers[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            numbers[k] = temp[i];
            k++;
            i++;
        }
    }
}
