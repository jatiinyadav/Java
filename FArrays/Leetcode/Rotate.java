package FArrays.Leetcode;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int start, int end) {

        int mid = start + (end - start) / 2;

        while (start <= mid) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
