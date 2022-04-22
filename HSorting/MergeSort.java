package HSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { -8, 4, -6, 8, 0, 2, -4, 9, 12, -1, 34  };
        arr = split(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] split(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = split(Arrays.copyOfRange(arr, 0, mid));
        int[] right = split(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

        return arr;
    }

}
