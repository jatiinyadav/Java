package JRecursion.MustDoProblems;

import java.util.Arrays;

public class GBubbleSortRecursion {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 9, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            bubble(arr, 0);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr, int ind) {

        if (ind == arr.length - 1) {
            return;
        }

        if (arr[ind] > arr[ind + 1]) {
            int temp = arr[ind];
            arr[ind] = arr[ind + 1];
            arr[ind + 1] = temp;
        }

        bubble(arr, ind + 1);

    }
}
