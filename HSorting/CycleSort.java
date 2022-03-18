package HSorting;

import java.util.Arrays;

// If the range is [0, n] : int correct = arr[start]
// If the range is [1, n] : int correct = arr[start] - 1

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 4, 3, 6 };
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int correct = arr[start] - 1;

            if (arr[start] != arr[correct]) {
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            } else {
                start++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
