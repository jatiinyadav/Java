package HSorting;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        // int[] arr = { 2, 5, 1, -8, 14, 6 };
        int[] arr = { 9 };
        int[] ans = sortedArray(arr, arr.length - 1, maxNumber(arr, arr.length - 1));

        System.out.println(Arrays.toString(ans));

        if (arr.length < 2) {
            System.out.println("arr must contain at least 2 elements");
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println(arr[i]);
                break;
            }
        }

    }

    static int[] sortedArray(int[] arr, int end, int max) {

        if (end == 0) {
            return arr;
        }

        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;

        return sortedArray(arr, --end, maxNumber(arr, end));

    }

    static int maxNumber(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

}