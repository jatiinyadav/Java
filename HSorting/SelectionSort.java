package HSorting;

import java.util.Arrays;

// /The worst case will be O(n^2)
// The best case will also be O(n^2)
//  Because we are finding the greatest element in the array
// It is not stable
// Use case is: It perform well in small lists/arrays

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 9, 5, 8, 1, 7, 3 };
        selectionSort(arr, arr.length, maxNumber(arr, arr.length));
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int end, int max) {

        if (end == 0) {
            return;
        }

        int temp = arr[end - 1];
        arr[end - 1] = arr[max];
        arr[max] = temp;

        selectionSort(arr, --end, maxNumber(arr, end));
    }

    static int maxNumber(int[] arr, int end) {
        int max = 0;

        for (int i = 0; i <= end - 1; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

}
